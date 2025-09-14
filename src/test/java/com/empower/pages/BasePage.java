package com.empower.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class BasePage {
    private final WebDriver driver;
    private WebDriverWait wait10;
    private WebDriverWait wait3;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    protected WebDriverWait getWait10() {
        if (wait10 == null) {
            wait10 = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        return wait10;
    }

    protected WebDriverWait getWait3() {
        if (wait3 == null) {
            wait3 = new WebDriverWait(driver, Duration.ofSeconds(3));
        }

        return wait3;
    }

    protected WebElement wait10UntilVisible(WebElement element) {
        return getWait10().until(ExpectedConditions.visibilityOf(element));
    }

    protected WebElement wait3UntilVisible(WebElement element) {
        return getWait3().until(ExpectedConditions.visibilityOf(element));
    }

    protected WebElement ByWait10UntilClickable(By element) {
        return getWait10().until(ExpectedConditions.elementToBeClickable(element));
    }

    protected WebElement wait10UntilClickable(WebElement element) {
        return getWait10().until(ExpectedConditions.elementToBeClickable(element));
    }

    protected List<WebElement> wait10UntilVisibleAll(List<WebElement> elements) {
        return getWait10().until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    protected WebElement ByWait10UntilVisible(By element) {
        return getWait10().until(ExpectedConditions.visibilityOfElementLocated(element));
    }


    @FindBy(css = ".onetrust-close-btn-handler.onetrust-close-btn-ui")
    private WebElement closeButtonCookieBanner;

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

    @FindBy(xpath = "//header//span[text()='Open an account']")
    private WebElement openAccountHeaderButton;

    @FindBy(css = "li a[data-once='nav-main-contextual-link-click']")
    private List<WebElement> contextualMenuLinks;

    @FindBy(css = "button[data-once*='desktopPrimaryNav']")
    private List<WebElement> primaryMenuLinks;


//    @Step("Get mobile header")
    public HamburgerComponent getMobileHeader() {
        return new HamburgerComponent(getDriver());
    }

//    @Step("Navigate to footer")
    public FooterComponent getFooter() {
        return new FooterComponent(getDriver());
    }

//    @Step("Navigate to menu")
    public HeaderComponent getHeader() {
        return new HeaderComponent(getDriver());
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

    public void safeClick(WebElement button) {
        try {
//            getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
            wait10UntilClickable(button).click();
            Thread.sleep(2000);

            new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                    .until(d -> "complete".equals(
                            ((JavascriptExecutor)d).executeScript("return document.readyState")
                    ));

        } catch (TimeoutException | InterruptedException e) {
            System.out.println("Timeout after 10s — stopping page load.");
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

            new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                    .until(d -> "complete".equals(
                            ((JavascriptExecutor)d).executeScript("return document.readyState")
                    ));

        } catch (TimeoutException | InterruptedException e) {
            System.out.println("Timeout after 10s — stopping page load.");
            ((JavascriptExecutor) getDriver()).executeScript("window.stop();");
        } finally {
//            try {
//                getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//            } catch (Exception ex) {
//                System.out.println("Failed to reset page load timeout.");
//            }
        }
    }

    public Boolean isNewUrl(String url) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(5))
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

//    @Step("Click Open account button on the header")
    public OnBoardingPage clickOpenAccountHeaderButton() {
//        wait10UntilClickable(openAccountHeaderButton).click();
        safeClick(openAccountHeaderButton);
        return new OnBoardingPage(getDriver());
    }

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
}
