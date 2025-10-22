package com.empower;

import com.empower.pages.*;
import com.empower.pages.base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class StageFinancialProfessionalsTest extends BaseTest{

    @Test(groups = {"desktop"})
    public void testEmpowerLogo() {
        String actualHeading = new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickFinancialProfessionalsMenu()
                .getDesktopHeader()
                .clickEmpowerLogo()
                .getHeadingText();

        Assert.assertEquals(actualHeading, "Invest well. Live a little.™");
        Assert.assertTrue(new BasePage(getDriver()).isNewUrl("empwrretiremtstg.prod.acquia-sites.com/"));
    }

    @Test(groups = {"desktop"})
    public void testLoginButton() {
        FinancialProfessionalsLoginPage page = new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickFinancialProfessionalsMenu()
                .clickLoginButton();

        Assert.assertTrue(page.getHeadingText().contains("The information"));
        Assert.assertTrue(page.isNewUrl("financial-professionals-login"));
    }

//    @Test(groups = {"desktop"})
//    public void testPartnerLoginButton() {
//        new IndividualsPage(getDriver())
//                .getHeader()
//                .clickFinancialProfessionalsMenu()
//                .clickLoginButton()
//                .clickIAgreePopup();
//
//        PartnerPage page = new LoginV1Page(getDriver())
//                        .clickPartnerLoginButton();
//
//        Assert.assertTrue(page.isNewUrl("plan.empower-retirement.com"));
////        Assert.assertEquals(page.getHeadingText(),"Partner");
//    }


    @Test(groups = {"desktop"})
    public void testFinancialProfessionalsMenuFunctionality() {
        FinancialProfessionalsPage page = new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickFinancialProfessionalsMenu();

        Assert.assertEquals(page.getHeadingText(), "Solutions, support, success");
        Assert.assertTrue(page.isNewUrl("financial-professionals"));
    }

    @Test(groups = {"desktop"})
    public void testScrollingHeaderDown() {
        BasePage basePage = new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickFinancialProfessionalsMenu()
                .scrollToBottom();

        Assert.assertTrue(basePage.isHeaderShrink());
    }

    @Test(groups = {"desktop"})
    public void testScrollingHeaderDownThenUp() {
        BasePage basePage = new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickFinancialProfessionalsMenu()
                .scrollToBottom()
                .scrollToUp();

        Assert.assertTrue(basePage.isHeaderExpand());
    }

    @Test(groups = {"desktop"})
    public void testPrimaryMenuDesktopDisplayed() {
        List<String> expectedPrimaryMenu = Arrays.asList(
                "Solutions",
                "Resources",
                "Insights",
                "Why Empower"
        );
        List<String> primaryMenuLinks = new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickFinancialProfessionalsMenu()
                .getPrimaryMenuLinks();

        Assert.assertEquals(primaryMenuLinks, expectedPrimaryMenu);
    }

    @Test(groups = {"desktop"})
    public void testContextualMenuDesktopDisplayed() {
        List<String> expectedContextualMenu = Arrays.asList(
                "Individuals",
                "Plan Sponsors",
                "Financial Professionals"
        );
        List<String> contextualMenuLinks = new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickFinancialProfessionalsMenu()
                .getContextualMenuLinks();

        Assert.assertEquals(contextualMenuLinks, expectedContextualMenu);
    }

    @Test(groups = {"desktop"})
    public void testOpenMenuSolutionsDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "Markets",
                "Retirement products",
                "Integrated workplace solutions",
                "Participant experience",
                "Fiduciary advice solutions",
                "Retirement income solutions",
                "Stock plan services",
                "Empower benefit consulting services",
                "Nonqualified plans",
                "Defined benefit plans",
                "Consumer-directed health"
        );
        FinancialProfessionalsPage page = new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickFinancialProfessionalsMenu()
                .clickSolutionsOpenMenu();

        Assert.assertEquals(page.getSolutionsLinks(), expectedOpenMenu);
        Assert.assertEquals(page.getHeadingSolutionsMenu(), "Solutions");
    }

    @Test(groups = {"desktop"})
    public void testOpenMenuResourcesDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "Prospecting & proposals",
                "Plan management",
                "APIs",
                "Advisor toolkit",
                "TPA toolkit",
                "Plan sponsor toolkit",
                "Participant toolkit",
                "Partner advocate",
                "Events"
        );
        FinancialProfessionalsPage page = new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickFinancialProfessionalsMenu()
                .clickResourcesOpenMenu();

        Assert.assertEquals(page.getResourcesLinks(), expectedOpenMenu);
        Assert.assertEquals(page.getHeadingResourcesMenu(), "Resources");
    }

    @Test(groups = {"desktop"})
    public void testOpenMenuInsightsDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "Investment Insights",
                "Legislative & regulatory news",
                "The Currency"
        );

        FinancialProfessionalsPage page = new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickFinancialProfessionalsMenu()
                .clickInsightsOpenMenu();

        Assert.assertEquals(page.getInsightsLinks(), expectedOpenMenu);
        Assert.assertEquals(page.getHeadingInsightsMenu(), "Insights");
    }

    @Test(groups = {"desktop"})
    public void testOpenMenuWhyEmpowerDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "About us",
                "Contact us",
                "Cybersecurity",
                "Press Center"
        );
        FinancialProfessionalsPage page = new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickFinancialProfessionalsMenu()
                .clickWhyEmpowerOpenMenu();

        Assert.assertEquals(page.getEmpowerLinks(), expectedOpenMenu);
        Assert.assertEquals(page.getHeadingEmpowerMenu(), "Why Empower");
    }


}
