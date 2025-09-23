package com.empower.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ParticipantPage extends BasePage {

    public ParticipantPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".site-tagline")
    private WebElement headingText;

    public String getHeadingText() {
        return wait10UntilVisible(headingText).getText().trim();
    }
}
