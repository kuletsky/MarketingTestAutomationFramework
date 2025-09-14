package com.empower.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderComponent extends BasePage{

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//a[text()='Financial Professionals']")
    private WebElement financialProfessionalsMenu;

    @FindBy(xpath = "//a[text()='Plan Sponsors']")
    private WebElement planSponsorsMenu;

    @FindBy(xpath = "//a[text()='Individuals']")
    private WebElement individualsMenu;


//    @Step("Click Financial Professionals menu")
    public FinancialProfessionalsPage clickFinancialProfessionalsMenu() {
        safeClick(financialProfessionalsMenu);

        return new FinancialProfessionalsPage(getDriver());
    }

//    @Step("Click Plan Sponsors menu")
    public PlanSponsorsPage clickPlanSponsorsMenu() {
        safeClick(planSponsorsMenu);

        return new PlanSponsorsPage(getDriver());
    }

//    @Step("Click Individuals menu")
    public IndividualsPage clickIndividualsMenu() {
//        wait10UntilClickable(individualsMenu).click();
        safeClick(individualsMenu);
        return new IndividualsPage(getDriver());
    }

}
