package com.empower.components;

import com.empower.pages.base.BasePage;
import com.empower.pages.FinancialProfessionalsPage;
import com.empower.pages.IndividualsPage;
import com.empower.pages.PlanSponsorsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderComponent extends BasePage {

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "[aria-label='Contextual Navigation'] [href='/financial-professionals']")
    private WebElement financialProfessionalsMenu;

    @FindBy(css = "[aria-label='Contextual Navigation'] [href='/plan-sponsors']")
    private WebElement planSponsorsMenu;

    @FindBy(css = "[aria-label='Contextual Navigation'] [href='/home']")
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
