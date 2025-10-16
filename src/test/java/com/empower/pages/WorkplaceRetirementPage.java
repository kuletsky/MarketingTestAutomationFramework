package com.empower.pages;

import com.empower.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkplaceRetirementPage extends BasePage {

    public WorkplaceRetirementPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h1")
    private WebElement headingPage;

//    @Step("Get text of Heading")
    public String getHeadingText() {
        return wait10UntilVisible(headingPage).getText().trim();
    }

}
