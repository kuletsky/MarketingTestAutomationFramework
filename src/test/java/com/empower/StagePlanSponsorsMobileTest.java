package com.empower;

import com.empower.pages.base.BasePage;
import com.empower.pages.IndividualsPage;
import com.empower.pages.PlanServiceCenterPage;
import com.empower.pages.PlanSponsorsPage;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.Arrays;
import java.util.List;

public class StagePlanSponsorsMobileTest extends BaseTest{

    @Test(groups = {"mobile", "tablet"})
    public void testEmpowerLogo() {
        String actualHeading = new IndividualsPage(getDriver())
                .getMobileHeader()
                .clickHamburgerMenuPlanSponsors()
                .clickEmpowerLogo()
                .getHeadingText();

        Assert.assertEquals(actualHeading, "Invest well. Live a little.™");
    }

    @Test(groups = {"mobile", "tablet"})
    public void testHeadingHamburgerMenu() {
        PlanSponsorsPage page = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickPlanSponsorsMenu()
                .getMobileHeader()
                .clickHamburgerMenuPlanSponsors();

        Assert.assertEquals(page.getHamburgerHeadingText(), "Plan Sponsors");
    }

    @Test(groups = {"mobile", "tablet"})
    public void testLoginButton() {
        PlanServiceCenterPage page = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickPlanSponsorsMenu()
                .clickLoginButton();

//        Assert.assertEquals(page.getHeadingText(), "plan service center");
        Assert.assertTrue(page.isNewUrl("plan.empower-retirement.com/planweb"));
    }

    @Test(groups = {"mobile", "tablet"})
    public void testContextualMenuDesktopDisplayed() {
        List<String> expectedContextualMenu = Arrays.asList(
                "Individuals",
                "Financial Professionals"
        );
        List<String> contextualMenuLinks = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickPlanSponsorsMenu()
                .getMobileHeader()
                .clickHamburgerMenuPlanSponsors()
                .getHamburgerContextualMenuLinks();

        Assert.assertEquals(contextualMenuLinks, expectedContextualMenu);
    }

    @Test(groups = {"mobile", "tablet"})
    public void testPrimaryMenuDesktopDisplayed() {
        List<String> expectedPrimaryMenu = Arrays.asList(
                "Markets",
                "Solutions",
                "Experience",
                "Learn",
                "Why Empower"
        );
        List<String> actualPrimaryMenuLinks = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickPlanSponsorsMenu()
                .getMobileHeader()
                .clickHamburgerMenuPlanSponsors()
                .getHamburgerPrimaryMenuLinks();

        Assert.assertEquals(actualPrimaryMenuLinks, expectedPrimaryMenu);
    }

