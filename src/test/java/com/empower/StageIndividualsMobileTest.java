package com.empower;

import com.empower.pages.BasePage;
import com.empower.pages.IndividualsPage;
import com.empower.pages.OnBoardingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class StageIndividualsMobileTest extends BaseTest {

    @Test(groups = {"mobile", "tablet"})
    public void testHeadingHamburgerMenu() {
        IndividualsPage page = new IndividualsPage(getDriver())
                .getMobileHeader()
                .clickHamburgerMenuIndividuals();

        Assert.assertEquals(page.getHamburgerHeadingText(), "Individuals");
    }

    @Test(groups = {"mobile", "tablet"})
    public void testHamburgerContextualMenuDisplayed() {
        List<String> expectedContextualMenu = Arrays.asList(
                "Plan Sponsors",
                "Financial Professionals"
        );
        List<String> actualContextualMenuLinks = new IndividualsPage(getDriver())
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .getHamburgerContextualMenuLinks();

        Assert.assertEquals(actualContextualMenuLinks, expectedContextualMenu);
    }

    @Test(groups = {"mobile", "tablet"})
    public void testHamburgerPrimaryMenuDisplayed() {
        List<String> expectedPrimaryMenu = Arrays.asList(
                "Products & Solutions",
                "Tools",
                "Learn",
                "Why Empower"
        );
        List<String> actualPrimaryMenuLinks = new IndividualsPage(getDriver())
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .getHamburgerPrimaryMenuLinks();

        Assert.assertEquals(actualPrimaryMenuLinks, expectedPrimaryMenu);
    }

    @Test(groups = {"mobile", "tablet"})
    public void testHamburgerOpenMenuProductSolutionsDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "View All",
                "Wealth Management",
                "High-yield cash account",
                "Rollover",
                "IRAs",
                "Investment accounts"
        );
        List<String> actualOpenMenuLinks = new IndividualsPage(getDriver())
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerProductsSolutionsLink()
                .getHamburgerProductsSolutionsOpenMenuLinks();

        Assert.assertEquals(actualOpenMenuLinks, expectedOpenMenu);
    }

    @Test(groups = {"mobile", "tablet"})
    public void testHamburgerOpenMenuToolsDisplayed() {
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
        List<String> actualOpenMenuLinks = new IndividualsPage(getDriver())
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerToolsOpenMenu()
                .getToolsOpenMenuLinks();

        Assert.assertEquals(actualOpenMenuLinks, expectedOpenMenu);
    }

    @Test(groups = {"mobile", "tablet"})
    public void testHamburgerOpenMenuLearnDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "Investment Insights",
                "The Currency"
        );
        List<String> actualOpenMenuLinks = new IndividualsPage(getDriver())
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerLearnOpenMenu()
                .getLearnOpenMenuLinks();

        Assert.assertEquals(actualOpenMenuLinks, expectedOpenMenu);
    }

    @Test(groups = {"mobile", "tablet"})
    public void testHamburgerOpenMenuWhyEmpowerDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "About us",
                "Cybersecurity",
                "Press Center",
                "Contact us"
        );

        List<String> actualOpenMenuLinks = new IndividualsPage(getDriver())
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickHamburgerWhyEmpowerOpenMenu()
                .getWhyEmpowerOpenMenuLinks();

        Assert.assertEquals(actualOpenMenuLinks, expectedOpenMenu);
    }

    @Test(groups = {"mobile"})
    public void testMobileCTAButtonConnectMyAccounts2() {
        OnBoardingPage page = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .clickMobileCTAButtonConnectMyAccounts2();

        Assert.assertEquals(page.getHeadingOfPopup(),
                "Please confirm the type of account you want to open");
        Assert.assertTrue(page.isNewUrl("onboarding-v2"));
    }

    @Test(groups = {"mobile", "tablet"})
    public void testMobileScrollingHeaderDown() {
        BasePage basePage = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .scrollToBottom();

        Assert.assertTrue(basePage.isMobileHeaderShrink());
    }

    @Test(groups = {"mobile", "tablet"})
    public void testMobileScrollingHeaderDownThenUp() {
        BasePage basePage = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .scrollToBottom()
                .scrollToUp();

        Assert.assertTrue(basePage.isMobileHeaderExpand());
    }

}
