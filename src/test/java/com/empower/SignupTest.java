package com.empower;

import com.empower.pages.IndividualsPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupTest extends BaseTest {

    @Test(groups = {"critical"})
    public void testCreatePersonalDashboard() {
        new IndividualsPage(getDriver())
                .getDesktopHeader()
                .clickOpenAccountHeaderButton()
                .clickPersonalCashOpenAccountButton();

        String text = getDriver().findElement(By.cssSelector("h2 p strong")).getText().trim();
        Assert.assertEquals(text, "How do you want to get started?");


    }
}
