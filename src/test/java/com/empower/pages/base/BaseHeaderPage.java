package com.empower.pages.base;

import com.empower.components.BaseHeaderComponent;
import org.openqa.selenium.WebDriver;

public abstract class BaseHeaderPage<Header extends BaseHeaderComponent> extends BasePage{

    public BaseHeaderPage(WebDriver driver) {
        super(driver);
    }

    public abstract Header getHeader();
}
