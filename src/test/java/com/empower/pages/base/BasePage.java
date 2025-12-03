package com.empower.pages.base;

import com.empower.pages.IndividualsPage;
import io.percy.selenium.Percy;
import com.empower.components.FooterComponent;
import com.empower.components.MobileHeaderComponent;
import com.empower.components.DesktopHeaderComponent;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasePage extends BaseModel{

    public BasePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".onetrust-close-btn-handler.onetrust-close-btn-ui")
    private WebElement closeButtonCookieBanner;

    @FindBy(css = "button[data-emp-carousel='playpause']")
    private WebElement heroCarousel;

    @FindBy(css = "h2.h-10")
    private WebElement hamburgerHeadingText;

    @FindBy(css = ".mobile-contextual-nav [role='menuitem']")
    private List<WebElement> hamburgerContextualMenuLinks;

    @FindBy(css = ".mobile-nav-primary-menu")
    private List<WebElement> hamburgerPrimaryMenuLinks;

    @FindBy(css = "a[aria-label='Go to the Empower homepage']")
    private WebElement footer;

    @FindBy(css = "h1")
    private WebElement header;

    @FindBy(css = ".stacked-logo")
    private WebElement empowerLogo;

//    @FindBy(css = "[data-once='nav-main-login-register-link click-primary-button empulsify-button-ripple']")
//    private WebElement openAccountHeaderButton;

    @FindBy(css = "li a[data-once='nav-main-contextual-link-click']")
    private List<WebElement> contextualMenuLinks;

    @FindBy(css = "button[data-once*='desktopPrimaryNav']")
    private List<WebElement> primaryMenuLinks;


    //    @Step("Get mobile header")
    public MobileHeaderComponent getMobileHeader() {
        return new MobileHeaderComponent(getDriver());
    }

    //    @Step("Navigate to footer")
    public FooterComponent getFooter() {
        return new FooterComponent(getDriver());
    }

    //    @Step("Navigate to menu")
    public DesktopHeaderComponent getDesktopHeader() {
        return new DesktopHeaderComponent(getDriver());
    }


    public IndividualsPage pauseHeroCarousel() {
        safeClick(heroCarousel);

        return new IndividualsPage(getDriver());
    }

    //    @Step("Close cookie banner")
    public IndividualsPage closeCookieBanner() {
//        Utils.log("4a. Close cookie banner");

        try {
            WebElement cookieBanner = wait10UntilVisible(closeButtonCookieBanner);
            if (cookieBanner.isDisplayed()) {
                closeButtonCookieBanner.click();
                getWait10().until(ExpectedConditions.invisibilityOfElementLocated(By.id("onetrust-banner-sdk")));
            }

//            new Actions(getDriver())
//                    .moveToElement(closeButtonCookieBanner)
//                    .pause(Duration.ofMillis(500)) // small pause can help with overlays or animations
//                    .click()
//                    .perform();

//            getWait10().until(ExpectedConditions.invisibilityOfElementLocated(By.id("onetrust-banner-sdk")));
        } catch (TimeoutException e) {
//            Utils.log("Cookie banner didn't appear — skip");
        }

        return new IndividualsPage(getDriver());
    }

    public <T> T closeCookieBanner(Class<T> pageClass) {
        try {
            WebElement cookieBanner = wait10UntilVisible(closeButtonCookieBanner);
            if (cookieBanner.isDisplayed()) {
                closeButtonCookieBanner.click();
                getWait10().until(ExpectedConditions.invisibilityOfElementLocated(By.id("onetrust-banner-sdk")));
            }
        } catch (TimeoutException e) {
            // banner didn't appear — ignore
        }

        try {
            // assume all page objects have a constructor(WebDriver driver)
            return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(getDriver());
        } catch (Exception e) {
            throw new RuntimeException("Could not create page: " + pageClass.getSimpleName(), e);
        }
    }

    public void safeClick(WebElement button) {
        try {
//            getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
            wait10UntilClickable(button).click();
            Thread.sleep(5000);

            new WebDriverWait(getDriver(), Duration.ofSeconds(30))
                    .until(d -> "complete".equals(
                            ((JavascriptExecutor) d).executeScript("return document.readyState")
                    ));

        } catch (TimeoutException | InterruptedException e) {
            System.out.println("Timeout after 30s — stopping page load.");
            ((JavascriptExecutor) getDriver()).executeScript("window.stop();");
        } finally {
//            try {
//                getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//            } catch (Exception ex) {
//                System.out.println("Failed to reset page load timeout.");
//            }
        }
    }

    public void safeClickBy(By locator) {
        try {
//            getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            ByWait10UntilClickable(locator).click();
            Thread.sleep(3000);

            new WebDriverWait(getDriver(), Duration.ofSeconds(30))
                    .until(d -> "complete".equals(
                            ((JavascriptExecutor) d).executeScript("return document.readyState")
                    ));

        } catch (TimeoutException | InterruptedException e) {
            System.out.println("Timeout after 10s — stopping page load.");
            ((JavascriptExecutor) getDriver()).executeScript("window.stop();");
        } finally {

        }
    }

    public Boolean isUrlChangedOn(String url) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlContains(url));
    }

    public String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }

    //    @Step("Get heading text of Hamburger menu")
    public String getHamburgerHeadingText() {
        return wait10UntilVisible(hamburgerHeadingText).getText().trim();
    }

    //    @Step("Get all links of hamburger Contextual menu")
    public List<String> getHamburgerContextualMenuLinks() {
        return wait10UntilVisibleAll(hamburgerContextualMenuLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

    //    @Step("Get all links of hamburger Contextual menu")
    public List<String> getHamburgerPrimaryMenuLinks() {
        return wait10UntilVisibleAll(hamburgerPrimaryMenuLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

    //    @Step("Scroll down to the page")
    public BasePage scrollToBottom() {

//        new Actions(getDriver())
//                .moveToElement(footer)
//                .pause(Duration.ofMillis(2000))
//                .perform();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        int footerY = footer.getLocation().getY();
//
//        for (int i = 0; i < footerY; i += 100) {
//            js.executeScript("window.scrollBy(0, 100)");
//        }
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'end'});", footer);

        return this;
    }

    //    @Step("Scroll up to the page")
    public BasePage scrollToUp() {

//        new Actions(getDriver())
//                .moveToElement(header)
//                .perform();

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        int headerY = header.getLocation().getY();
//
//        for (int i = 0; i < headerY; i += 100) {
//            js.executeScript("window.scrollBy(0, -100)");
//        }
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'start'});", header);

        return this;
    }

    //    @Step("Is mobile header shrink?")
    public boolean isMobileHeaderShrink() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(30))
                .until(driver -> driver.findElement(By.id("main-header-nav"))
                        .getAttribute("style")
                        .contains("translateY(-100%)"));
    }

    //    @Step("Is mobile header expand?")
    public boolean isMobileHeaderExpand() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(30))
                .until(driver -> driver.findElement(By.id("main-header-nav"))
                        .getAttribute("style")
                        .contains("translateY(0%)"));
    }

    //    @Step("Is header shrink?")
    public boolean isHeaderShrink() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(30))
                .until(driver -> driver.findElement(By.id("main-header-nav"))
                        .getAttribute("style")
                        .contains("height: 60px"));
    }

    //    @Step("Is header expand?")
    public boolean isHeaderExpand() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(30))
                .until(driver -> driver.findElement(By.id("main-header-nav"))
                        .getAttribute("style")
                        .contains("height: 90px"));
    }

    //    @Step("Click Empower logo")
    public IndividualsPage clickEmpowerLogo() {
//        wait10UntilClickable(empowerLogo).click();
        safeClick(empowerLogo);
        return new IndividualsPage(getDriver());
    }

