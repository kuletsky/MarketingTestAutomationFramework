package com.empower;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    @SuppressWarnings("unchecked")
    public void setUp() throws Exception {
        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().window().setSize(new org.openqa.selenium.Dimension(1920, 1080));
        driver.get("https://empwrretiremtstg.prod.acquia-sites.com");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
    }

    WebDriver getDriver() {
        return driver;
    }
}
