package com.empower;

import com.empower.pages.IndividualsPage;
import com.empower.pages.SignupPage;
import org.testng.annotations.Test;


public class UIVisualTest extends BaseTest {

    @Test(groups = {"desktop-visual"})
    public void testTP1() {
        new IndividualsPage(getDriver())
                .gotoURL("https://empwrretiremtstg.prod.acquia-sites.com/empulsify/test-all-components-light-them")
                .takePercyFullPageScreenshot(getDriver(),"TP1","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testTP2() {
        new IndividualsPage(getDriver())
                .gotoURL("https://empwrretiremtstg.prod.acquia-sites.com/empulsify/tools-carousel-multi-card-container-bento-circle-cards-thought-leadership-light-theme")
                .takePercyFullPageScreenshot(getDriver(),"TP2","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testTP3() {
        new IndividualsPage(getDriver())
                .gotoURL("https://empwrretiremtstg.prod.acquia-sites.com/empulsify/hero-carousel-fw-hero-carousel-scrolling-value-prop-accordion-light-theme")
                .takePercyFullPageScreenshot(getDriver(),"TP3","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testTP4() {
        new IndividualsPage(getDriver())
                .gotoURL("https://empwrretiremtstg.prod.acquia-sites.com/empulsify/testimonial-comparison-table-video-component-badge-final-cta")
                .takePercyFullPageScreenshot(getDriver(),"TP4","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testTP5() {
        new IndividualsPage(getDriver())
                .gotoURL("https://empwrretiremtstg.prod.acquia-sites.com/empulsify/tp5-components-dark-theme")
                .takePercyFullPageScreenshot(getDriver(),"TP5","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividuals() {
        new IndividualsPage(getDriver())
                .takePercyFullPageScreenshot(getDriver(), "Individuals page", "Desktop");

//        PercySDK.screenshot(getDriver(), "Home – default");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIPlanSponsors() {
        new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickPlanSponsorsMenu()
                .takePercyFullPageScreenshot(getDriver(), "Plan Sponsors page","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIPFinancialProfessionals() {
        new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickFinancialProfessionalsMenu()
                .takePercyFullPageScreenshot(getDriver(), "Financial Professionals page","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsSolutionsViewAll() {
        new IndividualsPage(getDriver())
                .clickProductsSolutionsOpenMenu()
                .clickViewAllLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals View All","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsSolutionsCashAccount() {
        new IndividualsPage(getDriver())
                .clickProductsSolutionsOpenMenu()
                .clickCashAccountLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals High-yield cash account","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsSolutionsRollover() {
        new IndividualsPage(getDriver())
                .clickProductsSolutionsOpenMenu()
                .clickRolloverLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Rollover","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsSolutionsPrivateClient() {
        new IndividualsPage(getDriver())
                .clickProductsSolutionsOpenMenu()
                .clickWealthManagementLink()
                .clickPrivetClientLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Private Client","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsToolsViewAll() {
        new IndividualsPage(getDriver())
                .clickToolsOpenMenu()
                .clickToolsViewAllLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Tools View All","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsToolsRetirementPlanner() {
        new IndividualsPage(getDriver())
                .clickToolsOpenMenu()
                .clickToolsRetirementPlanner()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Tools Retirement plan","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsLogin() {
        new IndividualsPage(getDriver())
                .clickLoginButton()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Login page","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsOpenAccount() {
        new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickOpenAccountHeaderButton()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Open account page","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsOpenAccountPersonalCash() {
        new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickOpenAccountHeaderButton()
                .closeCookieBanner(SignupPage.class)
                .clickPersonalCashOpenAccountButton()
                .takePercyFullPageScreenshot(getDriver(), "Personal Cash account","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsOpenAccountPremierIRA() {
        new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickOpenAccountHeaderButton()
//                .closeCookieBanner(SignupPage.class)
                .clickPremierIRAOpenAccountButton()
                .takePercyFullPageScreenshot(getDriver(), "Premier IRA account","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsOpenAccountPremierInvestment() {
        new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickOpenAccountHeaderButton()
//                .closeCookieBanner(SignupPage.class)
                .clickPremierInvestmentOpenAccountButton()
                .takePercyFullPageScreenshot(getDriver(), "Premier Investment account","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsOpenAccountPersonalDashboard() {
        new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickOpenAccountHeaderButton()
//                .closeCookieBanner(SignupPage.class)
                .clickPersonalDashboardOpenAccountButton()
                .takePercyFullPageScreenshot(getDriver(), "Personal Dashboard account","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsCTAGetStarted() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .clickCTAButtonGetStarted()
                .takePercyFullPageScreenshot(getDriver(), "CTA Get started","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsFinancialProfessionalsLogin() {
        new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickFinancialProfessionalsMenu()
                .clickLoginButton()
                .takePercyFullPageScreenshot(getDriver(), "Financial Professionals Login page","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsLearnInvestmentInsights() {
        new IndividualsPage(getDriver())
                .clickLearnOpenMenu()
                .clickLearnInvestmentInsights()
                .takePercyFullPageScreenshot(getDriver(), "Investment Insights page","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsLearnTheCurrency() {
        new IndividualsPage(getDriver())
                .clickLearnOpenMenu()
                .clickLearnTheCurrency()
                .takePercyFullPageScreenshot(getDriver(), "The Currency page","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsWhyEmpowerPressCenter() {
        new IndividualsPage(getDriver())
                .clickWhyEmpowerOpenMenu()
                .clickWhyEmpowerPressCenter()
                .takePercyFullPageScreenshot(getDriver(), "Press Center page","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsWhyEmpowerCybersecurity() {
        new IndividualsPage(getDriver())
                .clickWhyEmpowerOpenMenu()
                .clickWhyEmpowerCybersecurityLink()
                .takePercyFullPageScreenshot(getDriver(), "Cybersecurity page","Desktop");
    }
/// //////////////////////////////////////////////////////////////////////////////////////////////////
    @Test(groups = {"desktop-visual"})
    public void testUIPlanSponsorsMarketsGovernment() {
        new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickPlanSponsorsMenu()
                .clickMarketsOpenMenu()
                .clickMarketGovernmentLink()
                .takePercyFullPageScreenshot(getDriver(), "Government page","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIPlanSponsorsMarketsTaftHartley() {
        new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickPlanSponsorsMenu()
                .clickMarketsOpenMenu()
                .clickMarketTaftHartleyLink()
                .takePercyFullPageScreenshot(getDriver(), "Taft-Hartley page","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsSolutionsPersonalStrategy() {
        new IndividualsPage(getDriver())
                .clickProductsSolutionsOpenMenu()
                .clickWealthManagementLink()
                .clickPersonalStrategyLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Personal Strategy","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsSolutionsIRAs() {
        new IndividualsPage(getDriver())
                .clickProductsSolutionsOpenMenu()
                .clickIRAsLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals IRAs","Desktop");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsSolutionsInvestmentAccounts() {
        new IndividualsPage(getDriver())
                .clickProductsSolutionsOpenMenu()
                .clickInvestmentAccountsLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Investment accounts","Desktop");
    }
}
