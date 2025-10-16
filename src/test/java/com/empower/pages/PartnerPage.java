package com.empower.pages;

import com.empower.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PartnerPage extends BasePage {

    public PartnerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".site-tagline-Partner")
    private WebElement headingText;


    public String getHeadingText() {
        return wait10UntilVisible(headingText).getText().trim();
    }
}
