package com.empower;

import com.empower.utils.Utils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    @SuppressWarnings("unchecked")
    public void setUp() throws Exception {
        driver = new ChromeDriver();

        if ("desktop".equalsIgnoreCase(System.getProperty("resolution"))) {
            driver.manage().window().maximize();
        }

        driver.get("https://empwrretiremtstg.prod.acquia-sites.com");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult testResult) throws Exception {
        if (!testResult.isSuccess() && driver != null) {
            Utils.takeScreenshot(
                    driver,
                    testResult.getTestClass().getRealClass().getSimpleName(),
                    testResult.getName()
            );
        }

        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver () {
        return driver;
    }
}