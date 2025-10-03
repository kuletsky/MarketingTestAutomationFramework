package com.empower;

import com.empower.pages.IndividualsPage;
import org.testng.annotations.Test;

public class StageOnBoardingTest extends BaseTest {

    @Test(groups = {"desktop", "mobile", "tablet"})
    public void testCreatePersonalDashboard() {
        new IndividualsPage(getDriver())
                .clickOpenAccountHeaderButton()
                .clickCreatePersonalDashBoardButton()
                .fillForm(
                        "Arkadiy",
                        "Abramovich",
                        "arcadiyabramovich@lmail.com",
                        "ArcadiyAbramovich62!!!!")
                .clickNextButton();
    }
}
