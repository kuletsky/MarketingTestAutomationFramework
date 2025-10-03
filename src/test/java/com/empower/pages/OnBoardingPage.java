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

    @FindBy(css = ".paragraph-content.btn-v2 [data-dismiss='modal']")
    private WebElement personalDashboardButton;

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

    public OnBoardingPage clickCreatePersonalDashBoardButton() {
        safeClick(personalDashboardButton);

        return this;
    }

    public OnBoardingPage fillForm(String name, String lastname, String email, String password) {
        wait10UntilVisible(fname).sendKeys(name);
        wait10UntilVisible(lname).sendKeys(lastname);
        wait10UntilVisible(eMail).sendKeys(email);
        wait10UntilVisible(psw).sendKeys(password);

        return this;
    }

    public OnBoardingPage clickNextButton() {
        safeClick(nextButton);

        return this;
    }
}
