package com.empower.components;

import com.empower.pages.OnBoardingPage;
import com.empower.pages.base.BasePage;
import com.empower.pages.FinancialProfessionalsPage;
import com.empower.pages.IndividualsPage;
import com.empower.pages.PlanSponsorsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesktopHeaderComponent extends BasePage {

    public DesktopHeaderComponent(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "[aria-label='Contextual Navigation'] [href='/financial-professionals']")
    private WebElement financialProfessionalsMenu;

    @FindBy(css = "[aria-label='Contextual Navigation'] [href='/plan-sponsors']")
    private WebElement planSponsorsMenu;

    @FindBy(css = "[aria-label='Contextual Navigation'] [href='/home']")
    private WebElement individualsMenu;

    @FindBy(css = "[data-once='nav-main-login-register-link click-primary-button empulsify-button-ripple']")
    private WebElement openAccountHeaderButton;

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

    //    @Step("Click Open account button on the header")
    public OnBoardingPage clickOpenAccountHeaderButton() {
        wait10UntilClickable(openAccountHeaderButton).click();
//        safeClick(openAccountHeaderButton);
        return new OnBoardingPage(getDriver());
    }
}
