package com.empower.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndividualsLoginV1Page extends BasePage{

    public IndividualsLoginV1Page(WebDriver driver) {
        super(driver);
    }

    private final By headingText = By.cssSelector("h1");

    @FindBy(css = "[aria-label='Log in to retirement plan']")
    private WebElement participantButton;

    @FindBy(css = "[aria-label='Log in to dashboard']")
    private WebElement personalCapitalButton;

    @FindBy(css = "[aria-label='Log in to individual account']")
    private WebElement personalWealthButton;

    @FindBy(css = "[aria-label='Log in as a retirement plan sponsor']")
    private WebElement planServiceCenerButton;

    @FindBy(css = "[aria-label='Log in as a financial professional']")
    private WebElement partnerButton;

    public String getHeadingText() {
        return ByWait10UntilVisible(headingText).getText().trim();
    }

    public ParticipantPage clickParticipantLoginButton() {
        safeClick(participantButton);

        return new ParticipantPage(getDriver());
    }

    public PersonalCapitalPage clickPersonalCapitalLoginButton() {
        safeClick(personalCapitalButton);

        return new PersonalCapitalPage(getDriver());
    }

    public PersonalWealthPage clickPersonalWealthLoginButton() {
        safeClick(personalWealthButton);

        return new PersonalWealthPage(getDriver());
    }

    public PlanServiceCenterPage clickPlanServiceCenterLoginButton() {
        safeClick(planServiceCenerButton);

        return new PlanServiceCenterPage(getDriver());
    }


    public PartnerPage clickPartnerLoginButton() {
        safeClick(partnerButton);

        return new PartnerPage(getDriver());
    }
}
