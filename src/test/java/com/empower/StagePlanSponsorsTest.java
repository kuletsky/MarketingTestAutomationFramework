package com.empower;

import com.empower.pages.base.BasePage;
import com.empower.pages.IndividualsPage;
import com.empower.pages.PlanServiceCenterPage;
import com.empower.pages.PlanSponsorsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class StagePlanSponsorsTest extends BaseTest{

    @Test(groups = {"desktop"})
    public void testEmpowerLogo() {
        String actualHeading = new IndividualsPage(getDriver())
                .getHeader()
                .clickPlanSponsorsMenu()
                .getHeader()
                .clickEmpowerLogo()
                .getHeadingText();

        Assert.assertEquals(actualHeading, "Invest well. Live a little.™");
        Assert.assertTrue(new BasePage(getDriver()).isNewUrl("https://empwrretiremtstg.prod.acquia-sites.com/"));
    }

    @Test(groups = {"desktop"})
    public void testLoginButton() {
        PlanServiceCenterPage page = new IndividualsPage(getDriver())
                .getHeader()
                .clickPlanSponsorsMenu()
                .clickLoginButton();

//        Assert.assertEquals(page.getHeadingText(), "plan service center");
        Assert.assertTrue(page.isNewUrl("plan.empower-retirement.com/planweb"));
    }

    @Test(groups = {"desktop"})
    public void testContextualMenuDesktopDisplayed() {
        List<String> expectedContextualMenu = Arrays.asList(
                "Individuals",
                "Plan Sponsors",
                "Financial Professionals"
        );
        List<String> contextualMenuLinks = new IndividualsPage(getDriver())
                .getHeader()
                .clickPlanSponsorsMenu()
                .getContextualMenuLinks();

        Assert.assertEquals(contextualMenuLinks, expectedContextualMenu);
    }

    @Test(groups = {"desktop"})
    public void testPrimaryMenuDesktopDisplayed() {
        List<String> expectedPrimaryMenu = Arrays.asList(
                "Markets",
                "Solutions",
                "Experience",
                "Learn",
                "Why Empower"
        );
        List<String> primaryMenuLinks = new IndividualsPage(getDriver())
                .getHeader()
                .clickPlanSponsorsMenu()
                .getPrimaryMenuLinks();

        Assert.assertEquals(primaryMenuLinks, expectedPrimaryMenu);
    }

    @Test(groups = {"desktop"})
    public void testPlanSponsorsFunctionality() {
        PlanSponsorsPage page = new IndividualsPage(getDriver())
                .getHeader()
                .clickPlanSponsorsMenu();

        Assert.assertEquals(page.getHeadingText(), "Trusted leader. Proven innovator.");
        Assert.assertTrue(page.isNewUrl("plan-sponsors"));
    }

    @Test(groups = {"desktop"})
    public void testScrollingHeaderDown() {
        BasePage basePage = new IndividualsPage(getDriver())
                .getHeader()
                .clickPlanSponsorsMenu()
                .scrollToBottom();

        Assert.assertTrue(basePage.isHeaderShrink());
    }


    @Test(groups = {"desktop"})
    public void testScrollingHeaderDownThenUp() {
        BasePage basePage = new IndividualsPage(getDriver())
                .getHeader()
                .clickPlanSponsorsMenu()
                .scrollToBottom()
                .scrollToUp();

        Assert.assertTrue(basePage.isHeaderExpand());
    }

    @Test(groups = {"desktop"})
    public void testOpenMenuMarketsDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "Small and growing businesses",
                "Large and mega corporations",
                "Multiple employer plans",
                "Government",
                "Not-for-profit",
                "Taft-Hartley"
        );

        PlanSponsorsPage page = new IndividualsPage(getDriver())
                .getHeader()
                .clickPlanSponsorsMenu()
                .clickMarketsOpenMenu();

        Assert.assertEquals(page.getMarketsLinks(), expectedOpenMenu);
        Assert.assertEquals(page.getHeadingMarketsMenu(), "Markets");
    }

    @Test(groups = {"desktop"})
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

        PlanSponsorsPage page = new IndividualsPage(getDriver())
                .getHeader()
                .clickPlanSponsorsMenu()
                .clickSolutionsOpenMenu();

        Assert.assertEquals(page.getSolutionsLinks(), expectedOpenMenu);
        Assert.assertEquals(page.getHeadingSolutionsMenu(), "Solutions");
    }

    @Test(groups = {"desktop"})
    public void testOpenMenuExperienceDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "Plan servicing",
                "Participant engagement"
        );

        PlanSponsorsPage page = new IndividualsPage(getDriver())
                .getHeader()
                .clickPlanSponsorsMenu()
                .clickExperienceOpenMenu();

        Assert.assertEquals(page.getExperienceLinks(), expectedOpenMenu);
        Assert.assertEquals(page.getHeadingExperienceMenu(), "Experience");
    }

    @Test(groups = {"desktop"})
    public void testOpenMenuLearnDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "Investment Insights",
                "The Currency"
        );

        PlanSponsorsPage page = new IndividualsPage(getDriver())
                .getHeader()
                .clickPlanSponsorsMenu()
                .clickLearnOpenMenu();

        Assert.assertEquals(page.getLearnLinks(), expectedOpenMenu);
        Assert.assertTrue(page.getHeadingLearnMenu().contains("Learn"));
    }

    @Test(groups = {"desktop"})
    public void testOpenMenuWhyEmpowerDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "About us",
                "Cybersecurity",
                "Press Center",
                "Contact us"
        );

        PlanSponsorsPage page = new PlanSponsorsPage(getDriver())
                .getHeader()
                .clickPlanSponsorsMenu()
                .clickWhyEmpowerOpenMenu();

        Assert.assertEquals(page.getEmpowerLinks(), expectedOpenMenu);
        Assert.assertEquals(page.getHeadingEmpowerMenu(), "Why Empower");
    }

}
