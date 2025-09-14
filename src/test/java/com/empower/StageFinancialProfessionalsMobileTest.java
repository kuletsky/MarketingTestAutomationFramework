package com.empower;


import com.empower.pages.BasePage;
import com.empower.pages.FinancialProfessionalsLoginPage;
import com.empower.pages.FinancialProfessionalsPage;
import com.empower.pages.IndividualsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class StageFinancialProfessionalsMobileTest extends BaseTest{

    @Test(groups = {"mobile", "tablet"})
    public void testEmpowerLogo() {
        String actualHeading = new IndividualsPage(getDriver())
                .getMobileHeader()
                .clickHamburgerMenuFinancialProfessionals()
                .clickEmpowerLogo()
                .getHeadingText();

        Assert.assertEquals(actualHeading, "Invest well. Live a little.™");
        Assert.assertTrue(new BasePage(getDriver()).isNewUrl("https://empwrretiremtstg.prod.acquia-sites.com/"));
    }

    @Test(groups = {"mobile", "tablet"})
    public void testHeadingHamburgerMenu() {
        FinancialProfessionalsPage page = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickFinancialProfessionalsMenu()
                .getMobileHeader()
                .clickHamburgerMenuFinancialProfessionals();

        Assert.assertEquals(page.getHamburgerHeadingText(), "Financial Professionals");
    }

    @Test(groups = {"mobile", "tablet"})
    public void testLoginButton() {
        FinancialProfessionalsLoginPage page = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickFinancialProfessionalsMenu()
                .clickLoginButton();

        Assert.assertTrue(page.getHeadingText().contains("The information"));
        Assert.assertTrue(page.isNewUrl("financial-professionals-login"));
    }

    @Test(groups = {"mobile", "tablet"})
    public void testContextualMenuDesktopDisplayed() {
        List<String> expectedContextualMenu = Arrays.asList(
                "Individuals",
                "Plan Sponsors"
        );
        List<String> contextualMenuLinks = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickFinancialProfessionalsMenu()
                .getMobileHeader()
                .clickHamburgerMenuFinancialProfessionals()
                .getHamburgerContextualMenuLinks();

        Assert.assertEquals(contextualMenuLinks, expectedContextualMenu);
    }

    @Test(groups = {"mobile", "tablet"})
    public void testPrimaryMenuDesktopDisplayed() {
        List<String> expectedPrimaryMenu = Arrays.asList(
                "Solutions",
                "Resources",
                "Insights",
                "Why Empower"
        );
        List<String> actualPrimaryMenuLinks = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickFinancialProfessionalsMenu()
                .getMobileHeader()
                .clickHamburgerMenuFinancialProfessionals()
                .getHamburgerPrimaryMenuLinks();

        Assert.assertEquals(actualPrimaryMenuLinks, expectedPrimaryMenu);
    }

    @Test(groups = {"mobile", "tablet"})
    public void testOpenMenuSolutionsDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "Markets",
                "Retirement products",
                "Participant experience",
                "Fiduciary advice solutions",
                "Retirement income solutions",
                "Stock plan services",
                "Empower benefit consulting services",
                "Nonqualified plans"
        );
        List<String> actualOpenMenuLinks = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickFinancialProfessionalsMenu()
                .getMobileHeader()
                .clickHamburgerMenuFinancialProfessionals()
                .clickHamburgerSolutionsOpenMenu()
                .getHamburgerSolutionsOpenMenuLinks();

        Assert.assertEquals(actualOpenMenuLinks, expectedOpenMenu);
    }

    @Test(groups = {"mobile", "tablet"})
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
        List<String> actualOpenMenuLinks = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickFinancialProfessionalsMenu()
                .getMobileHeader()
                .clickHamburgerMenuFinancialProfessionals()
                .clickHamburgerResourcesOpenMenu()
                .getHamburgerResourcesOpenMenuLinks();

        Assert.assertEquals(actualOpenMenuLinks, expectedOpenMenu);
    }

    @Test(groups = {"mobile", "tablet"})
    public void testOpenMenuInsightsDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "Investment Insights",
                "Legislative & regulatory news",
                "The Currency"
        );
        List<String> actualOpenMenuLinks = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickFinancialProfessionalsMenu()
                .getMobileHeader()
                .clickHamburgerMenuFinancialProfessionals()
                .clickHamburgerInsightsOpenMenu()
                .getHamburgerInsightsOpenMenuLinks();

        Assert.assertEquals(actualOpenMenuLinks, expectedOpenMenu);
    }

    @Test(groups = {"mobile", "tablet"})
    public void testOpenMenuWhyEmpowerDisplayed() {
        List<String> expectedOpenMenu = Arrays.asList(
                "About us",
                "Contact us",
                "Cybersecurity",
                "Press Center"
        );
        List<String> actualOpenMenuLinks = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickFinancialProfessionalsMenu()
                .getMobileHeader()
                .clickHamburgerMenuFinancialProfessionals()
                .clickHamburgerWhyEmpowerOpenMenu()
                .getHamburgerWhyEmpowerOpenMenuLinks();

        Assert.assertEquals(actualOpenMenuLinks, expectedOpenMenu);
    }
}
