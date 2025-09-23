package com.empower;

import com.empower.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class StageIndividualsTest extends BaseTest{

    @Test(groups = {"desktop"})
    public void testEmpowerLogo() {
        IndividualsPage page = new IndividualsPage(getDriver())
                .getHeader()
                .clickFinancialProfessionalsMenu()
                .clickEmpowerLogo();

        Assert.assertEquals(page.getHeadingText(), "Invest well. Live a little.™");
        Assert.assertTrue(page.isNewUrl("empwrretiremtstg"), "https://empwrretiremtstg.prod.acquia-sites.com/");
    }

    @Test(groups = {"desktop", "mobile", "tablet"})
    public void testOpenAccountHeaderButton() {
        OnBoardingPage page = new IndividualsPage(getDriver())
                .getHeader()
                .clickOpenAccountHeaderButton();

        Assert.assertEquals(page.getHeadingOfPopup(),
                "Please confirm the type of account you want to open");
        Assert.assertTrue(page.isNewUrl("onboarding-v2"));
    }

    @Test(groups = {"desktop", "mobile", "tablet"})
    public void testLoginButton() {
        LoginV1Page page = new IndividualsPage(getDriver())
                .clickLoginButton();

        Assert.assertEquals(page.getHeadingText(),
                "Where would you like to log in?");
        Assert.assertTrue(page.isNewUrl("login-v1"));
    }

    @Test(groups = {"desktop"})
    public void testContextualMenuDesktopDisplayed() {
        List<String> expectedContextualMenu = Arrays.asList(
                "Individuals",
                "Plan Sponsors",
                "Financial Professionals"
        );
        List<String> contextualMenuLinks = new IndividualsPage(getDriver())
                .getContextualMenuLinks();

        Assert.assertEquals(contextualMenuLinks, expectedContextualMenu);
    }

    @Test(groups = {"desktop"})
    public void testPrimaryMenuDesktopDisplayed() {
        List<String> expectedPrimaryMenu = Arrays.asList(
                "Products & Solutions",
                "Tools",
                "Learn",
                "Why Empower"
        );
        List<String> primaryMenuLinks = new IndividualsPage(getDriver())
                .getPrimaryMenuLinks();

        Assert.assertEquals(primaryMenuLinks, expectedPrimaryMenu);
    }

    @Test(groups = {"desktop"})
    public void testIndividualsMenuFunctionality() {
        IndividualsPage page = new IndividualsPage(getDriver())
                .getHeader()
                .clickPlanSponsorsMenu()
                .getHeader()
                .clickIndividualsMenu();

        Assert.assertEquals(page.getHeadingText(), "Invest well. Live a little.™");
        Assert.assertTrue(page.isNewUrl("https://empwrretiremtstg.prod.acquia-sites.com/"));
    }

    @Test(groups = {"desktop"})
    public void testScrollingHeaderDown() {
        BasePage basePage = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .scrollToBottom();

        Assert.assertTrue(basePage.isHeaderShrink());
    }

    @Test(groups = {"desktop"})
    public void testScrollingHeaderDownThenUp() {
        BasePage basePage = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .scrollToBottom()
                .scrollToUp();

        Assert.assertTrue(basePage.isHeaderExpand());
    }

    @Test(groups = {"desktop"})
    public void testOpenMenuProductSolutionsDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "View All",
                "Wealth Management",
                "High-yield cash account",
                "Rollover",
                "IRAs",
                "Investment accounts"
        );

        IndividualsPage page = new IndividualsPage(getDriver())
                .clickProductsSolutionsOpenMenu();

        Assert.assertEquals(page.getProductsSolutionsLinks(), expectedOpenMenu);
        Assert.assertEquals(page.getHeadingProductsSolutionsMenu(), "Products & solutions");
    }

    @Test(groups = {"desktop"})
    public void testOpenMenuToolsDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "View All",
                "Retirement Planner",
                "Net Worth",
                "Budgeting & Cash Flow",
                "Portfolio Analysis",
                "Savings Planner",
                "Debt Paydown",
                "Emergency Fund",
                "Transactions"
        );

        IndividualsPage page = new IndividualsPage(getDriver())
                .clickToolsOpenMenu();

        Assert.assertEquals(page.getToolsLinks(), expectedOpenMenu);
        Assert.assertEquals(page.getHeadingToolsMenu(), "Financial tools");
    }

    @Test(groups = {"desktop"})
    public void testOpenMenuLearnDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "Investment Insights",
                "The Currency"
        );

        IndividualsPage page = new IndividualsPage(getDriver())
                .clickLearnOpenMenu();

        Assert.assertEquals(page.getLearnLinks(), expectedOpenMenu);
        Assert.assertTrue(page.getHeadingLearnMenu().contains("The Currency"));
    }

    @Test(groups = {"desktop"})
    public void testOpenMenuWhyEmpowerDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "About us",
                "Cybersecurity",
                "Press Center",
                "Contact us"
        );

        IndividualsPage page = new IndividualsPage(getDriver())
                .clickWhyEmpowerOpenMenu();

        Assert.assertEquals(page.getEmpowerLinks(), expectedOpenMenu);
        Assert.assertEquals(page.getHeadingEmpowerMenu(), "About us");
    }

    @Test(groups = {"desktop", "mobile", "tablet"})
    public void testCTAButtonOpenAccount1() {
        OnBoardingPage page = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .clickCTAButtonOpenAccount1();

        Assert.assertEquals(page.getHeadingOfPopup(),
                "Please confirm the type of account you want to open");
        Assert.assertTrue(page.isNewUrl("onboarding-v2"));
    }

    @Test(groups = {"desktop", "mobile", "tablet"})
    public void testCTAButtonScheduleCall1() {
        SchedulePage page = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .clickCTAButtonScheduleCall1()
                .clickContinueButton();

//        Assert.assertEquals(page.getHeadingText(), "helping hand.");
        Assert.assertTrue(page.isNewUrl("/schedule-appointment"));
    }

    @Test(groups = {"desktop", "mobile", "tablet"})
    public void testCTAButtonOpenAccount2() {
        OnBoardingPage page = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .clickCTAButtonOpenAccount2();

        Assert.assertEquals(page.getHeadingOfPopup(),
                "Please confirm the type of account you want to open");
        Assert.assertTrue(page.isNewUrl("onboarding-v2"));
    }

    @Test(groups = {"desktop", "mobile", "tablet"})
    public void testCTAButtonScheduleCall2() {
        SchedulePage page = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .clickCTAButtonScheduleCall2()
                .clickContinueButton();

//        Assert.assertEquals(page.getHeadingText(), "helping hand.");
        Assert.assertTrue(page.isNewUrl("/schedule-appointment"));
    }

    @Test(groups = {"desktop", "mobile", "tablet"})
    public void testCTAButtonConnectMyAccounts() {
        OnBoardingPage page = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .clickCTAButtonConnectMyAccounts1();

        Assert.assertEquals(page.getHeadingOfPopup(),
                "Please confirm the type of account you want to open");
        Assert.assertTrue(page.isNewUrl("onboarding-v2"));
    }

    @Test(groups = {"desktop", "mobile", "tablet"})
    public void testCTAButtonTakeMeThere() {
        ProductsSolutionsPage page = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .clickCTAButtonTakeMeThere();

        Assert.assertEquals(page.getHeadingText(),
                "Your helping hand to invest well");
        Assert.assertTrue(page.isNewUrl("products-solutions"));
    }

    @Test(groups = {"desktop", "mobile", "tablet"})
    public void testCTAButtonExploreTheTools() {
        ToolsPage page = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .clickCTAButtonExploreTheTools();

        Assert.assertEquals(page.getHeadingText(),
                "Financial freedom starts here");
        Assert.assertTrue(page.isNewUrl("tools"));
    }

    @Test(groups = {"desktop", "mobile", "tablet"})
    public void testCTAButtonStartRollover() {
        IrasPage page = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .clickCTAButtonStartRollover();

        Assert.assertEquals(page.getHeadingText(),
                "Retire on your terms");
        Assert.assertTrue(page.isNewUrl("iras"));
    }

    @Test(groups = {"desktop", "mobile", "tablet"})
    public void testCTAButtonWorkWithUs() {
        WorkplaceRetirementPage page = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .clickCTAButtonWorkWithUs();

//        Assert.assertEquals(page.getHeadingText(),
//                "Ongoing in-depth financial support");
        Assert.assertTrue(page.isNewUrl("workplace-retirement"));
    }

    @Test(groups = {"desktop", "tablet"})
    public void testCTAButtonConnectMyAccounts2() {
        OnBoardingPage page = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .clickCTAButtonConnectMyAccounts2();

        Assert.assertEquals(page.getHeadingOfPopup(),
                "Please confirm the type of account you want to open");
        Assert.assertTrue(page.isNewUrl("onboarding-v2"));
    }

    @Test(groups = {"desktop", "mobile", "tablet"})
    public void testCTAButtonLearnMore() {
        String headingText = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .clickCTAButtonLearnMore()
                .getHeadingTextOfSecurityPage();

        Assert.assertEquals(headingText,
                "Cybersecurity you can count on");
        Assert.assertTrue(getDriver().getCurrentUrl().contains("cybersecurity"));
    }

}
