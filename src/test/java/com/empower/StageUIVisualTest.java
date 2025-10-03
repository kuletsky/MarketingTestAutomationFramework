package com.empower;

import com.empower.pages.IndividualsPage;
import org.testng.annotations.Test;


public class StageUIVisualTest extends BaseTest {

    @Test(groups = {"desktop-visual", "mobile-visual"})
    public void testUIIndividuals() {
        new IndividualsPage(getDriver())
                .takePercyFullPageScreenshot(getDriver(), "Individuals page");

//        PercySDK.screenshot(getDriver(), "Home – default");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIPlanSponsors() {
        new IndividualsPage(getDriver())
                .getHeader()
                .clickPlanSponsorsMenu()
                .takePercyFullPageScreenshot(getDriver(), "Plan Sponsors page");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIPFinancialProfessionals() {
        new IndividualsPage(getDriver())
                .getHeader()
                .clickFinancialProfessionalsMenu()
                .takePercyFullPageScreenshot(getDriver(), "Financial Professionals page");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsSolutionsViewAll() {
        new IndividualsPage(getDriver())
                .clickProductsSolutionsOpenMenu()
                .clickViewAllLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals View All");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsSolutionsCashAccount() {
        new IndividualsPage(getDriver())
                .clickProductsSolutionsOpenMenu()
                .clickCashAccountLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals High-yield cash account");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsSolutionsRollover() {
        new IndividualsPage(getDriver())
                .clickProductsSolutionsOpenMenu()
                .clickRolloverLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Rollover");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsSolutionsPrivateClient() {
        new IndividualsPage(getDriver())
                .clickProductsSolutionsOpenMenu()
                .clickWealthManagementLink()
                .clickPrivetClientLink()
                .takePercyFullPageScreenshot(getDriver(), "Individuals Private Client");
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
    public void testUIIndividualsLogin() {
        new IndividualsPage(getDriver())
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
                .closeCookieBanner()
                .clickCTAButtonGetStarted()
                .takePercyFullPageScreenshot(getDriver(), "CTA Get started");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsFinancialProfessionalsLogin() {
        new IndividualsPage(getDriver())
                .getHeader()
                .clickFinancialProfessionalsMenu()
                .clickLoginButton()
                .takePercyFullPageScreenshot(getDriver(), "Financial Professionals Login page");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsLearnInvestmentInsights() {
        new IndividualsPage(getDriver())
                .clickLearnOpenMenu()
                .clickLearnInvestmentInsights()
                .takePercyFullPageScreenshot(getDriver(), "Investment Insights page");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsLearnTheCurrency() {
        new IndividualsPage(getDriver())
                .clickLearnOpenMenu()
                .clickLearnTheCurrency()
                .takePercyFullPageScreenshot(getDriver(), "The Currency page");
    }

    @Test(groups = {"desktop-visual"})
    public void testUIIndividualsWhyEmpowerPressCenter() {
        new IndividualsPage(getDriver())
                .clickWhyEmpowerOpenMenu()
                .clickWhyEmpowerPressCenter()
                .takePercyFullPageScreenshot(getDriver(), "Press Center page");
    }

}
