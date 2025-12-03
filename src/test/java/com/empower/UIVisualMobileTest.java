package com.empower;

import com.empower.pages.IndividualsPage;
import org.testng.annotations.Test;


public class UIVisualMobileTest extends BaseTest {

    @Test(groups = {"mobile-visual"})
    public void testTP1() {
        new IndividualsPage(getDriver())
                .gotoURL("https://empwrretiremtstg.prod.acquia-sites.com/empulsify/test-all-components-light-them")
                .takePercyFullPageScreenshot(getDriver(),"TP1","Desktop");
    }

    @Test(groups = {"mobile-visual"})
    public void testTP2() {
        new IndividualsPage(getDriver())
                .gotoURL("https://empwrretiremtstg.prod.acquia-sites.com/empulsify/tools-carousel-multi-card-container-bento-circle-cards-thought-leadership-light-theme")
                .takePercyFullPageScreenshot(getDriver(),"TP2","Desktop");
    }

    @Test(groups = {"mobile-visual"})
    public void testTP3() {
        new IndividualsPage(getDriver())
                .gotoURL("https://empwrretiremtstg.prod.acquia-sites.com/empulsify/hero-carousel-fw-hero-carousel-scrolling-value-prop-accordion-light-theme")
                .takePercyFullPageScreenshot(getDriver(),"TP3","Desktop");
    }

    @Test(groups = {"mobile-visual"})
    public void testTP4() {
        new IndividualsPage(getDriver())
                .gotoURL("https://empwrretiremtstg.prod.acquia-sites.com/empulsify/testimonial-comparison-table-video-component-badge-final-cta")
                .takePercyFullPageScreenshot(getDriver(),"TP4","Desktop");
    }

    @Test(groups = {"mobile-visual"})
    public void testTP5() {
        new IndividualsPage(getDriver())
                .gotoURL("https://empwrretiremtstg.prod.acquia-sites.com/empulsify/tp5-components-dark-theme")
                .takePercyFullPageScreenshot(getDriver(),"TP5","Desktop");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividuals() {
        new IndividualsPage(getDriver())
                .takePercyFullPageScreenshot(getDriver(), "Individuals page", "Mobile");

//        PercySDK.screenshot(getDriver(), "Home – default");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsLogin() {
        new IndividualsPage(getDriver())
                .clickLoginButton()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Login page", "Mobile");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIPlanSponsors() {
        new IndividualsPage(getDriver())
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .closeCookieBanner()
                .clickPlanSponsorsMenu()
                .takePercyFullPageScreenshot(getDriver(), "Plan Sponsors page", "Mobile");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIPFinancialProfessionals() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickFinancialProfessionalsMenu()
                .takePercyFullPageScreenshot(getDriver(), "Financial Professionals page", "Mobile");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsViewAll() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerProductsSolutionsLink()
                .clickHamburgerViewAll()
                .takePercyFullPageScreenshot(getDriver(), "Individuals View All", "Mobile");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsCashAccount() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerProductsSolutionsLink()
                .clickHamburgerCashAccountLink()

                .takePercyFullPageScreenshot(getDriver(), "Individuals High-yield cash account", "Mobile");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsRollover() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerProductsSolutionsLink()
                .clickHamburgerRolloverLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Rollover", "Mobile");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsOpenAccount() {
        new IndividualsPage(getDriver())
                .getMobileHeader()
                .clickOpenAccountHeaderButton()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Open account page", "Mobile");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsOpenAccountPersonalCash() {
        new IndividualsPage(getDriver())
                .getMobileHeader()
                .clickOpenAccountHeaderButton()
                .clickPersonalCashOpenAccountButton()
                .takePercyFullPageScreenshot(getDriver(), "Personal Cash account","Desktop");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsOpenAccountPremierIRA() {
        new IndividualsPage(getDriver())
                .getMobileHeader()
                .clickOpenAccountHeaderButton()
                .clickPremierIRAOpenAccountButton()
                .takePercyFullPageScreenshot(getDriver(), "Premier IRA account","Desktop");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsOpenAccountPremierInvestment() {
        new IndividualsPage(getDriver())
                .getMobileHeader()
                .clickOpenAccountHeaderButton()
                .clickPremierInvestmentOpenAccountButton()
                .takePercyFullPageScreenshot(getDriver(), "Premier Investment account","Desktop");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsOpenAccountPersonalDashboard() {
        new IndividualsPage(getDriver())
                .getMobileHeader()
                .clickOpenAccountHeaderButton()
                .clickPersonalDashboardOpenAccountButton()
                .takePercyFullPageScreenshot(getDriver(), "Personal Dashboard account","Desktop");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsCTAGetStarted() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .clickCTAButtonGetStarted()
                .takePercyFullPageScreenshot(getDriver(), "CTA Get started", "Mobile");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsToolsViewAll() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerToolsOpenMenu()
                .clickHamburgerToolsViewAllLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Tools View All", "Mobile");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsToolsRetirementPlanner() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerToolsOpenMenu()
                .clickHamburgerToolsRetirementPlanner()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Tools Retirement plan", "Mobile");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsLearnInvestmentInsights() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerLearnOpenMenu()
                .clickHamburgerLearnInvestmentInsights()
                .takePercyFullPageScreenshot(getDriver(), "Investment Insights page", "Mobile");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsLearnTheCurrency() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerLearnOpenMenu()
                .clickHamburgerLearnTheCurrency()
                .takePercyFullPageScreenshot(getDriver(), "The Currency page", "Mobile");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsLearnPressCenter() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerWhyEmpowerOpenMenu()
                .clickHamburgerWhyEmpowerPressCenter()
                .takePercyFullPageScreenshot(getDriver(), "Press Center page", "Mobile");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsWhyEmpowerCybersecurity() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerWhyEmpowerOpenMenu()
                .clickHamburgerWhyEmpowerCybersecurityLink()
                .takePercyFullPageScreenshot(getDriver(), "Cybersecurity page", "Mobile");
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
                .takePercyFullPageScreenshot(getDriver(), "Individuals Private Client", "Mobile");
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
                .takePercyFullPageScreenshot(getDriver(), "Individuals Personal Strategy", "Mobile");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsSolutionsIRAs() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerProductsSolutionsLink()
                .clickHamburgerIRAsLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals IRAs", "Mobile");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIIndividualsSolutionsInvestmentAccounts() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerProductsSolutionsLink()
                .clickHamburgerInvestmentAccountsLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Investment accounts", "Mobile");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIPlanSponsorsMarketsTaftHartley() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .closeCookieBanner()
                .clickPlanSponsorsMenu()
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuPlanSponsors()
                .clickHamburgerMarketsOpenMenu()
                .clickHamburgerMarketTaftHartleyLink()
                .takePercyFullPageScreenshot(getDriver(), "Taft-Hartley page", "Mobile");
    }

    @Test(groups = {"mobile-visual"})
    public void testUIPlanSponsorsMarketsGovernment() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .closeCookieBanner()
                .clickPlanSponsorsMenu()
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuPlanSponsors()
                .clickHamburgerMarketsOpenMenu()
                .clickHamburgerMarketGovernmentLink()
                .takePercyFullPageScreenshot(getDriver(), "Government page", "Mobile");
    }
}
