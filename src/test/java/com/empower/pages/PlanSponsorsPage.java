package com.empower.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PlanSponsorsPage extends BasePage{

    public PlanSponsorsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//header//span[text()='Login']")
    private WebElement loginButton;

    @FindBy(css = "h1")
    private WebElement headingText;

    @FindBy(xpath = "//button[text()='Markets']")
    private WebElement marketsMenu;

    @FindBy(xpath = "//div[@id='markets-dropdown'] //li[@class='relative']")
    private List<WebElement> marketsLinks;

    @FindBy(xpath = "//div[@class='opacity-100 col-start-1 row-start-1 content-center transition-opacity'] //p[text()='Markets']")
    private WebElement headingMarketsMenu;

    @FindBy(xpath = "//button[text()='Solutions']")
    private WebElement solutionsMenu;

    @FindBy(xpath = "//div[@id='solutions-dropdown'] //li[@class='relative']")
    private List<WebElement> solutionsLinks;

    @FindBy(xpath = "//div[@class='opacity-100 col-start-1 row-start-1 content-center transition-opacity'] //p[text()='Solutions']")
    private WebElement headingSolutionsMenu;

    @FindBy(xpath = "//button[text()='Experience']")
    private WebElement experienceMenu;

    @FindBy(xpath = "//button[@data-once='nav-main-open-menu-caret-click nav-main-open-menu-caret-hover dropdownToggle']")
    private List<WebElement> experienceLinks;

    @FindBy(xpath = "//div[@class='opacity-100 col-start-1 row-start-1 content-center transition-opacity'] //p[text()='Experience']")
    private WebElement headingExperienceMenu;

    @FindBy(xpath = "//button[text()='Learn']")
    private WebElement learnMenu;

    @FindBy(xpath = "//div[@id='learn-dropdown'] //li[@class='relative']")
    private List<WebElement> learnLinks;

    @FindBy(xpath = "//div[@class='opacity-100 col-start-1 row-start-1 content-center transition-opacity'] //p[text()='Learn']")
    private WebElement headingLearnMenu;

    @FindBy(xpath = "//button[text()='Why Empower']")
    private WebElement empowerMenu;

    @FindBy(xpath = "//div[@id='why-empower-dropdown'] //li[@class='relative']")
    private List<WebElement> empowerLinks;

    @FindBy(xpath = "//div[@class='opacity-100 col-start-1 row-start-1 content-center transition-opacity'] //p[text()='Why Empower']")
    private WebElement headingEmpowerMenu;



    @FindBy(css = "[aria-controls='dropdown-mobile-0']")
    private WebElement hamburgerMarketsMenu;

    @FindBy(css = "#dropdown-mobile-0 .mobile-nav-secondary-menu")
    private List<WebElement> hamburgerOpenMenuMarketsLinks;

    @FindBy(css = "[aria-controls='dropdown-mobile-1']")
    private WebElement hamburgerSolutionsMenu;

    @FindBy(css = "#dropdown-mobile-1 .mobile-nav-secondary-menu")
    private List<WebElement> hamburgerOpenMenuSolutionsLinks;

    @FindBy(css = "[aria-controls='dropdown-mobile-2']")
    private WebElement hamburgerExperienceMenu;

    @FindBy(css = "#dropdown-mobile-2 .mobile-nav-secondary-menu")
    private List<WebElement> hamburgerOpenMenuExperienceLinks;

    @FindBy(css = "[aria-controls='dropdown-mobile-3']")
    private WebElement hamburgerLearnMenu;

    @FindBy(css = "#dropdown-mobile-3 .mobile-nav-secondary-menu")
    private List<WebElement> hamburgerOpenMenuLearnLinks;

    @FindBy(css = "[aria-controls='dropdown-mobile-4']")
    private WebElement hamburgerWhyEmpowerMenu;

    @FindBy(css = "#dropdown-mobile-4 .mobile-nav-secondary-menu")
    private List<WebElement> hamburgerOpenMenuWhyEmpowerLinks;






    public PlanServiceCenterPage clickLoginButton() {
//        wait10UntilClickable(loginButton).click();
        safeClick(loginButton);
        return new PlanServiceCenterPage(getDriver());
    }

    public String getHeadingText() {
        return wait10UntilVisible(headingText).getText().trim();
    }

    public PlanSponsorsPage clickMarketsOpenMenu() {
        wait10UntilClickable(marketsMenu).click();
        return this;
    }

    public List<String> getMarketsLinks() {
        return wait10UntilVisibleAll(marketsLinks)
                .stream()
                .map(WebElement::getText)
                .map(text -> text.replaceAll("[\\u200B-\\u200D\\uFEFF]", "").trim())
                .toList();
    }

    public String getHeadingMarketsMenu() {
        return wait10UntilVisible(headingMarketsMenu).getText();
    }

    public PlanSponsorsPage clickSolutionsOpenMenu() {
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

    public PlanSponsorsPage clickExperienceOpenMenu() {
        wait10UntilClickable(experienceMenu).click();
        return this;
    }

    public List<String> getExperienceLinks() {
        return wait10UntilVisibleAll(experienceLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

    public String getHeadingExperienceMenu() {
        return wait10UntilVisible(headingExperienceMenu).getText().trim();
    }

    public PlanSponsorsPage clickLearnOpenMenu() {
        wait10UntilClickable(learnMenu).click();
        return this;
    }

    public List<String> getLearnLinks() {
        return wait10UntilVisibleAll(learnLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

    public String getHeadingLearnMenu() {
        return wait10UntilVisible(headingLearnMenu).getText().trim();
    }

    public PlanSponsorsPage clickWhyEmpowerOpenMenu() {
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
        return wait10UntilVisible(headingEmpowerMenu).getText().trim();
    }

//    @Step("Click Product & Solutions open menu")
    public PlanSponsorsPage clickHamburgerMarketsOpenMenu() {
        wait10UntilVisible(hamburgerMarketsMenu).click();
        return this;
    }

//    @Step("Get all links of hamburger Open menu Markets")
    public List<String> getHamburgerMarketsOpenMenuLinks() {
        return wait10UntilVisibleAll(hamburgerOpenMenuMarketsLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

//    @Step("Click Solutions open menu")
    public PlanSponsorsPage clickHamburgerSolutionsOpenMenu() {
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

//    @Step("Click Experience open menu")
    public PlanSponsorsPage clickHamburgerExperienceOpenMenu() {
        wait10UntilVisible(hamburgerExperienceMenu).click();
        return this;
    }

//    @Step("Get all links of hamburger Open menu Experience")
    public List<String> getHamburgerExperienceOpenMenuLinks() {
        return wait10UntilVisibleAll(hamburgerOpenMenuExperienceLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

//    @Step("Click Learn open menu")
    public PlanSponsorsPage clickHamburgerLearnOpenMenu() {
        wait10UntilVisible(hamburgerLearnMenu).click();
        return this;
    }

    public List<String> getHamburgerLearnOpenMenuLinks() {
        return wait10UntilVisibleAll(hamburgerOpenMenuLearnLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

//    @Step("Click Why Empower open menu")
    public PlanSponsorsPage clickHamburgerWhyEmpowerOpenMenu() {
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


}
