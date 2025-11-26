package com.empower.components;

import com.empower.pages.FinancialProfessionalsPage;
import com.empower.pages.IndividualsPage;
import com.empower.pages.PlanSponsorsPage;
import com.empower.pages.SignupPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobileHeaderComponent extends BaseHeaderComponent {

    public MobileHeaderComponent(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "hamburger-menu")
    private WebElement hamburgerMenu;

    @FindBy(css = "[data-once='nav-main-login-register-link click-primary-button empulsify-button-ripple']")
    private WebElement openAccountHeaderButton;

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

//        public String getHamburgerHeadingText() {
//        return wait10UntilVisible(hamburgerHeadingText).getText().trim();
//    }

    public MobileHeaderComponent getMobileHeader() {
        return new MobileHeaderComponent(getDriver());
    }

    public SignupPage clickOpenAccountHeaderButton() {
        wait10UntilClickable(openAccountHeaderButton).click();
//        safeClick(openAccountHeaderButton);
        return new SignupPage(getDriver());
    }

}
