package com.empower;

import com.empower.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StageIndividualsLoginV1Test extends BaseTest {

    @Test(groups = {"desktop"})
    public void testParticipantLoginButton() {
        ParticipantPage page = new IndividualsPage(getDriver())
                .clickLoginButton()
                .clickParticipantLoginButton();

//        Assert.assertEquals(page.getHeadingText(), "Your Retirement Plan");
        Assert.assertTrue(page.isNewUrl("participant.empower-retirement.com"));
    }

    @Test(groups = {"desktop"})
    public void testPersonalCapitalLoginButton() {
        PersonalCapitalPage page = new IndividualsPage(getDriver())
                .clickLoginButton()
                .clickPersonalCapitalLoginButton();

//        Assert.assertEquals(page.getHeadingText(), "Sign in to Empower Personal Dashboard™");
        Assert.assertTrue(page.isNewUrl("home.personalcapital.com"));
    }

    @Test(groups = {"desktop", "tablet", "mobile"})
    public void testPersonalWealthLoginButton() {
        PersonalWealthPage page = new IndividualsPage(getDriver())
                .clickLoginButton()
                .closeCookieBanner(IndividualsLoginV1Page.class)
                .clickPersonalWealthLoginButton();

        Assert.assertTrue(page.isNewUrl("ira.empower-retirement.com"));
    }

    @Test(groups = {"desktop", "tablet", "mobile"})
    public void testPlanServiceCenterLoginButton() {
        PlanServiceCenterPage page = new IndividualsPage(getDriver())
                .clickLoginButton()
                .closeCookieBanner(IndividualsLoginV1Page.class)
                .clickPlanServiceCenterLoginButton();

        Assert.assertTrue(page.isNewUrl("plan.empower-retirement.com"));
//        Assert.assertEquals(page.getHeadingText(), "plan service center");
    }

    @Test(groups = {"desktop", "tablet", "mobile"})
    public void testPartnerLoginButton() {
        PartnerPage page = new IndividualsPage(getDriver())
                .clickLoginButton()
                .closeCookieBanner(IndividualsLoginV1Page.class)
                .clickPartnerLoginButton();

        Assert.assertTrue(page.isNewUrl("retirementpartner.com"));
//        Assert.assertEquals(page.getHeadingText(),"Partner");
    }
}
