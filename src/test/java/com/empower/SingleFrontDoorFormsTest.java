package com.empower;

import com.empower.pages.IndividualsPage;
import com.empower.pages.SignupPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleFrontDoorFormsTest extends BaseTest {
        private final static String FORM_URL = "https://empwrretiremtstg.prod.acquia-sites.com/demo-single-front-door-ctas";

    @Test(groups = {"forms"})
    public void testDefaultForm() {
        SignupPage page = new IndividualsPage(getDriver())
                .gotoURL(FORM_URL)
                .closeCookieBanner(SignupPage.class)
                .clickViewDefaultForm();

        Assert.assertEquals(page.getMarketingParamAttribute("name"), "marketing_param");
        Assert.assertEquals(page.getMarketingParamAttribute("value"), "");
        Assert.assertEquals(page.getSkipFirstUseAttribute("value"), "");
        Assert.assertEquals(page.getHeadingText(), "Set up your Empower Personal Dashboard™");
        Assert.assertTrue(page.isUrlChangedOn("/signup/onboarding"));
    }

    @Test(groups = {"forms"})
    public void testRetirementIntentAffiliate() {
        SignupPage page = new IndividualsPage(getDriver())
                .gotoURL(FORM_URL)
                .closeCookieBanner(SignupPage.class)
                .clickViewFormRetirementIntentAffiliate();

        Assert.assertEquals(page.getMarketingParamAttribute("name"), "marketing_param");
        Assert.assertEquals(page.getMarketingParamAttribute("value"), "RetirementIntentAffiliate");
        Assert.assertEquals(page.getSkipFirstUseAttribute("value"), "false");
        Assert.assertEquals(page.getHeadingText(), "Set up your Empower Personal Dashboard™");
        Assert.assertTrue(page.isUrlChangedOn("RetirementIntentAffiliate"));
    }

    @Test(groups = {"forms"})
    public void testZS_tools() {
        SignupPage page = new IndividualsPage(getDriver())
                .gotoURL(FORM_URL)
                .closeCookieBanner(SignupPage.class)
                .clickViewFormZS_tools();

        Assert.assertEquals(page.getMarketingParamAttribute("name"), "marketing_param");
        Assert.assertEquals(page.getMarketingParamAttribute("value"), "zs_tools");
        Assert.assertEquals(page.getSkipFirstUseAttribute("value"), "false");
        Assert.assertEquals(page.getHeadingText(), "Set up your Empower Personal Dashboard™");
        Assert.assertTrue(page.isUrlChangedOn("zs_tools"));
    }

    @Test(groups = {"forms"})
    public void testZS_investment() {
        SignupPage page = new IndividualsPage(getDriver())
                .gotoURL(FORM_URL)
                .closeCookieBanner(SignupPage.class)
                .clickViewFormZS_investment();

        Assert.assertEquals(page.getMarketingParamAttribute("name"), "marketing_param");
        Assert.assertEquals(page.getMarketingParamAttribute("value"), "zs_investment");
        Assert.assertEquals(page.getSkipFirstUseAttribute("value"), "false");
        Assert.assertEquals(page.getHeadingText(), "Set up your Empower Personal Dashboard™");
        Assert.assertTrue(page.isUrlChangedOn("zs_investment"));
    }

    @Test(groups = {"forms"})
    public void testZS_retirement() {
        SignupPage page = new IndividualsPage(getDriver())
                .gotoURL(FORM_URL)
                .closeCookieBanner(SignupPage.class)
                .clickViewFormZS_retirement();

        Assert.assertEquals(page.getMarketingParamAttribute("name"), "marketing_param");
        Assert.assertEquals(page.getMarketingParamAttribute("value"), "zs_retirement");
        Assert.assertEquals(page.getSkipFirstUseAttribute("value"), "false");
        Assert.assertEquals(page.getHeadingText(), "Set up your Empower Personal Dashboard™");
        Assert.assertTrue(page.isUrlChangedOn("zs_retirement"));
    }

    @Test(groups = {"forms"})
    public void testZS_networth() {
        SignupPage page = new IndividualsPage(getDriver())
                .gotoURL(FORM_URL)
                .closeCookieBanner(SignupPage.class)
                .clickViewFormZS_networth();

        Assert.assertEquals(page.getMarketingParamAttribute("name"), "marketing_param");
        Assert.assertEquals(page.getMarketingParamAttribute("value"), "zs_networth");
        Assert.assertEquals(page.getSkipFirstUseAttribute("value"), "false");
        Assert.assertEquals(page.getHeadingText(), "Set up your Empower Personal Dashboard™");
        Assert.assertTrue(page.isUrlChangedOn("zs_networth"));
    }

    @Test(groups = {"forms"})
    public void testZS_budgeting() {
        SignupPage page = new IndividualsPage(getDriver())
                .gotoURL(FORM_URL)
                .closeCookieBanner(SignupPage.class)
                .clickViewFormZS_budgeting();

        Assert.assertEquals(page.getMarketingParamAttribute("name"), "marketing_param");
        Assert.assertEquals(page.getMarketingParamAttribute("value"), "zs_budgeting");
        Assert.assertEquals(page.getSkipFirstUseAttribute("value"), "false");
        Assert.assertEquals(page.getHeadingText(), "Set up your Empower Personal Dashboard™");
        Assert.assertTrue(page.isUrlChangedOn("zs_budgeting"));
    }

    @Test(groups = {"forms"})
    public void testZS_cashflow() {
        SignupPage page = new IndividualsPage(getDriver())
                .gotoURL(FORM_URL)
                .closeCookieBanner(SignupPage.class)
                .clickViewFormZS_cashflow();

        Assert.assertEquals(page.getMarketingParamAttribute("name"), "marketing_param");
        Assert.assertEquals(page.getMarketingParamAttribute("value"), "zs_cashflow");
        Assert.assertEquals(page.getSkipFirstUseAttribute("value"), "false");
        Assert.assertEquals(page.getHeadingText(), "Set up your Empower Personal Dashboard™");
        Assert.assertTrue(page.isUrlChangedOn("zs_cashflow"));
    }

    @Test(groups = {"forms"})
    public void testZS_savingsplanner() {
        SignupPage page = new IndividualsPage(getDriver())
                .gotoURL(FORM_URL)
                .closeCookieBanner(SignupPage.class)
                .clickViewFormZS_savingsplanner();

        Assert.assertEquals(page.getMarketingParamAttribute("name"), "marketing_param");
        Assert.assertEquals(page.getMarketingParamAttribute("value"), "zs_savingsplanner");
        Assert.assertEquals(page.getSkipFirstUseAttribute("value"), "false");
        Assert.assertEquals(page.getHeadingText(), "Set up your Empower Personal Dashboard™");
        Assert.assertTrue(page.isUrlChangedOn("zs_savingsplanner"));
    }

    @Test(groups = {"forms"})
    public void testZS_onboarding() {
        SignupPage page = new IndividualsPage(getDriver())
                .gotoURL(FORM_URL)
                .closeCookieBanner(SignupPage.class)
                .clickViewFormZS_onboarding();

        Assert.assertEquals(page.getMarketingParamAttribute("name"), "marketing_param");
        Assert.assertEquals(page.getMarketingParamAttribute("value"), "zs_onboarding");
        Assert.assertEquals(page.getSkipFirstUseAttribute("value"), "false");
        Assert.assertEquals(page.getHeadingText(), "Set up your Empower Personal Dashboard™");
        Assert.assertTrue(page.isUrlChangedOn("zs_onboarding"));
    }

    @Test(groups = {"forms"})
    public void testZS_customretirement() {
        SignupPage page = new IndividualsPage(getDriver())
                .gotoURL(FORM_URL)
                .closeCookieBanner(SignupPage.class)
                .clickViewFormZS_customretirement();

        Assert.assertEquals(page.getMarketingParamAttribute("name"), "marketing_param");
        Assert.assertEquals(page.getMarketingParamAttribute("value"), "utmcct=customretirement|zs_retirement");
        Assert.assertEquals(page.getSkipFirstUseAttribute("value"), "false");
        Assert.assertEquals(page.getHeadingText(), "Set up your Empower Personal Dashboard™");
        Assert.assertTrue(page.isUrlChangedOn("zs_customretirement"));
    }

    @Test(groups = {"forms"})
    public void testAO_premierira() {
        SignupPage page = new IndividualsPage(getDriver())
                .gotoURL(FORM_URL)
                .closeCookieBanner(SignupPage.class)
                .clickViewFormAO_premierira();

        Assert.assertEquals(page.getMarketingParamAttribute("name"), "marketing_param");
        Assert.assertEquals(page.getMarketingParamAttribute("value"), "ao_premierira");
        Assert.assertEquals(page.getSkipFirstUseAttribute("value"), "true");
        Assert.assertEquals(page.getHeadingText(), "Open an Empower Premier IRA");
        Assert.assertTrue(page.isUrlChangedOn("ao_premierira"));
    }

    @Test(groups = {"forms"})
    public void testAO_premierinvestmentaccount() {
        SignupPage page = new IndividualsPage(getDriver())
                .gotoURL(FORM_URL)
                .closeCookieBanner(SignupPage.class)
                .clickViewFormAO_premieririnvestmentaccount();

        Assert.assertEquals(page.getMarketingParamAttribute("name"), "marketing_param");
        Assert.assertEquals(page.getMarketingParamAttribute("value"), "ao_premierinvestmentaccount");
        Assert.assertEquals(page.getSkipFirstUseAttribute("value"), "true");
        Assert.assertEquals(page.getHeadingText(), "Open an Empower Premier Investment account");
        Assert.assertTrue(page.isUrlChangedOn("ao_premierinvestmentaccount"));
    }

    @Test(groups = {"forms"})
    public void testAO_personalstrategy() {
        SignupPage page = new IndividualsPage(getDriver())
                .gotoURL(FORM_URL)
                .closeCookieBanner(SignupPage.class)
                .clickViewFormAO_personalstrategy();

        Assert.assertEquals(page.getMarketingParamAttribute("name"), "marketing_param");
        Assert.assertEquals(page.getMarketingParamAttribute("value"), "ao_personalstrategy");
        Assert.assertEquals(page.getSkipFirstUseAttribute("value"), "true");
        Assert.assertEquals(page.getHeadingText(), "Open an Empower Personal Strategy account");
        Assert.assertTrue(page.isUrlChangedOn("ao_personalstrategy"));
    }

    @Test(groups = {"forms"})
    public void testAO_personalcash() {
        SignupPage page = new IndividualsPage(getDriver())
                .gotoURL(FORM_URL)
                .closeCookieBanner(SignupPage.class)
                .clickViewFormAO_personalcash();

        Assert.assertEquals(page.getMarketingParamAttribute("name"), "marketing_param");
        Assert.assertEquals(page.getMarketingParamAttribute("value"), "utmcct=empowercash");
        Assert.assertEquals(page.getSkipFirstUseAttribute("value"), "true");
        Assert.assertEquals(page.getHeadingText(), "Open an Empower Personal Cash™ account");
        Assert.assertTrue(page.isUrlChangedOn("ao_personalcash"));
    }

    @Test(groups = {"forms"})
    public void testSetImpactCookie() {
        SignupPage page = new IndividualsPage(getDriver())
                .gotoURL(FORM_URL)
                .closeCookieBanner(SignupPage.class)
                .clickSetImpactCookie();

        Assert.assertEquals(page.getMarketingParamAttribute("name"), "marketing_param");
        Assert.assertEquals(page.getMarketingParamAttribute("value"), "impact=true|irclickid=V3V1DCTovxyNTwlXiiSRbSvTUkARvmx4fRFc1k0|impact_partner=Nick Test|impact_partnerID=2836790|utmcsr=Nick Test|utmcmd=affiliate|irgwc=1|");
        Assert.assertEquals(page.getSkipFirstUseAttribute("value"), "false");
        Assert.assertEquals(page.getHeadingText(), "Sign up to start using your free Retirement Planner.");
        Assert.assertTrue(page.isUrlChangedOn("impact_partner"));
    }

    @Test(groups = {"forms"})
    public void testSetReferralCookie() {
        SignupPage page = new IndividualsPage(getDriver())
                .gotoURL(FORM_URL)
                .closeCookieBanner(SignupPage.class)
                .clickSetReferralCookie();

        Assert.assertEquals(page.getMarketingParamAttribute("name"), "marketing_param");
        Assert.assertEquals(page.getMarketingParamAttributeReferralCookie("value"), "talkableVisitorUUID=eaff9a04-aaf7-420f-97ef-6a6ae581b60d|talkableEventCategory=link_investment_account|transactionID=687312d0d01c4e578b6b9bd9c53de421");
        Assert.assertEquals(page.getSkipFirstUseAttribute("value"), "");
//        Assert.assertEquals(page.getHeadingText(), "Get started with our FREE dashboard");
        Assert.assertTrue(page.isUrlChangedOn("Referral"));
    }

    @Test(groups = {"forms"})
    public void testSetZeroStateCookie() {
        SignupPage page = new IndividualsPage(getDriver())
                .gotoURL(FORM_URL)
                .closeCookieBanner(SignupPage.class)
                .clickSetZeroStateCookie();

        Assert.assertEquals(page.getMarketingParamAttribute("name"), "marketing_param");
        Assert.assertEquals(page.getMarketingParamAttribute("value"), "zs_investment");
        Assert.assertEquals(page.getSkipFirstUseAttribute("value"), "");
        Assert.assertEquals(page.getHeadingText(), "Sign up now for free.");
        Assert.assertTrue(page.isUrlChangedOn("investment-checkup"));
    }

//    @Test(groups = {"forms"})
//    public void testDefaultFormSubmit() {
//        SignupPage page = new IndividualsPage(getDriver())
//                .gotoURL(FORM_URL)
//                .closeCookieBanner(SignupPage.class)
//                .clickViewDefaultForm()
//                .fillForm()
//                .clickToVerifyFields()
//                .clickSubmitButton();
//
//        Assert.assertEquals(page.getMarketingParamAttribute("name"), "marketing_param");
//        Assert.assertEquals(page.getMarketingParamAttribute("value"), "");
//        Assert.assertEquals(page.getSkipFirstUseAttribute("value"), "");
//        Assert.assertEquals(page.getHeadingText(), "Set up your Empower Personal Dashboard™");
//        Assert.assertTrue(page.isUrlChangedOn("/participant/#/redwoodMfa"));
//    }

}
