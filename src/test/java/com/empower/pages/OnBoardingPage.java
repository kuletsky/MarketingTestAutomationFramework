package com.empower.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnBoardingPage extends BasePage{

    public OnBoardingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".h3-alt")
    private WebElement headingOfPopUp;


    public String getHeadingOfPopup() {
        return wait10UntilVisible(headingOfPopUp).getText().trim();
    }

}
