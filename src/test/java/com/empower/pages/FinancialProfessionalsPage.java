package com.empower.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FinancialProfessionalsPage extends BasePage{

    public FinancialProfessionalsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//header//span[text()='Login']")
    private WebElement loginButton;

    @FindBy(css = "h1")
    private WebElement headingText;

    @FindBy(xpath = "//button[@aria-label='Solutions']")
    private WebElement solutionsMenu;

    @FindBy(xpath = "//div[@id='solutions-dropdown'] //li[@class='relative']")
    private List<WebElement> solutionsLinks;

    @FindBy(xpath = "//div[@class='opacity-100 col-start-1 row-start-1 content-center transition-opacity'] //p[text()='Solutions']")
    private WebElement headingSolutionsMenu;

    @FindBy(xpath = "//button[@aria-label='Resources']")
    private WebElement resourcesMenu;

    @FindBy(xpath = "//div[@id='resources-dropdown'] //li[@class='relative']")
    private List<WebElement> resourcesLinks;

    @FindBy(xpath = "//div[@class='opacity-100 col-start-1 row-start-1 content-center transition-opacity'] //p[text()='Resources']")
    private WebElement headingResourcesMenu;

    @FindBy(xpath = "//button[@aria-label='Insights']")
    private WebElement insightsMenu;

    @FindBy(xpath = "//div[@id='insights-dropdown'] //li[@class='relative']")
    private List<WebElement> insightsLinks;

    @FindBy(xpath = "//div[@class='opacity-100 col-start-1 row-start-1 content-center transition-opacity'] //p[text()='Insights']")
    private WebElement headingInsightsMenu;

    @FindBy(xpath = "//button[@aria-label='Why Empower']")
    private WebElement empowerMenu;

    @FindBy(xpath = "//div[@id='why-empower-dropdown'] //li[@class='relative']")
    private List<WebElement> empowerLinks;

    @FindBy(xpath = "//div[@class='opacity-100 col-start-1 row-start-1 content-center transition-opacity'] //p[text()='Why Empower']")
    private WebElement headingEmpowerMenu;

    // MOBILE LOCATORS
    @FindBy(css = "[aria-controls='dropdown-mobile-0']")
    private WebElement hamburgerSolutionsMenu;

    @FindBy(css = "#dropdown-mobile-0 .mobile-nav-secondary-menu")
    private List<WebElement> hamburgerOpenMenuSolutionsLinks;

    @FindBy(css = "[aria-controls='dropdown-mobile-1']")
    private WebElement hamburgerResourcesMenu;

    @FindBy(css = "#dropdown-mobile-1 .mobile-nav-secondary-menu")
    private List<WebElement> hamburgerOpenMenuResourcesLinks;

    @FindBy(css = "[aria-controls='dropdown-mobile-2']")
    private WebElement hamburgerInsightsMenu;

    @FindBy(css = "#dropdown-mobile-2 .mobile-nav-secondary-menu")
    private List<WebElement> hamburgerOpenMenuInsightsLinks;

    @FindBy(css = "[aria-controls='dropdown-mobile-3']")
    private WebElement hamburgerWhyEmpowerMenu;

    @FindBy(css = "#dropdown-mobile-3 .mobile-nav-secondary-menu")
    private List<WebElement> hamburgerOpenMenuWhyEmpowerLinks;





    public FinancialProfessionalsLoginPage clickLoginButton() {
        safeClick(loginButton);
        return new FinancialProfessionalsLoginPage(getDriver());
    }

    public String getHeadingText() {
        return wait10UntilVisible(headingText).getText().trim();
    }

    public FinancialProfessionalsPage clickSolutionsOpenMenu() {
        wait10UntilClickable(solutionsMenu).click();
        return this;
    }

    public List<String> getSolutionsLinks() {
        return wait10UntilVisibleAll(solutionsLinks)
                .stream()
                .map(WebElement::getText)
                .map(text -> text.replaceAll("[\\u200B-\\u200D\\uFEFF]", "").trim())
                .toList();
    }

    public String getHeadingSolutionsMenu() {
        return wait10UntilVisible(headingSolutionsMenu).getText().trim();
    }

    public FinancialProfessionalsPage clickResourcesOpenMenu() {
        wait10UntilClickable(resourcesMenu).click();
        return this;
    }

    public List<String> getResourcesLinks() {
        return wait10UntilVisibleAll(resourcesLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

    public String getHeadingResourcesMenu() {
        return wait10UntilVisible(headingResourcesMenu).getText().trim();
    }

    public FinancialProfessionalsPage clickInsightsOpenMenu() {
        wait10UntilClickable(insightsMenu).click();

        return this;
    }

    public List<String> getInsightsLinks() {
        return wait10UntilVisibleAll(insightsLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

    public String getHeadingInsightsMenu() {
        return wait10UntilVisible(headingInsightsMenu).getText().trim();
    }

    public FinancialProfessionalsPage clickWhyEmpowerOpenMenu() {
        wait10UntilClickable(empowerMenu).click();

        return this;
    }

    public List<String> getEmpowerLinks() {
        return wait10UntilVisibleAll(empowerLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

    public String getHeadingEmpowerMenu() {
        return wait10UntilVisible(headingEmpowerMenu).getText();
    }

//    @Step("Click Solutions open menu")
    public FinancialProfessionalsPage clickHamburgerSolutionsOpenMenu() {
        wait10UntilVisible(hamburgerSolutionsMenu).click();

        return this;
    }

//    @Step("Get all links of hamburger Open menu Markets")
    public List<String> getHamburgerSolutionsOpenMenuLinks() {
        return wait10UntilVisibleAll(hamburgerOpenMenuSolutionsLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

//    @Step("Click Resources open menu")
    public FinancialProfessionalsPage clickHamburgerResourcesOpenMenu() {
        wait10UntilVisible(hamburgerResourcesMenu).click();

        return this;
    }

//    @Step("Get all links of hamburger Open menu Resources")
    public List<String> getHamburgerResourcesOpenMenuLinks() {
        return wait10UntilVisibleAll(hamburgerOpenMenuResourcesLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

//    @Step("Click Insights open menu")
    public FinancialProfessionalsPage clickHamburgerInsightsOpenMenu() {
        wait10UntilVisible(hamburgerInsightsMenu).click();

        return this;
    }

//    @Step("Get all links of hamburger Open menu Insights")
    public List<String> getHamburgerInsightsOpenMenuLinks() {
        return wait10UntilVisibleAll(hamburgerOpenMenuInsightsLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

//    @Step("Click Why Empower open menu")
    public FinancialProfessionalsPage clickHamburgerWhyEmpowerOpenMenu() {
        wait10UntilVisible(hamburgerWhyEmpowerMenu).click();

        return this;
    }

//    @Step("Get all links of hamburger Open menu Why Empower")
    public List<String> getHamburgerWhyEmpowerOpenMenuLinks() {
        return wait10UntilVisibleAll(hamburgerOpenMenuWhyEmpowerLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

    @Test(groups = {"mobile-smoke"})
    public void testMobileScrollingHeaderDown() {
        BasePage basePage = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickFinancialProfessionalsMenu()
                .scrollToBottom();

        Assert.assertTrue(basePage.isMobileHeaderShrink());
    }
    @Test(groups = {"mobile-smoke"})
    public void testMobileScrollingHeaderDownThenUp() {
        BasePage basePage = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickFinancialProfessionalsMenu()
                .scrollToBottom()
                .scrollToUp();

        Assert.assertTrue(basePage.isMobileHeaderExpand());
    }
    @Test(groups = {"tablet-smoke"})
    public void testScrollingHeaderDown() {
        BasePage basePage = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickFinancialProfessionalsMenu()
                .scrollToBottom();

        Assert.assertTrue(basePage.isHeaderShrink());
    }
    @Test(groups = {"tablet-smoke"})
    public void testScrollingHeaderDownThenUp() {
        BasePage basePage = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickFinancialProfessionalsMenu()
                .scrollToBottom()
                .scrollToUp();

        Assert.assertTrue(basePage.isHeaderExpand());
    }

    @Test(groups = {"mobile-smoke", "tablet-smoke"})
    public void testMobileFinancialProfessionalsMenuFunctionality() {
        FinancialProfessionalsPage page = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickFinancialProfessionalsMenu();

        Assert.assertEquals(page.getHeadingText(), "Solutions, support, success");
        Assert.assertTrue(page.getCurrentUrl().contains("/financial-professionals"));
    }

    @Test(groups = {"mobile-smoke", "tablet-smoke"})
    public void testMobileFinancialProfessionalsMenuHeading() {
        String menuHeadingText = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickFinancialProfessionalsMenu()
                .getMobileHeader()
                .clickHamburgerMenuFinancialProfessionals()
                .getHamburgerHeadingText();

        Assert.assertEquals(menuHeadingText, "Financial Professionals");
    }
}


