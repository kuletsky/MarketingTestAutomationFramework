package com.empower.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IrasPage extends BasePage{

    public IrasPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h1")
    private WebElement headingPage;

//    @Step("Get text of Heading")
    public String getHeadingText() {
        return wait10UntilVisible(headingPage)
                .getText()
                .trim();
    }
}
