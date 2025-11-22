package com.empower;

import com.empower.pages.FinancialProfessionalsLoginPage;
import com.empower.pages.IndividualsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FinancialProfessionalsLoginTest extends BaseTest {

    @Test(groups = {"desktop"})
    public void testFinancialProfessionalsLoginButton() {
        FinancialProfessionalsLoginPage page = new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickFinancialProfessionalsMenu()
                .clickLoginButton()
                .clickIAgreePopup()
                .clickFinancialProfessionalsLoginButton();

        Assert.assertTrue(page.isNewUrl("plan.empower-retirement.com"));
    }

    @Test(groups = {"desktop"})
    public void testFinancialProfessionalsRegistrationNowButton() {
        FinancialProfessionalsLoginPage page = new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickFinancialProfessionalsMenu()
                .clickLoginButton()
                .clickIAgreePopup()
                .closeCookieBanner(FinancialProfessionalsLoginPage.class)
                .clickFinancialProfessionalsRegisterNowButton()
                .clickContinuePopup();

        Assert.assertTrue(page.isNewUrl("plan.retirementpartner.com"));
    }

    @Test(groups = {"desktop"})
    public void testFinancialProfessionalsRegistrationRixtremaButton() {
        FinancialProfessionalsLoginPage page = new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickFinancialProfessionalsMenu()
                .clickLoginButton()
                .clickIAgreePopup()
                .closeCookieBanner(FinancialProfessionalsLoginPage.class)
                .clickFinancialProfessionalsRegisterRixtremaButton()
                .clickContinuePopup();

        Assert.assertTrue(page.isNewUrl("rixtrema.net"));
    }

}
