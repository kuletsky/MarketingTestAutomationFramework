package com.empower;

import com.empower.pages.IndividualsPage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    @SuppressWarnings("unchecked")
    public void setUp() throws Exception {
        ChromeOptions options = new ChromeOptions();

//        String dimension = System.getProperty("set.dimension");
//        if ("desktop".equals(dimension)) {
//            options.addArguments("start-maximized");
//        }

//        driver = new ChromeDriver(options);

        driver = new ChromeDriver();

        if ("prod".equals(System.getProperty("env"))) {
            driver.get("https://empwrretiremt.prod.acquia-sites.com");
        } else {
            driver.get("https://empwrretiremtstg.prod.acquia-sites.com");
        }
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void takeScreenshot() {
        new IndividualsPage(getDriver()).takePercyFullPageScreenshot(getDriver(),"", "");
    }
}
