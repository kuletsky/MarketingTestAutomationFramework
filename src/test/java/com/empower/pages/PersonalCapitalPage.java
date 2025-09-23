package com.empower.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalCapitalPage extends BasePage{

    public PersonalCapitalPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#form-email .legend")
    private WebElement headingText;

    public String getHeadingText() {
        return wait10UntilVisible(headingText).getText().trim();
    }
}
