package com.empower;

import com.empower.pages.FinancialProfessionalsLoginPage;
import com.empower.pages.IndividualsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StageFinancialProfessionalsLoginMobileTest extends BaseTest {

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
    public void testFinancialProfessionalsRegistrationNowButton() {
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

        Assert.assertTrue(page.isNewUrl("/partnerlink"));
    }

    @Test(groups = {"mobile", "tablet"})
    public void testFinancialProfessionalsRegistrationRixtremaButton() {
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
