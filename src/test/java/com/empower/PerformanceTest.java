package com.empower;

import com.empower.utils.PerformanceHelper;
import com.empower.utils.PerformanceHelper.LhMetrics;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class PerformanceTest extends BaseTest {
//    private static final String URL = "https://www.empower.com";

    @Test
    public void testDesktopPerformanceHomePage() {
        WebDriver performanceDriver = getDriver();

        try {
            int runs = 6;
            List<LhMetrics> results = new ArrayList<>();

            for (int i = 0; i < runs; i++) {
                LhMetrics m = PerformanceHelper.getLighthouseResult(
                        performanceDriver,
                        "https://www.empower.com",
                        "desktop",
                        1920, 1080, 1,
                        40, 50,     // perf, best-practices thresholds
                        4000, 600, 50, 50, // lcp(ms), tbt(ms), cls(score), fcp(score)
                        true
                );

                PerformanceHelper.printMetricsInRaw("Run #" + (i + 1), m);
                results.add(m);
            }

            PerformanceHelper.printAverages(results);

        } finally {
            if (performanceDriver != null) performanceDriver.quit();
        }
    }

    @Test
    public void testDesktopPerformanceLoginV1() {
        WebDriver performanceDriver = getDriver();

        try {
            int runs = 6;
            List<LhMetrics> results = new ArrayList<>();

            for (int i = 0; i < runs; i++) {
                LhMetrics m = PerformanceHelper.getLighthouseResult(
                        performanceDriver,
                        "https://www.empower.com/login-v1",
                        "desktop",
                        1920, 1080, 1,
                        40, 50,     // perf, best-practices thresholds
                        4000, 600, 50, 50, // lcp(ms), tbt(ms), cls(score), fcp(score)
                        true
                );

                PerformanceHelper.printMetricsInRaw("Run #" + (i + 1), m);
                results.add(m);
            }

            PerformanceHelper.printAverages(results);

        } finally {
            if (performanceDriver != null) performanceDriver.quit();
        }
    }

    @Test
    public void testDesktopPerformanceTheCurrency() {
        WebDriver performanceDriver = getDriver();

        try {
            int runs = 6;
            List<LhMetrics> results = new ArrayList<>();

            for (int i = 0; i < runs; i++) {
                LhMetrics m = PerformanceHelper.getLighthouseResult(
                        performanceDriver,
                        "https://www.empower.com/the-currency",
                        "desktop",
                        1920, 1080, 1,
                        40, 50,     // perf, best-practices thresholds
                        4000, 600, 50, 50, // lcp(ms), tbt(ms), cls(score), fcp(score)
                        true
                );

                PerformanceHelper.printMetricsInRaw("Run #" + (i + 1), m);
                results.add(m);
            }

            PerformanceHelper.printAverages(results);

        } finally {
            if (performanceDriver != null) performanceDriver.quit();
        }
    }

    @Test
    public void testMobilePerformanceHomePage() {
        WebDriver performanceDriver = getDriver();

        try {
            int runs = 6;
            List<LhMetrics> results = new ArrayList<>();

            for (int i = 0; i < runs; i++) {
                LhMetrics m = PerformanceHelper.getLighthouseResult(
                        performanceDriver,
                        "https://www.empower.com",
                        "mobile",
                        375, 812, 1,
                        40, 50,     // perf, best-practices thresholds
                        4000, 600, 50, 50, // lcp(ms), tbt(ms), cls(score), fcp(score)
                        true
                );

                PerformanceHelper.printMetricsInRaw("Run #" + (i + 1), m);
                results.add(m);
            }

            PerformanceHelper.printAverages(results);

        } finally {
            if (performanceDriver != null) performanceDriver.quit();
        }
    }

    @Test
    public void testMobilePerformanceLoginV1() {
        WebDriver performanceDriver = getDriver();

        try {
            int runs = 6;
            List<LhMetrics> results = new ArrayList<>();

            for (int i = 0; i < runs; i++) {
                LhMetrics m = PerformanceHelper.getLighthouseResult(
                        performanceDriver,
                        "https://www.empower.com/login-v1",
                        "mobile",
                        372, 812, 1,
                        40, 50,     // perf, best-practices thresholds
                        4000, 600, 50, 50, // lcp(ms), tbt(ms), cls(score), fcp(score)
                        true
                );

                PerformanceHelper.printMetricsInRaw("Run #" + (i + 1), m);
                results.add(m);
            }

            PerformanceHelper.printAverages(results);

        } finally {
            if (performanceDriver != null) performanceDriver.quit();
        }
    }

    @Test
    public void testMobilePerformanceTheCurrency() {
        WebDriver performanceDriver = getDriver();

        try {
            int runs = 6;
            List<LhMetrics> results = new ArrayList<>();

            for (int i = 0; i < runs; i++) {
                LhMetrics m = PerformanceHelper.getLighthouseResult(
                        performanceDriver,
                        "https://www.empower.com/the-currency",
                        "mobile",
                        372, 812, 1,
                        40, 50,     // perf, best-practices thresholds
                        4000, 600, 50, 50, // lcp(ms), tbt(ms), cls(score), fcp(score)
                        true
                );

                PerformanceHelper.printMetricsInRaw("Run #" + (i + 1), m);
                results.add(m);
            }

            PerformanceHelper.printAverages(results);

        } finally {
            if (performanceDriver != null) performanceDriver.quit();
        }
    }
}


