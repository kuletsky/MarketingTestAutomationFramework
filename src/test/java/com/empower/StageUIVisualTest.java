package com.empower;

import com.empower.pages.IndividualsPage;
import org.testng.annotations.Test;


public class StageUIVisualTest extends BaseTest {

    @Test(groups = {"desktop-visual"})
    public void testUIIndividuals() {
        new IndividualsPage(getDriver())
//                .closeCookieBanner()
                .takePercyFullPageScreenshot(getDriver(), "Individuals page");

//        PercySDK.screenshot(getDriver(), "Home – default");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIPlanSponsors() {
        new IndividualsPage(getDriver())
                .getHeader()
                .clickPlanSponsorsMenu()
//                .closeCookieBanner()
                .takePercyFullPageScreenshot(getDriver(), "Plan Sponsors page");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIPFinancialProfessionals() {
        new IndividualsPage(getDriver())
                .getHeader()
                .clickFinancialProfessionalsMenu()
//                .closeCookieBanner()
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
    public void testUIIndividualsMenuProductsSolutions() {
        new IndividualsPage(getDriver())
                .closeCookieBanner()
                .clickProductsSolutionsOpenMenu()
                .takePercyShortPageScreenshot(getDriver(), "Menu Products Solutions");
    }
}
