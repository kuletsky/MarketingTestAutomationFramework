package com.empower.pages;

import com.empower.pages.base.BasePage;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Locale;

public class SignupPage extends BasePage {
    Faker faker = new Faker();

    public SignupPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".h3-alt")
    private WebElement headingOfPopUp;

    @FindBy(css = "[href*='signup/cash']")
    private WebElement personalCashButton;

    @FindBy(css = "[href*='signup/premier-ira']")
    private WebElement premierIRAButton;

    @FindBy(css = "[href*='signup/premier-investment']")
    private WebElement premierInvestmentButton;

    @FindBy(css = "[href*='signup/tools']")
    private WebElement personalDashboardButton;

    @FindBy(css = "[aria-label='First name']")
    private WebElement fname;

    @FindBy(css = "[aria-label='Last name']")
    private WebElement lname;

    @FindBy(css = "[aria-label='Mobile number']")
    private WebElement phone;

    @FindBy(css = "[title='Email']")
    private WebElement eMail;

    @FindBy(css = "#userName")
    private WebElement username;

    @FindBy(css = "#password-field")
    private WebElement psw;

    @FindBy(css = ".c-form__disclosure p")
    private WebElement emptyArea;

    @FindBy(css = "[type='submit']")
    private WebElement submitButton;

    @FindBy(css = ".js-form__marketing-param")
    private WebElement fieldsetLocator;

    @FindBy(css = "h4 p span")
    private WebElement headingText;

    @FindBy(css = "[aria-label='View form in default state']")
    private WebElement defaultButton;

    @FindBy(css = "[aria-label='View form with RetirementIntentAffiliate param']")
    private WebElement retirementIntentAffiliateButton;

    @FindBy(css = "[aria-label='View form with zs_tools param']")
    private WebElement zs_toolsButton;

    @FindBy(css = "[aria-label='View form with zs_investment param']")
    private WebElement zs_investmentButton;

    @FindBy(css = "[aria-label='View form with zs_retirement param']")
    private WebElement zs_retirementButton;

    @FindBy(css = "[aria-label='View form with zs_networth param']")
    private WebElement zs_networthButton;

    @FindBy(css = "[aria-label='View form with zs_budgeting param']")
    private WebElement zs_budgetingButton;

    @FindBy(css = "[aria-label='View form with zs_cashflow param']")
    private WebElement zs_cashflowButton;

    @FindBy(css = "[aria-label='View form with zs_savingsplanner param']")
    private WebElement zs_savingsplannerButton;

    @FindBy(css = "[aria-label='View form with zs_onboarding param']")
    private WebElement zs_onboardingButton;

    @FindBy(css = "[aria-label='View form with zs_customretirement param']")
    private WebElement zs_customretirementButton;

    @FindBy(css = "[aria-label='View form with ao_premierira param']")
    private WebElement ao_premieriraButton;

    @FindBy(css = "[aria-label='View form with ao_premierinvestmentaccount param']")
    private WebElement ao_premieririnvestmentaccountButton;

    @FindBy(css = "[aria-label='View form with ao_personalstrategy param']")
    private WebElement ao_personalstrategyButton;

    @FindBy(css = "[aria-label='View form with ao_personalcash param']")
    private WebElement ao_personalcashButton;

    @FindBy(css = "[aria-label='View form with impact cookie set']")
    private WebElement setImpactCookieButton;

    @FindBy(css = "[aria-label='View form with referral cookie set']")
    private WebElement setReferralCookieButton;

    @FindBy(css = "[aria-label='View zero state form without marketing_param custom URL query']")
    private WebElement setZeroStateCookieButton;

    private final By marketingParamLocator = By.cssSelector(".js-form__marketing-param");
    private final By skipFirstUseLocator = By.cssSelector(".js-form__skip-first-use");


    public String getHeadingText() {
        return wait20UntilVisible(headingText).getText().trim();
    }

    public SignupPage clickPersonalCashOpenAccountButton() {
        safeClick(personalCashButton);

        return this;
    }

    public SignupPage clickPremierIRAOpenAccountButton() {
        safeClick(premierIRAButton);

        return this;
    }

    public SignupPage clickPremierInvestmentOpenAccountButton() {
        safeClick(premierInvestmentButton);

        return this;
    }

    public SignupPage clickPersonalDashboardOpenAccountButton() {
        safeClick(personalDashboardButton);

        return this;
    }

    public SignupPage fillForm() {
        wait10UntilVisible(fname).sendKeys("Bob");
        wait10UntilVisible(lname).sendKeys("Empower");
        wait10UntilVisible(phone).sendKeys(faker.phoneNumber().phoneNumber());
        wait10UntilVisible(eMail).sendKeys(faker.internet().emailAddress());
        wait10UntilVisible(username).sendKeys(faker.letterify("?????") + faker.number().digit());
        wait10UntilVisible(psw).sendKeys(faker.lorem().characters(5, true, true)
                + faker.regexify("[A-Z]")
                + faker.regexify("[0-9]")
                + faker.regexify("[@\\-_]"));

        return this;
    }

    public String getMarketingParamAttribute(String name) {
        return wait10UntilPresent(marketingParamLocator).getAttribute(name);
    }

    public String getMarketingParamAttributeReferralCookie(String name) {
        return wait20UntilPresent(marketingParamLocator).getAttribute(name);
    }

    public String getSkipFirstUseAttribute(String name) {
        return wait10UntilPresent(skipFirstUseLocator).getAttribute(name);
    }


    public SignupPage clickViewDefaultForm() {
        wait10UntilClickable(defaultButton).click();

        return this;
    }

    public SignupPage clickViewFormRetirementIntentAffiliate() {
        wait10UntilClickable(retirementIntentAffiliateButton).click();

        return this;
    }

    public SignupPage clickViewFormZS_tools() {
        wait10UntilClickable(zs_toolsButton).click();

        return this;
    }

    public SignupPage clickViewFormZS_investment() {
        wait10UntilClickable(zs_investmentButton).click();

        return this;
    }

    public SignupPage clickViewFormZS_retirement() {
        wait10UntilClickable(zs_retirementButton).click();

        return this;
    }

    public SignupPage clickViewFormZS_networth() {
        wait10UntilClickable(zs_networthButton).click();

        return this;
    }

    public SignupPage clickViewFormZS_budgeting() {
        wait10UntilClickable(zs_budgetingButton).click();

        return this;
    }

    public SignupPage clickViewFormZS_cashflow() {
        wait10UntilClickable(zs_cashflowButton).click();

        return this;
    }

    public SignupPage clickViewFormZS_savingsplanner() {
        wait10UntilClickable(zs_savingsplannerButton).click();

        return this;
    }

    public SignupPage clickViewFormZS_onboarding() {
        wait10UntilClickable(zs_onboardingButton).click();

        return this;
    }

    public SignupPage clickViewFormZS_customretirement() {
        wait10UntilClickable(zs_customretirementButton).click();

        return this;
    }

    public SignupPage clickViewFormAO_premierira() {
        wait10UntilClickable(ao_premieriraButton).click();

        return this;
    }

    public SignupPage clickViewFormAO_premieririnvestmentaccount() {
        wait10UntilClickable(ao_premieririnvestmentaccountButton).click();

        return this;
    }

    public SignupPage clickViewFormAO_personalstrategy() {
        wait10UntilClickable(ao_personalstrategyButton).click();

        return this;
    }

    public SignupPage clickViewFormAO_personalcash() {
        wait10UntilClickable(ao_personalcashButton).click();

        return this;
    }

    public SignupPage clickSetImpactCookie() {
        wait10UntilClickable(setImpactCookieButton).click();

        return this;
    }

    public SignupPage clickSetReferralCookie() {
        wait10UntilClickable(setReferralCookieButton).click();

        return this;
    }

    public SignupPage clickSetZeroStateCookie() {
        wait10UntilClickable(setZeroStateCookieButton).click();

        return this;
    }

    public SignupPage clickSubmitButton() {
        wait10UntilClickable(submitButton).click();

        return this;
    }

    public SignupPage clickToVerifyFields() {
        wait10UntilClickable(emptyArea).click();

        return this;
    }

}
