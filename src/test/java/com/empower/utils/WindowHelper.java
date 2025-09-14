package com.empower.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Map;
import java.util.Set;

public final class WindowHelper {
    private WindowHelper() {}

    /** True if multi-tab/window automation is reliable (Chrome, desktop Safari). */
    public static boolean supportsMultiTab(WebDriver driver) {
        Capabilities caps = ((HasCapabilities) driver).getCapabilities();
        String browser = String.valueOf(caps.getBrowserName()).toLowerCase();
        String platformName = String.valueOf(caps.getCapability("platformName")).toLowerCase();

        // Detect real mobile device (BrowserStack sets deviceName or inside bstack:options)
        boolean hasDeviceName = caps.getCapability("deviceName") != null;
        Object bstack = caps.getCapability("bstack:options");
        if (!hasDeviceName && bstack instanceof Map) {
            hasDeviceName = ((Map<?, ?>) bstack).get("deviceName") != null;
        }

        boolean isSafari = browser.contains("safari");
        boolean isiOSFamily = platformName.contains("ios") || platformName.contains("ipad") || platformName.contains("iphone");

        // Safari on real iOS/iPadOS devices => no multi-tab
        return !(isSafari && (isiOSFamily || hasDeviceName));
    }

    /**
     * Clicks an element that may open a new tab. On Chrome/desktop Safari, switches to it.
     * On iOS/iPadOS Safari, forces same-tab and stays.
     */
    public static void clickOpenAndFocus(WebDriver driver, WebElement opener, Duration timeout) {
        if (!supportsMultiTab(driver)) {
            // Mobile Safari: force same-tab before click if it's an <a>
            forceSameTabIfAnchor(driver, opener);
            opener.click();
            return; // stay in same tab
        }

        // Desktop: click, wait for a new handle, then switch
        String original = driver.getWindowHandle();
        int before = driver.getWindowHandles().size();

        opener.click();

        try {
            new WebDriverWait(driver, timeout)
                    .until(ExpectedConditions.numberOfWindowsToBe(before + 1));
            switchToNewHandle(driver, original);
        } catch (TimeoutException e) {
            // No new window appeared—stay on current tab
        }
    }

    private static void forceSameTabIfAnchor(WebDriver driver, WebElement el) {
        try {
            if ("a".equalsIgnoreCase(el.getTagName())) {
                ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].setAttribute('target','_self');", el);
            }
        } catch (JavascriptException ignore) {}
    }

    private static void switchToNewHandle(WebDriver driver, String original) {
        Set<String> handles = driver.getWindowHandles();
        for (String h : handles) {
            if (!h.equals(original)) {
                driver.switchTo().window(h);
                return;
            }
        }
    }
}

