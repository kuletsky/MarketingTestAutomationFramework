package com.empower;

import com.empower.pages.IndividualsPage;
import org.testng.annotations.Test;


public class StageUIVisualTest extends BaseTest {

    @Test(groups = {"desktop-visual", "mobile-visual"})
    public void testUIIndividuals() {
        new IndividualsPage(getDriver())
//                .closeCookieBanner()
                .pauseHeroCarousel()
                .takePercyFullPageScreenshot(getDriver(), "Individuals page");

//        PercySDK.screenshot(getDriver(), "Home – default");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIPlanSponsors() {
        new IndividualsPage(getDriver())
                .getHeader()
                .clickPlanSponsorsMenu()
//                .closeCookieBanner()
                .pauseHeroCarousel()
                .takePercyFullPageScreenshot(getDriver(), "Plan Sponsors page");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIPFinancialProfessionals() {
        new IndividualsPage(getDriver())
                .getHeader()
                .clickFinancialProfessionalsMenu()
//                .closeCookieBanner()
                .pauseHeroCarousel()
                .takePercyFullPageScreenshot(getDriver(), "Financial Professionals page");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsViewAll() {
        new IndividualsPage(getDriver())
//                .closeCookieBanner()
                .clickProductsSolutionsOpenMenu()
                .clickViewAllLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals View All");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsCashAccount() {
        new IndividualsPage(getDriver())
//                .closeCookieBanner()
                .clickProductsSolutionsOpenMenu()
                .clickCashAccountLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals High-yield cash account");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsRollover() {
        new IndividualsPage(getDriver())
//                .closeCookieBanner()
                .clickProductsSolutionsOpenMenu()
                .clickRolloverLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Rollover");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsLogin() {
        new IndividualsPage(getDriver())
//                .closeCookieBanner()
                .clickLoginButton()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Login page");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsOpenAccount() {
        new IndividualsPage(getDriver())
                .clickOpenAccountHeaderButton()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Open account page");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsOpenAccountCreatePersonalDashboard() {
        new IndividualsPage(getDriver())
                .clickOpenAccountHeaderButton()
                .clickCreatePersonalDashBoardButton()
                .takePercyFullPageScreenshot(getDriver(), "Create Personal Dashboard");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsCTAGetStarted() {
        new IndividualsPage(getDriver())
                .clickCTAButtonGetStarted()
                .takePercyFullPageScreenshot(getDriver(), "CTA Get started");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsToolsViewAll() {
        new IndividualsPage(getDriver())
                .clickToolsOpenMenu()
                .clickToolsViewAllLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Tools View All");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsToolsRetirementPlanner() {
        new IndividualsPage(getDriver())
                .clickToolsOpenMenu()
                .clickToolsRetirementPlanner()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Tools Retirement plan");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsFinancialProfessionalsLogin() {
        new IndividualsPage(getDriver())
                .getHeader()
                .clickFinancialProfessionalsMenu()
                .clickLoginButton()
                .takePercyFullPageScreenshot(getDriver(), "Financial Professionals Login page");
    }
}
