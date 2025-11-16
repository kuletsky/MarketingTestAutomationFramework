package com.empower.pages;

import com.empower.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {

    public SignupPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".h3-alt")
    private WebElement headingOfPopUp;

    @FindBy(css = "[href*='signup/cash']")
    private WebElement personalCashButton;

    @FindBy(css = "[aria-label='First name']")
    private WebElement fname;

    @FindBy(css = "[aria-label='Last name']")
    private WebElement lname;

    @FindBy(css = "[title='Email']")
    private WebElement eMail;

    @FindBy(css = "[name='passwd']")
    private WebElement psw;

    @FindBy(css = "[type='submit']")
    private WebElement nextButton;




    public String getHeadingOfPopup() {
        return wait10UntilVisible(headingOfPopUp).getText().trim();
    }

    public SignupPage clickPersonalCashOpenAccountButton() {
        safeClick(personalCashButton);

        return this;
    }

    public SignupPage fillForm(String name, String lastname, String email, String password) {
        wait10UntilVisible(fname).sendKeys(name);
        wait10UntilVisible(lname).sendKeys(lastname);
        wait10UntilVisible(eMail).sendKeys(email);
        wait10UntilVisible(psw).sendKeys(password);

        return this;
    }

    public SignupPage clickNextButton() {
        safeClick(nextButton);

        return this;
    }
}
