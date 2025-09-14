package com.empower.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HamburgerComponent extends BasePage{

    public HamburgerComponent(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "hamburger-menu")
    private WebElement hamburgerMenu;

//    @Step("Click hamburger Individuals menu")
    public IndividualsPage clickHamburgerMenuIndividuals() {
        safeClick(hamburgerMenu);
        return new IndividualsPage(getDriver());
    }

//    @Step("Click hamburger Plan Sponsors menu")
    public PlanSponsorsPage clickHamburgerMenuPlanSponsors() {
        safeClick(hamburgerMenu);
        return new PlanSponsorsPage(getDriver());
    }

//    @Step("Click hamburger Financial Professionals menu")
    public FinancialProfessionalsPage clickHamburgerMenuFinancialProfessionals() {
        safeClick(hamburgerMenu);
        return new FinancialProfessionalsPage(getDriver());
    }

}
