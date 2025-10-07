package com.empower;

import com.empower.pages.IndividualsPage;
import org.testng.annotations.Test;


public class StageUIVisualMobileTest extends BaseTest {

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsLogin() {
        new IndividualsPage(getDriver())
                .clickLoginButton()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Login page");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIPlanSponsors() {
        new IndividualsPage(getDriver())
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .closeCookieBanner()
                .clickPlanSponsorsMenu()
                .takePercyFullPageScreenshot(getDriver(), "Plan Sponsors page");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIPFinancialProfessionals() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickFinancialProfessionalsMenu()
                .takePercyFullPageScreenshot(getDriver(), "Financial Professionals page");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsViewAll() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerProductsSolutionsLink()
                .clickHamburgerViewAll()
                .takePercyFullPageScreenshot(getDriver(), "Individuals View All");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsCashAccount() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerProductsSolutionsLink()
                .clickHamburgerCashAccountLink()

                .takePercyFullPageScreenshot(getDriver(), "Individuals High-yield cash account");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsRollover() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerProductsSolutionsLink()
                .clickHamburgerRolloverLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Rollover");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsOpenAccount() {
        new IndividualsPage(getDriver())
                .clickOpenAccountHeaderButton()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Open account page");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsOpenAccountCreatePersonalDashboard() {
        new IndividualsPage(getDriver())
                .clickOpenAccountHeaderButton()
                .clickCreatePersonalDashBoardButton()
                .takePercyFullPageScreenshot(getDriver(), "Create Personal Dashboard");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsCTAGetStarted() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .clickCTAButtonGetStarted()
                .takePercyFullPageScreenshot(getDriver(), "CTA Get started");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsToolsViewAll() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerToolsOpenMenu()
                .clickHamburgerToolsViewAllLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Tools View All");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsToolsRetirementPlanner() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerToolsOpenMenu()
                .clickHamburgerToolsRetirementPlanner()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Tools Retirement plan");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsLearnInvestmentInsights() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerLearnOpenMenu()
                .clickHamburgerLearnInvestmentInsights()
                .takePercyFullPageScreenshot(getDriver(), "Investment Insights page");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsLearnTheCurrency() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerLearnOpenMenu()
                .clickHamburgerLearnTheCurrency()
                .takePercyFullPageScreenshot(getDriver(), "The Currency page");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsLearnPressCenter() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerWhyEmpowerOpenMenu()
                .clickHamburgerWhyEmpowerPressCenter()
                .takePercyFullPageScreenshot(getDriver(), "Press Center page");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsWhyEmpowerCybersecurity() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerWhyEmpowerOpenMenu()
                .clickHamburgerWhyEmpowerCybersecurityLink()
                .takePercyFullPageScreenshot(getDriver(), "Cybersecurity page");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsPrivateClient() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerProductsSolutionsLink()
                .clickHamburgerWealthManagementLink()
                .clickHamburgerPrivateClientLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Private Client");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsSolutionsPersonalStrategy() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerProductsSolutionsLink()
                .clickHamburgerWealthManagementLink()
                .clickHamburgerPersonalStrategyLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Personal Strategy");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsSolutionsIRAs() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerProductsSolutionsLink()
                .clickHamburgerIRAsLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals IRAs");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsSolutionsInvestmentAccounts() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerProductsSolutionsLink()
                .clickHamburgerInvestmentAccountsLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Investment accounts");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIPlanSponsorsMarketsTaftHartley() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .closeCookieBanner()
                .clickPlanSponsorsMenu()
                .clickHamburgerMarketsOpenMenu()
                .clickHamburgerMarketTaftHartleyLink()
                .takePercyFullPageScreenshot(getDriver(), "Taft-Hartley page");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIPlanSponsorsMarketsGovernment() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .closeCookieBanner()
                .clickPlanSponsorsMenu()
                .clickHamburgerMarketsOpenMenu()
                .clickHamburgerMarketGovernmentLink()
                .takePercyFullPageScreenshot(getDriver(), "Government page");
    }
}
