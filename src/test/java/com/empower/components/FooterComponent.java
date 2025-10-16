package com.empower.components;

import com.empower.pages.base.BasePage;
import com.empower.pages.IndividualsPage;
import com.empower.utils.WindowHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.List;

public class FooterComponent extends BasePage {

    public FooterComponent(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Continue']")
    private WebElement continueButton;

    @FindBy(css = "[data-once='click-footer-navigation']")
    private List<WebElement> navigationLinks;

    @FindBy(css = ".global--disclaimer-copy")
    private WebElement globalDisclaimer;

    @FindBy(css = "li.gap-x-3")
    private List<WebElement> legalMenuLinks;

    @FindBy(css = "[data-once='click-social-icons']")
    private List<WebElement> socialMedeaIcons;

    @FindBy(css = "[data-once='empower-logo-footer-click']")
    private WebElement footerEmpowerLogo;

    @FindBy(css = "[aria-label='BrokerCheck® by FINRA']")
    private WebElement discaimerBrokerCheck;

    //    @Step("Navigate to footer")
    public FooterComponent getFooter() {
        return new FooterComponent(getDriver());
    }

//    @Step("Click on the \"{linkText}\"")
    public FooterComponent clickFooterLink(String linkText) {
        safeClickBy(By.xpath("//a[text()='" + linkText + "']"));

        return this;
    }

    //    @Step("Click on the Social Media \"{linkText}\"")
    public FooterComponent clickFooterSocialMediaIcon(String linkText) {
//        getWait10()
//                .until(ExpectedConditions.elementToBeClickable((By.xpath("//a[text()='" + linkText + "']"))))
//                .click();
        safeClickBy(By.xpath("//a[text()='" + linkText + "']"));

//        wait10UntilClickable(continueButton).click();
//
//        List<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
//        getDriver().switchTo().window(tabs.get(tabs.size() - 1));

        return this;
    }

    //    @Step("Click continue button")
    public FooterComponent clickContinueButtonWithNewTab() {
//        wait10UntilClickable(continueButton).click();
        WindowHelper.clickOpenAndFocus(getDriver(), continueButton, Duration.ofSeconds(30));

//        List<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
//        getDriver().switchTo().window(tabs.get(tabs.size() - 1));

//        Set<String> windowHandles = getDriver().getWindowHandles();
//        for (String handle : windowHandles) {
//            getDriver().switchTo().window(handle);
//        }
        return this;
    }

//    @Step("Click continue button")
    public FooterComponent clickContinueButtonWithoutNewTab() {
//        wait10UntilClickable(continueButton).click();
        safeClick(continueButton);
        return this;
    }

//    @Step("Click on disclaimer \"{linkText}\"")
    public FooterComponent clickDisclaimerLink(String linkText) {
        safeClickBy(By.xpath("//u[text()='" + linkText + "']"));

        return this;
    }

//    @Step("Get heading text")
    public String getHeadingText(String headingText) {

        return ByWait10UntilVisible(By.xpath("//*[normalize-space(text())='" + headingText + "']"))
                .getText()
                .trim();
    }

    //    @Step("Get all Navigation links")
    public List<String> getNavigationLinks() {
        return wait10UntilVisibleAll(navigationLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

//    @Step("Get all Legal menu links")
    public List<String> getLegalMenuLinks() {
        return wait10UntilVisibleAll(legalMenuLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

//    @Step("Get all Social Media links")
    public List<String> getSocialMediaIcons() {
        return wait10UntilVisibleAll(socialMedeaIcons)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }


    //    @Step("Get Disclaimer text")
    public String getGlobalDisclaimerText() {
        return wait10UntilVisible(globalDisclaimer).getText();
    }

//    @Step("Click on footer Empower logo")
    public IndividualsPage clickFooterEmpowerLogo() {
//        wait10UntilClickable(footerEmpowerLogo).click();
        safeClick(footerEmpowerLogo);

        return new IndividualsPage(getDriver());
    }

    public FooterComponent clickBrokerCheckLink() {
//        wait10UntilClickable(discaimerBrokerCheck).click();
        safeClick(discaimerBrokerCheck);
        return this;
    }
}