    @Test(groups = {"mobile", "tablet"})
    public void testOpenMenuMarketsDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "Small and growing businesses",
                "Large and mega corporations",
                "Multiple employer plans",
                "Government",
                "Not-for-profit",
                "Taft-Hartley"
        );

        List<String> actualOpenMenuLinks = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickPlanSponsorsMenu()
                .getMobileHeader()
                .clickHamburgerMenuPlanSponsors()
                .clickHamburgerMarketsOpenMenu()
                .getHamburgerMarketsOpenMenuLinks();

        Assert.assertEquals(actualOpenMenuLinks, expectedOpenMenu);
    }

    @Test(groups = {"mobile", "tablet"})
    public void testOpenMenuSolutionsDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "Integrated workplace solutions",
                "Advisory services",
                "Retirement solutions",
                "Defined contribution plans",
                "Defined benefit plans",
                "Nonqualified plans",
                "Empower benefit consulting services",
                "Stock plan services",
                "Consumer-directed health"
        );

        List<String> actualOpenMenuLinks = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickPlanSponsorsMenu()
                .getMobileHeader()
                .clickHamburgerMenuPlanSponsors()
                .clickHamburgerSolutionsOpenMenu()
                .getHamburgerSolutionsOpenMenuLinks();

        Assert.assertEquals(actualOpenMenuLinks, expectedOpenMenu);
    }

    @Test(groups = {"mobile", "tablet"})
    public void testOpenMenuExperienceDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "Plan servicing",
                "Participant engagement"
        );

        List<String> actualOpenMenuLinks = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickPlanSponsorsMenu()
                .getMobileHeader()
                .clickHamburgerMenuPlanSponsors()
                .clickHamburgerExperienceOpenMenu()
                .getHamburgerExperienceOpenMenuLinks();

        Assert.assertEquals(actualOpenMenuLinks, expectedOpenMenu);
    }

    @Test(groups = {"mobile", "tablet"})
    public void testOpenMenuLearnDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "Investment Insights",
                "The Currency"
        );

        List<String> actualOpenMenuLinks = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickPlanSponsorsMenu()
                .getMobileHeader()
                .clickHamburgerMenuPlanSponsors()
                .clickHamburgerLearnOpenMenu()
                .getHamburgerLearnOpenMenuLinks();

        Assert.assertEquals(actualOpenMenuLinks, expectedOpenMenu);
    }

    @Test(groups = {"mobile", "tablet"})
    public void testOpenMenuWhyEmpowerDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "About us",
                "Cybersecurity",
                "Press Center",
                "Contact us"
        );

        List<String> actualOpenMenuLinks = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickPlanSponsorsMenu()
                .getMobileHeader()
                .clickHamburgerMenuPlanSponsors()
                .clickHamburgerWhyEmpowerOpenMenu()
                .getHamburgerWhyEmpowerOpenMenuLinks();

        Assert.assertEquals(actualOpenMenuLinks, expectedOpenMenu);
    }

    @Test(groups = {"mobile", "tablet"})
    public void testMobileScrollingHeaderDown() {
        BasePage basePage = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickPlanSponsorsMenu()
                .closeCookieBanner()
                .scrollToBottom();

        Assert.assertTrue(basePage.isMobileHeaderShrink());
    }

    @Test(groups = {"mobile", "tablet"})
    public void testMobileScrollingHeaderDownThenUp() {
        BasePage basePage = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickPlanSponsorsMenu()
                .scrollToBottom()
                .scrollToUp();

        Assert.assertTrue(basePage.isMobileHeaderExpand());
    }

//    @Test(groups = {"tablet"})
//    public void testScrollingHeaderDown() {
//        BasePage basePage = new IndividualsPage(getDriver())
//                .closeCookieBanner()
//                .getMobileHeader()
//                .clickHamburgerMenuIndividuals()
//                .clickPlanSponsorsMenu()
//                .closeCookieBanner()
//                .scrollToBottom();
//
//        Assert.assertTrue(basePage.isMobileHeaderExpand());
//    }
//
//    @Test(groups = {"tablet"})
//    public void testScrollingHeaderDownThenUp() {
//        BasePage basePage = new IndividualsPage(getDriver())
//                .closeCookieBanner()
//                .getMobileHeader()
//                .clickHamburgerMenuIndividuals()
//                .clickPlanSponsorsMenu()
//                .scrollToBottom()
//                .scrollToUp();
//
//        Assert.assertTrue(basePage.isHeaderExpand());
//    }

    @Test(groups = {"mobile", "tablet"})
    public void testMobilePlanSponsorsMenuFunctionality() {
        PlanSponsorsPage page = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickPlanSponsorsMenu();

        Assert.assertEquals(page.getHeadingText(), "Trusted leader. Proven innovator.");
        Assert.assertTrue(page.isNewUrl("/plan-sponsors"));
    }

    @Test(groups = {"mobile", "tablet"})
    public void testMobilePlanSponsorMenuHeading() {
        String menuHeadingText = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickPlanSponsorsMenu()
                .getMobileHeader()
                .clickHamburgerMenuPlanSponsors()
                .getHamburgerHeadingText();

        Assert.assertEquals(menuHeadingText, "Plan Sponsors");
    }











}
