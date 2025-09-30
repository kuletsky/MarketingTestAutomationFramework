package com.empower.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class IndividualsPage extends BasePage{

    public IndividualsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//header//span[text()='Login']")
    private WebElement loginButton;

//    @FindBy(css = "h1")
//    private WebElement headingText;

    private final By headingText = By.cssSelector("h1");

    @FindBy(css = "[aria-controls='dropdown-mobile-0']")
    private WebElement hamburgerProductsSolutionsMenu;

    @FindBy(css = "#dropdown-mobile-0 .mobile-nav-secondary-menu")
    private List<WebElement> hamburgerOpenMenuPSLinks;

    @FindBy(css = "[aria-controls='dropdown-mobile-2']")
    private WebElement hamburgerLearnMenu;

    @FindBy(css = "[aria-controls='dropdown-mobile-1']")
    private WebElement hamburgerToolsMenu;

    @FindBy(css = "[aria-controls='dropdown-mobile-3']")
    private WebElement hamburgerWhyEmpowerMenu;

    @FindBy(css = "#dropdown-mobile-1 .mobile-nav-secondary-menu")
    private List<WebElement> hamburgerOpenMenuToolsLinks;

    @FindBy(css = "#dropdown-mobile-2 .mobile-nav-secondary-menu")
    private List<WebElement> hamburgerOpenMenuLearnLinks;

    @FindBy(css = "#dropdown-mobile-3 .mobile-nav-secondary-menu")
    private List<WebElement> hamburgerOpenMenuWhyEmpowerLinks;

    @FindBy(xpath = "(//div[@data-drupal-block-name='final_cta'] //span[text()='Connect my accounts'])[1]")
    private WebElement mobileCTAButtonConnectMyAccounts2;

    @FindBy(xpath = "//button[text()='Products & Solutions']")
    private WebElement productsSolutionsMenu;

    @FindBy(css = "nav[aria-label='Products & Solutions Secondary'] [aria-label='View All']")
    private WebElement viewAllLinkPS;

    @FindBy(css = "#dropdown-mobile-0 [aria-label='View All']")
    private WebElement hamburgerViewAllLinkPS;

    @FindBy(css = "nav[aria-label='Tools Secondary'] [aria-label='View All']")
    private WebElement toolsViewAllLink;

    @FindBy(css = "#dropdown-mobile-1 [aria-label='View All']")
    private WebElement hamburgerToolsViewAllLink;

    @FindBy(css = "nav[aria-label='Tools Secondary'] [aria-label='Retirement Planner']")
    private WebElement toolsRetirementPlannerLink;

    @FindBy(css = "#dropdown-mobile-1 [aria-label='Retirement Planner']")
    private WebElement hamburgerToolsRetirementPlannerLink;

    @FindBy(css = "nav[aria-label='Learn Secondary'] [aria-label='Investment Insights']")
    private WebElement learnInvestmentInsights;

    @FindBy(css = "#dropdown-mobile-2 [aria-label='Investment Insights']")
    private WebElement hamburgerLearnInvestmentInsights;

    @FindBy(css = "nav[aria-label='Learn Secondary'] [aria-label='The Currency']")
    private WebElement learnTheCurrency;

    @FindBy(css = "#dropdown-mobile-2 [aria-label='The Currency']")
    private WebElement hamburgerLearnTheCurrency;

    @FindBy(css = "nav[aria-label='Why Empower'] [aria-label='Press Center']")
    private WebElement whyEmpowerPressCenter;

    @FindBy(css = "nav[aria-label='Products & Solutions Secondary'] [aria-label='High-yield cash account']")
    private WebElement cashAccountLink;

    @FindBy(css = "#dropdown-mobile-0 [aria-label='High-yield cash account']")
    private WebElement hamburgerCashAccountLink;

    @FindBy(css = "nav[aria-label='Products & Solutions Secondary'] [aria-label='Rollover']")
    private WebElement rolloverLink;

    @FindBy(css = "#dropdown-mobile-0 [aria-label='Rollover']")
    private WebElement hamburgerRolloverLink;

    @FindBy(css = "#solutions-dropdown li.relative > a, #solutions-dropdown li.relative > button")
    private List<WebElement> productsSolutionsLinks;

    @FindBy(xpath = "//div[@class='opacity-100 col-start-1 row-start-1 content-center transition-opacity'] //p[text()='Products & solutions']")
    private WebElement headingPSMenu;

    @FindBy(xpath = "//button[text()='Tools']")
    private WebElement toolsMenu;

    @FindBy(xpath = "//div[@id='tools-dropdown'] //li[@class='relative']")
    private List<WebElement> toolsLinks;

    @FindBy(xpath = "//div[@class='opacity-100 col-start-1 row-start-1 content-center transition-opacity'] //p[text()='Financial tools']")
    private WebElement headingToolsMenu;

    @FindBy(xpath = "//button[text()='Learn']")
    private WebElement learnMenu;

    @FindBy(xpath = "//div[@id='learn-dropdown'] //li[@class='relative']")
    private List<WebElement> learnLinks;

    @FindBy(xpath = "//div[@class='opacity-100 col-start-1 row-start-1 content-center transition-opacity'] //p[contains(text(),'The Currency')]")
    private WebElement headingLearnMenu;

    @FindBy(xpath = "//button[text()='Why Empower']")
    private WebElement empowerMenu;

    @FindBy(xpath = "//div[@id='why-empower-dropdown'] //li[@class='relative']")
    private List<WebElement> empowerLinks;

    @FindBy(xpath = "//div[@class='opacity-100 col-start-1 row-start-1 content-center transition-opacity'] //p[text()='About us']")
    private WebElement headingEmpowerMenu;

    @FindBy(xpath = "//div[@data-drupal-block-name='hero_header']//span[text()='Open an account']")
    private WebElement CTAButtonOpenAccount1;

    @FindBy(xpath = "//div[@data-drupal-paragraph-name='stat_banner']//span[text()='Schedule a call']")
    private WebElement CTAButtonScheduleCall1;

    @FindBy(xpath = "//div[@data-drupal-paragraph-name='animated_content_block_item']//span[text()='Open an account']")
    private WebElement CTAButtonOpenAccount2;

    @FindBy(xpath = "//div[@data-drupal-paragraph-name='animated_content_block_item']//span[text()='Schedule a call']")
    private WebElement CTAButtonScheduleCall2;

    @FindBy(xpath = "//div[@data-drupal-paragraph-name=\"animated_content_block_item\"]//span[text()=\"Connect my accounts\"]")
    private WebElement CTAButtonConnectMyAccounts1;

    @FindBy(xpath = "//span[text()='Take me there']")
    private WebElement CTAButtonTakeMeThere;

    @FindBy(xpath = "//span[text()='Explore the tools']")
    private WebElement CTAButtonExploreTheTools;

    @FindBy(xpath = "//span[text()='Start rollover']")
    private WebElement CTAButtonStartRollover;

    @FindBy(xpath = "//span[text()='Work with us']")
    private WebElement CTAButtonWorkWithUs;

    @FindBy(xpath = "(//div[@data-drupal-block-name=\"final_cta\"] //span[text()=\"Connect my accounts\"])[2]")
    private WebElement CTAButtonConnectMyAccounts2;

    @FindBy(xpath = "//span[text()='Learn more']")
    private WebElement CTAButtonLearnMore;

    @FindBy(xpath = "//span[text()='Get started']")
    private WebElement CTAButtonGetStarted;

    @FindBy(xpath = "//span[text()='About Personal Strategy']")
    private WebElement CTAButtonAboutPersonalStrategy;

    @FindBy(css = "h1")
    private WebElement headingSecurityPage;

    @FindBy(css = "h4 .clearfix span span")
    private WebElement headingPersonalStrategy;

    @FindBy(css = "h1")
    private WebElement headingAboutPersonalStrategy;

    @FindBy(css = "[aria-label='Plan Sponsors']")
    private WebElement planSponsorsMenu;

    @FindBy(css = "[aria-label='Financial Professionals']")
    private WebElement financialProfessionalsMenu;




    //    @Step("Click Login button")
    public IndividualsLoginV1Page clickLoginButton() {
//        wait10UntilClickable(loginButton).click();
        safeClick(loginButton);
        return new IndividualsLoginV1Page(getDriver());
    }

//    @Step("Get heading text")
    public String getHeadingText() {
        return ByWait10UntilVisible(headingText).getText().trim();
    }

//    @Step("Click Product & Solutions menu")
    public IndividualsPage clickHamburgerProductsSolutionsOpenMenu() {
        wait10UntilVisible(hamburgerProductsSolutionsMenu).click();

        return this;
    }

//    @Step("Click Learn menu")
    public IndividualsPage clickHamburgerLearnOpenMenu() {
        wait10UntilVisible(hamburgerLearnMenu).click();

        return this;
    }

    //    @Step("Click Tools menu")
    public IndividualsPage clickHamburgerToolsOpenMenu() {
        wait10UntilVisible(hamburgerToolsMenu).click();

        return this;
    }

//    @Step("Click Why Empower menu")
    public IndividualsPage clickHamburgerWhyEmpowerOpenMenu() {
        wait10UntilClickable(hamburgerWhyEmpowerMenu).click();

        return this;
    }


//    @Step("Get all links of hamburger Open menu Products&Solutions")
    public List<String> getHamburgerProductsSolutionsOpenMenuLinks() {
        return wait10UntilVisibleAll(hamburgerOpenMenuPSLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

//    @Step("Get all links of hamburger Tools menu")
    public List<String> getToolsOpenMenuLinks() {
        return wait10UntilVisibleAll(hamburgerOpenMenuToolsLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

//    @Step("Get all links of hamburger Learn menu")
    public List<String> getLearnOpenMenuLinks() {
        return wait10UntilVisibleAll(hamburgerOpenMenuLearnLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

//    @Step("Get all links of hamburger Why Empower menu")
    public List<String> getWhyEmpowerOpenMenuLinks() {
        return wait10UntilVisibleAll(hamburgerOpenMenuWhyEmpowerLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

//    @Step("Click CTA button \"Connect my accounts\" button")
    public OnBoardingPage clickMobileCTAButtonConnectMyAccounts2() {
        safeClick(mobileCTAButtonConnectMyAccounts2);

        return new OnBoardingPage(getDriver());
    }

//    @Step("Click Product & Solutions menu")
    public IndividualsPage clickProductsSolutionsOpenMenu() {
        wait10UntilVisible(productsSolutionsMenu).click();

        return this;
    }

    public IndividualsPage clickViewAllLink() {
        safeClick(viewAllLinkPS);

        return this;
    }

    public IndividualsPage clickHamburgerViewAll() {
        safeClick(hamburgerViewAllLinkPS);

        return this;
    }

    public IndividualsPage clickToolsViewAllLink() {
        safeClick(toolsViewAllLink);

        return this;
    }

    public IndividualsPage clickHamburgerToolsViewAllLink() {
        safeClick(hamburgerToolsViewAllLink);

        return this;
    }

    public IndividualsPage clickToolsRetirementPlanner() {
        safeClick(toolsRetirementPlannerLink);

        return this;
    }

    public IndividualsPage clickHamburgerToolsRetirementPlanner() {
        safeClick(hamburgerToolsRetirementPlannerLink);

        return this;
    }

    public IndividualsPage clickLearnInvestmentInsights() {
        safeClick(learnInvestmentInsights);

        return this;
    }

    public IndividualsPage clickHamburgerLearnInvestmentInsights() {
        safeClick(hamburgerLearnInvestmentInsights);

        return this;
    }

    public IndividualsPage clickLearnTheCurrency() {
        safeClick(learnTheCurrency);

        return this;
    }

    public IndividualsPage clickHamburgerLearnTheCurrency() {
        safeClick(hamburgerLearnTheCurrency);

        return this;
    }

    public IndividualsPage clickWhyEmpowerPressCenter() {
        safeClick(whyEmpowerPressCenter);

        return this;
    }

    public IndividualsPage clickCashAccountLink() {
        safeClick(cashAccountLink);

        return this;
    }

    public IndividualsPage clickHamburgerCashAccountLink() {
        safeClick(hamburgerCashAccountLink);

        return this;
    }

    public IndividualsPage clickRolloverLink() {
        safeClick(rolloverLink);

        return this;
    }

    public IndividualsPage clickHamburgerRolloverLink() {
        safeClick(hamburgerRolloverLink);

        return this;
    }


    //    @Step("Get all links of hamburger Open Products&Solutions menu")
    public List<String> getProductsSolutionsLinks() {
        return wait10UntilVisibleAll(productsSolutionsLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

//    @Step("Get heading of Product & Solution menu")
    public String getHeadingProductsSolutionsMenu() {
        return wait10UntilVisible(headingPSMenu).getText().trim();
    }

//    @Step("Click Tools menu")
    public IndividualsPage clickToolsOpenMenu() {
        wait10UntilVisible(toolsMenu).click();

        return this;
    }

//    @Step("Get list of submenu links Tools")
    public List<String> getToolsLinks() {
        return wait10UntilVisibleAll(toolsLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

//    @Step("Get heading of Tools menu")
    public String getHeadingToolsMenu() {
        return wait10UntilVisible(headingToolsMenu).getText();
    }

//    @Step("Click Learn menu")
    public IndividualsPage clickLearnOpenMenu() {
        wait10UntilVisible(learnMenu).click();

        return this;
    }

//    @Step("Get list of submenu links Learn")
    public List<String> getLearnLinks() {
        return wait10UntilVisibleAll(learnLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

//    @Step("Get heading of Learn menu")
    public String getHeadingLearnMenu() {
        return wait10UntilVisible(headingLearnMenu).getText().trim();
    }

//    @Step("Click Why Empower menu")
    public IndividualsPage clickWhyEmpowerOpenMenu() {
        wait10UntilClickable(empowerMenu).click();

        return this;
    }

//    @Step("Get list of submenu links Why Empower")
    public List<String> getEmpowerLinks() {
        return wait10UntilVisibleAll(empowerLinks)
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .toList();
    }

//    @Step("Get heading of Why Empower menu")
    public String getHeadingEmpowerMenu() {
        return wait10UntilVisible(headingEmpowerMenu).getText().trim();
    }

//    @Step("Click CTA button \"Open an account\" 1")
    public OnBoardingPage clickCTAButtonOpenAccount1() {
//        safeClick(CTAButtonOpenAccount1);
        safeClick(CTAButtonConnectMyAccounts1);
        return new OnBoardingPage(getDriver());
    }

    //    @Step("Click CTA button \" Schedule to call\" 1")
    public SchedulePage clickCTAButtonScheduleCall1() {
        safeClick(CTAButtonScheduleCall1);

        return new SchedulePage(getDriver());
    }

//    @Step("Click CTA button \"Open an account\" 2")
    public OnBoardingPage clickCTAButtonOpenAccount2() {
        safeClick(CTAButtonOpenAccount2);

        return new OnBoardingPage(getDriver());
    }

//    @Step("Click CTA button \" Schedule to call\" 2")
    public SchedulePage clickCTAButtonScheduleCall2() {
//        safeClick(CTAButtonScheduleCall2);
        wait10UntilClickable(CTAButtonScheduleCall2).click();
        return new SchedulePage(getDriver());
    }

//    @Step("Click CTA button \"Connect my accounts\" button")
    public OnBoardingPage clickCTAButtonConnectMyAccounts1() {
        safeClick(CTAButtonConnectMyAccounts1);

        return new OnBoardingPage(getDriver());
    }

//    @Step("Click CTA button \"Take me there\" button")
    public ProductsSolutionsPage clickCTAButtonTakeMeThere() {
        safeClick(CTAButtonTakeMeThere);

        return new ProductsSolutionsPage(getDriver());
    }

//    @Step("Click CTA button \"Explore the tools\" button")
    public ToolsPage clickCTAButtonExploreTheTools() {
        safeClick(CTAButtonExploreTheTools);

        return new ToolsPage(getDriver());
    }

//    @Step("Click CTA button \"Start rollover\" button")
    public IrasPage clickCTAButtonStartRollover() {
        safeClick(CTAButtonStartRollover);

        return new IrasPage(getDriver());
    }

//    @Step("Click CTA button \"Work with us\" button")
    public WorkplaceRetirementPage clickCTAButtonWorkWithUs() {
        safeClick(CTAButtonWorkWithUs);

        return new WorkplaceRetirementPage(getDriver());
    }

//    @Step("Click CTA button \"Connect my accounts\" button")
    public OnBoardingPage clickCTAButtonConnectMyAccounts2() {
        safeClick(CTAButtonConnectMyAccounts2);

        return new OnBoardingPage(getDriver());
    }

//    @Step("Click CTA button 'Learn more' button")
    public IndividualsPage clickCTAButtonLearnMore() {
        safeClick(CTAButtonLearnMore);

        return this;
    }

    public IndividualsPage clickCTAButtonGetStarted() {
        safeClick(CTAButtonGetStarted);

        return this;
    }

    public IndividualsPage clickCTAButtonAboutPersonalStrategy() {
        safeClick(CTAButtonAboutPersonalStrategy);

        return this;
    }

//    @Step("Get heading of Security page")
    public String getHeadingTextOfSecurityPage() {
        return wait10UntilVisible(headingSecurityPage)
                .getText()
                .trim();
    }

    public String getHeadingTextOfPersonalStrategy() {
        return wait10UntilVisible(headingPersonalStrategy)
                .getText()
                .trim();
    }

    public String getHeadingTextAboutPersonalStrategy() {
        return wait10UntilVisible(headingAboutPersonalStrategy)
                .getText()
                .trim();
    }

//    @Step("Click mobile Plan Sponsors menu")
    public PlanSponsorsPage clickPlanSponsorsMenu() {
        safeClick(planSponsorsMenu);

        return new PlanSponsorsPage(getDriver());
    }

//    @Step("Click mobile Financial Professionals menu")
    public FinancialProfessionalsPage clickFinancialProfessionalsMenu() {
        safeClick(financialProfessionalsMenu);

        return new FinancialProfessionalsPage(getDriver());
    }

}