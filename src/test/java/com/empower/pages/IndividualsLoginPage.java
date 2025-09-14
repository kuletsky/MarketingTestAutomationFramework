package com.empower.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndividualsLoginPage extends BasePage{

    public IndividualsLoginPage(WebDriver driver) {
        super(driver);
    }


//    @FindBy(css = "h1")
//    private WebElement headingText;
    private final By headingText = By.cssSelector("h1");


    public String getHeadingText() {
        return ByWait10UntilVisible(headingText).getText().trim();
    }

}
