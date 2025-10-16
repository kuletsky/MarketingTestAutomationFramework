package com.empower.pages;

import com.empower.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinancialProfessionalsLoginPage extends BasePage {

    public FinancialProfessionalsLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".fp-ps-modal-content h4")
    private WebElement popupText;

    @FindBy(css = ".swal2-confirm")
    private WebElement IAgreeButton;

    @FindBy(css = ".card-1 [type='button-v2']")
    private WebElement loginButtonFP;

    @FindBy(css = ".card-2 [type='button-v2']")
    private WebElement registerNowButtonFP;

    @FindBy(css = ".card-3 [type='button-v2']")
    private WebElement registerRixtremaButton;

    @FindBy(xpath = "//*[text()='Continue']")
    private WebElement continueButton;


    //    @Step("Get heading of Financial Professionals login Page")
    public String getHeadingText() {
        return wait10UntilVisible(popupText).getText();
    }

    public FinancialProfessionalsLoginPage clickIAgreePopup() {
        safeClick(IAgreeButton);

        return new FinancialProfessionalsLoginPage(getDriver());
    }

    public FinancialProfessionalsLoginPage clickFinancialProfessionalsLoginButton() {
        safeClick(loginButtonFP);

        return new FinancialProfessionalsLoginPage(getDriver());
    }

    public FinancialProfessionalsLoginPage clickFinancialProfessionalsRegisterNowButton() {
        safeClick(registerNowButtonFP);

        return new FinancialProfessionalsLoginPage(getDriver());
    }

    public FinancialProfessionalsLoginPage clickContinuePopup() {
        safeClick(continueButton);

        return new FinancialProfessionalsLoginPage(getDriver());
    }

    public FinancialProfessionalsLoginPage clickFinancialProfessionalsRegisterRixtremaButton() {
        safeClick(registerRixtremaButton);

        return new FinancialProfessionalsLoginPage(getDriver());
    }
}

