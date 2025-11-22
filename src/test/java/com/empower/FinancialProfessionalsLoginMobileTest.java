package com.empower;

import com.empower.pages.FinancialProfessionalsLoginPage;
import com.empower.pages.IndividualsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FinancialProfessionalsLoginMobileTest extends BaseTest {

    @Test(groups = {"mobile", "tablet"})
    public void testFinancialProfessionalsLoginButton() {
        FinancialProfessionalsLoginPage page = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickFinancialProfessionalsMenu()
                .clickLoginButton()
                .clickIAgreePopup()
                .closeCookieBanner(FinancialProfessionalsLoginPage.class)
                .clickFinancialProfessionalsLoginButton();

        Assert.assertTrue(page.isNewUrl("plan.empower-retirement.com"));
    }

    @Test(groups = {"mobile", "tablet"})
    public void testFinancialProfessionalsRegisterNowButton() {
        FinancialProfessionalsLoginPage page = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickFinancialProfessionalsMenu()
                .clickLoginButton()
                .clickIAgreePopup()
                .closeCookieBanner(FinancialProfessionalsLoginPage.class)
                .clickFinancialProfessionalsRegisterNowButton()
                .clickContinuePopup();

        Assert.assertTrue(page.isNewUrl("partner"));
    }

    @Test(groups = {"mobile", "tablet"})
    public void testFinancialProfessionalsRegisterRixtremaButton() {
        FinancialProfessionalsLoginPage page = new IndividualsPage(getDriver())
                .closeCookieBanner()
                .getMobileHeader()
                .clickHamburgerMenuIndividuals()
                .clickFinancialProfessionalsMenu()
                .clickLoginButton()
                .clickIAgreePopup()
                .closeCookieBanner(FinancialProfessionalsLoginPage.class)
                .clickFinancialProfessionalsRegisterRixtremaButton()
                .clickContinuePopup();

        Assert.assertTrue(page.isNewUrl("rixtrema.net"));
    }

}
