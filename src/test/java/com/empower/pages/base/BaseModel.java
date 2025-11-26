package com.empower.pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BaseModel {

    private final WebDriver driver;
    private WebDriverWait wait10;
    private WebDriverWait wait3;

    public BaseModel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    protected WebDriverWait getWait10() {
        if (wait10 == null) {
            wait10 = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        return wait10;
    }

    protected WebDriverWait getWait20() {
        if (wait3 == null) {
            wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
        }

        return wait3;
    }

    protected WebElement wait10UntilVisible(WebElement element) {
        return getWait10().until(ExpectedConditions.visibilityOf(element));
    }

    protected WebElement ByWait10UntilClickable(By element) {
        return getWait10().until(ExpectedConditions.elementToBeClickable(element));
    }

    protected WebElement wait10UntilClickable(WebElement element) {
        return getWait10().until(ExpectedConditions.elementToBeClickable(element));
    }

    protected List<WebElement> wait10UntilVisibleAll(List<WebElement> elements) {
        return getWait10().until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    protected WebElement ByWait10UntilVisible(By element) {
        return getWait10().until(ExpectedConditions.visibilityOfElementLocated(element));
    }

//    protected WebElement wait10UntilPresent(By locator) {
//        return getWait10().until(ExpectedConditions.presenceOfElementLocated(locator));
//    }

    protected WebElement wait20UntilPresent(By locator) {
        WebElement el = getWait20().until(ExpectedConditions.presenceOfElementLocated(locator));
        getWait10().until(ExpectedConditions.attributeToBeNotEmpty(el, "value"));

        return el;
    }

    protected WebElement wait10UntilPresent(By locator) {
        return getWait10().until(ExpectedConditions.presenceOfElementLocated(locator));
    }

}
