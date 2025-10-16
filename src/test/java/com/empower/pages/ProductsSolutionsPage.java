package com.empower.pages;

import com.empower.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsSolutionsPage extends BasePage {

    public ProductsSolutionsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h1 p")
    private WebElement headingPage;

    public String getHeadingText() {
        return wait10UntilVisible(headingPage)
                .getText()
                .trim();
    }
}
