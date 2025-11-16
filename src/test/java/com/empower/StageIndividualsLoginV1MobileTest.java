package com.empower;

import com.empower.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StageIndividualsLoginV1MobileTest extends BaseTest {

    @Test(groups = {"tablet", "mobile"})
    public void testParticipantLoginButton() {
        ParticipantPage page = new IndividualsPage(getDriver())
                .clickLoginButton()
                .closeCookieBanner(IndividualsLoginV1Page.class)
                .clickParticipantLoginButton();

//        Assert.assertEquals(page.getHeadingText(), "Your Retirement Plan");
        Assert.assertTrue(page.isNewUrl("/participant"));
    }

    @Test(groups = {"tablet", "mobile"})
    public void testPersonalCapitalLoginButton() {
        PersonalCapitalPage page = new IndividualsPage(getDriver())
                .clickLoginButton()
                .closeCookieBanner(IndividualsLoginV1Page.class)
                .clickPersonalCapitalLoginButton();

//        Assert.assertEquals(page.getHeadingText(), "Sign in to Empower Personal Dashboard™");
        Assert.assertTrue(page.isNewUrl("personalcapital.com"));
    }

//    @Test(groups = {"desktop"})
//    public void testPersonalWealthLoginButton() {
//        PersonalWealthPage page = new IndividualsPage(getDriver())
//                .clickLoginButton()
//                .closeCookieBanner(IndividualsLoginV1Page.class)
//                .clickPersonalWealthLoginButton();
//
//        Assert.assertTrue(page.isNewUrl("ira.empower-retirement.com"));
//    }
}
