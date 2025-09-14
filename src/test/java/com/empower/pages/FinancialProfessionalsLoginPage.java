package com.empower.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinancialProfessionalsLoginPage extends BasePage{

    public FinancialProfessionalsLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".fp-ps-modal-content h4")
    private WebElement popupText;

//    @Step("Get heading of Financial Professionals login Page")
    public String getHeadingText() {
        return wait10UntilVisible(popupText).getText();
    }

}
