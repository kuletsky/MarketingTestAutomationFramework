package com.empower.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SchedulePage extends BasePage{

    public SchedulePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Continue']")
    private WebElement continueButton;

    @FindBy(css = "br.u-visible-from-tablet")
    private WebElement headingPage;



    public String getHeadingText() {
        return wait10UntilVisible(headingPage).getText().trim();
    }

//    @Step("Close Leaving Empower Popup")
    public SchedulePage clickContinueButton() {
//        wait10UntilClickable(continueButton).click();
        safeClick(continueButton);
        return this;
    }

}