////    @Step("Click Open account button on the header")
//    public OnBoardingPage clickOpenAccountHeaderButton() {
//        wait10UntilClickable(openAccountHeaderButton).click();

    /// /        safeClick(openAccountHeaderButton);
//        return new OnBoardingPage(getDriver());
//    }

//    @Step("Get all links of Contextual menu")
    public List<String> getContextualMenuLinks() {
        return wait10UntilVisibleAll(contextualMenuLinks).stream()
                .map(WebElement::getText)
                .map(text -> text.replaceAll("[\\u200B-\\u200D\\uFEFF]", "").trim())
                .toList();
    }

    //    @Step("Get all links of Primary menu")
    public List<String> getPrimaryMenuLinks() {
        return wait10UntilVisibleAll(primaryMenuLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

    public void takePercyFullPageScreenshot(WebDriver driver, String name, String testCaseName) {

        // Ensure Selenium won't timeout our async JS earlier than our own deadline
//        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(70));


        // Wait for DOM to settle (simple example)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(d -> ((JavascriptExecutor) d).executeScript("return document.readyState==='complete'").equals(true));

        scrollToBottom();
//        scrollToUp();
        // 2) Wait for an animation element to exist, then seek & pause to a deterministic frame
//        new WebDriverWait(driver, Duration.ofSeconds(60)).until(d ->
//                (Boolean) ((JavascriptExecutor) d).executeScript(
//                        "return !!document.querySelector('lottie-player,[data-lottie],svg');"));

//        ((JavascriptExecutor) driver).executeScript(
//                // Lottie web component
//                "document.querySelectorAll('lottie-player').forEach(p=>{try{p.seek(120);p.pause();}catch(e){}});" +
//                        // Lottie via bodymovin
//                        "if(window.bodymovin && window.bodymovin.getRegisteredAnimations){" +
//                        "  window.bodymovin.getRegisteredAnimations().forEach(a=>{try{a.goToAndStop(120,true);}catch(e){}});" +
//                        "}" +
//                        // Inline SVG: force layout so first frame is painted
//                        "var s=document.querySelector('svg'); if(s && s.getBBox){ try{s.getBBox();}catch(e){} }"
//        );

        // 3) Percy options (do NOT hide lottie/video)
        Percy percy = new Percy(driver);
        Map<String, Object> options = new HashMap<>();
//        options.put("testCase", testCaseName);
        options.put("fullPage", true);                 // stitch full page (split if page is extremely tall)
        options.put("widths", java.util.Arrays.asList(1920)); // desktop only; ignored on real devices
        options.put("minHeight", 1080);
        options.put("percyCSS",
                // Freeze generic CSS motion but keep animations visible
                "*,*::before,*::after{animation:none!important;transition:none!important}" +
                        // keep lottie visible:
                        " lottie-player,[data-lottie-player]{visibility:visible!important}" +
                        // hide noisy UI only:
                        " #onetrust-banner-sdk,.ot-sdk-container,[aria-label*='cookie']{display:none!important}" +
                        " .toast,.snackbar{display:none!important}"
        );

        try {
            wait.pollingEvery(Duration.ofMillis(250));
            wait.ignoring(org.openqa.selenium.JavascriptException.class); // tolerate transient JS errors

            wait.until(d -> Boolean.TRUE.equals(
                    ((JavascriptExecutor) d).executeScript(
                            "const ps=[...document.querySelectorAll('lottie-player')];" +
                                    "const bm=(window.bodymovin&&window.bodymovin.getRegisteredAnimations?" +
                                    "          window.bodymovin.getRegisteredAnimations():[]);" +
                                    // Ready if each <lottie-player> exposes an instance OR any bodymovin animations exist
                                    "const lottieReady=(ps.length===0)||ps.every(p=>{try{return !!p.getLottie();}catch(e){return false;}})||bm.length>0;" +
                                    // Touch SVG to force layout once present; ready if none present or getBBox succeeds
                                    "let svgReady=true; const svgs=[...document.querySelectorAll('svg')];" +
                                    "if (svgs.length){ try{ svgs[0].getBBox && svgs[0].getBBox(); }catch(e){ svgReady=false; } }" +
                                    "return lottieReady && svgReady;"
                    )
            ));
        } catch (org.openqa.selenium.TimeoutException te) {
            System.out.println("Timed out (30s) waiting for Lottie/SVG readiness. Proceeding.");
        } catch (org.openqa.selenium.JavascriptException je) {
            System.out.println("JS error during readiness check: " + je.getMessage());
        } catch (RuntimeException re) {
            System.out.println("Unexpected error during readiness check: " + re.getMessage());
        }

        percy.screenshot(name, options);
    }

    public void takePercyShortPageScreenshot(WebDriver driver, String name) {
//        PercySDK.screenshot(driver, name);

        // Wait for DOM to settle (simple example)
        new WebDriverWait(driver, Duration.ofSeconds(8))
                .until(d -> ((JavascriptExecutor) d).executeScript("return document.readyState==='complete'").equals(true));


        Percy percy = new Percy(driver);
        Map<String, Object> options = new HashMap<>();

        options.put("widths", Arrays.asList(1920));
        options.put("minHeight", 1080);
//        options.put("fullPage", true);
        options.put("percyCSS",
                "*,*::before,*::after{animation:none!important;transition:none!important}" +
                        " lottie-player,.lottie,[data-lottie],video{visibility:hidden!important}" +
                        " #onetrust-banner-sdk,.ot-sdk-container,[aria-label*='cookie']{display:none!important}" +
                        " .toast,.snackbar{display:none!important}"
        );

        percy.screenshot(name, options);
    }
}
