package com.empower.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public final class Utils {
    public static void takeScreenshot(WebDriver driver, String className, String methodName) {
        File screenshotDir = new File("screenshots");
        if (!screenshotDir.exists() && !screenshotDir.mkdirs()) {
            throw new RuntimeException("Failed to create a folder for screenshots");
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream(new File(screenshotDir, "%s.%s.png".formatted(className, methodName)))) {
            fileOutputStream.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
