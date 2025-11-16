package com.empower.utils;

import browserstack.shaded.org.json.JSONObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.List;

public class PerformanceHelper {

    // Use a record (JDK 16+). If on older Java, replace with a simple POJO.
    public record LhMetrics(
            String url,
            double fcpSec,
            double speedIndexSec,
            double lcpSec,
            double tbtMs,
            double cls,
            int performanceScore
    ) {}

    @SuppressWarnings("unchecked")
    private static JSONObject toJson(Object raw) {
        if (raw == null) throw new IllegalStateException("Executor returned null");
        if (raw instanceof String s) return new JSONObject(s);
        if (raw instanceof java.util.Map<?, ?> m) {
            return new JSONObject((java.util.Map<String, Object>) m);
        }
        String s = raw.toString().trim();
        if (s.startsWith("{") && s.endsWith("}")) return new JSONObject(s);
        throw new IllegalStateException("Unexpected executor return type: " + raw.getClass() + " -> " + raw);
    }

    private static double auditMs(JSONObject audits, String key) {
        return audits.getJSONObject(key).getDouble("numericValue");
    }

    /**
     * Runs Lighthouse via BrowserStack executor and returns parsed metrics.
     * FCP / Speed Index / LCP are returned in seconds, TBT in ms, CLS unitless, score 0..100.
     */
    public static LhMetrics getLighthouseResult(
            WebDriver driver,
            String url,
            String formFactor,
            int width, int height, int dpr,
            int perfMinScore,
            int bestPracticeMinScore,
            int lcpMaxMs, int tbtMaxMs, int clsScoreMin, int fcpScoreMin,
            boolean failSessionOnAssert
    ) {

        // --- Build payload ---
        JSONObject screenEmu = new JSONObject()
                .put("mobile", "mobile".equalsIgnoreCase(formFactor))
                .put("width", width)
                .put("height", height)
                .put("deviceScaleFactor", dpr)
                .put("disabled", false);

        JSONObject lhConfig = new JSONObject()
                .put("extends", "lighthouse:default")
                .put("settings", new JSONObject()
                        .put("formFactor", formFactor)
                        .put("screenEmulation", screenEmu));

        JSONObject metrics = new JSONObject()
                .put("largest-contentful-paint", new JSONObject()
                        .put("lessThan", lcpMaxMs).put("metricUnit", "numeric"))
                .put("total-blocking-time", new JSONObject()
                        .put("lessThan", tbtMaxMs).put("metricUnit", "numeric"))
                .put("cumulative-layout-shift", new JSONObject()
                        .put("moreThan", clsScoreMin).put("metricUnit", "score"))
                .put("first-contentful-paint", new JSONObject()
                        .put("moreThan", fcpScoreMin).put("metricUnit", "score"));

        JSONObject categories = new JSONObject()
                .put("performance", perfMinScore)
                .put("best-practices", bestPracticeMinScore);

        JSONObject assertResult = new JSONObject()
                .put("categories", categories)
                .put("metrics", metrics)
                .put("sessionFail", failSessionOnAssert);

        JSONObject arguments = new JSONObject()
                .put("url", url)
                .put("lhConfig", lhConfig)
                .put("assertResult", assertResult)
                .put("executorOutput", "json"); // request JSON back

        JSONObject payload = new JSONObject()
                .put("action", "lighthouseAudit")
                .put("arguments", arguments);

        String script = "browserstack_executor: " + payload.toString();

        // --- Execute ---
        Object raw = ((JavascriptExecutor) driver).executeScript(script);
        JSONObject root = toJson(raw);

        // --- Find Lighthouse Result (LHR) ---
        // Your response example: { "report": "<LHR JSON STRING>", "value": {...}, "status": "failed" }
        JSONObject lhr;
        if (root.has("report")) {
            String reportJsonString = root.getString("report"); // Big JSON string
            lhr = new JSONObject(reportJsonString);
        } else if (root.has("lighthouseResult")) {
            lhr = root.getJSONObject("lighthouseResult");
        } else if (root.has("result") && root.getJSONObject("result").has("lighthouseResult")) {
            lhr = root.getJSONObject("result").getJSONObject("lighthouseResult");
        } else if (root.has("result") && root.getJSONObject("result").has("audits")) {
            lhr = root.getJSONObject("result");
        } else {
            throw new IllegalStateException("Could not locate Lighthouse result in executor response: " + root);
        }

        // --- Extract
        String finalUrl = lhr.optString("finalDisplayedUrl",
                lhr.optString("finalUrl",
                        lhr.optString("requestedUrl", url)));

        JSONObject audits = lhr.getJSONObject("audits");
        double fcpMs        = auditMs(audits, "first-contentful-paint");
        double lcpMs        = auditMs(audits, "largest-contentful-paint");
        double tbtMs        = auditMs(audits, "total-blocking-time");
        double speedIndexMs = auditMs(audits, "speed-index");
        double cls          = audits.getJSONObject("cumulative-layout-shift").getDouble("numericValue");

        int perfScore = (int)Math.round(
                lhr.getJSONObject("categories")
                        .getJSONObject("performance")
                        .getDouble("score") * 100.0);

        // Convert the three to seconds for your requested output
        return new LhMetrics(
                finalUrl,
                fcpMs / 1000.0,
                speedIndexMs / 1000.0,
                lcpMs / 1000.0,
                tbtMs,
                cls,
                perfScore
        );
    }

    /** Utility to print metrics in your exact order/format. */
    public static void printMetricsInRaw(String header, LhMetrics m) {
        if (header != null && !header.isEmpty()) {
            System.out.print(header + " ");
        }
        System.out.printf(
                ": FCP=%.2fs | Speed Index=%.2fs | LCP=%.2fs | TBT=%.0fms | CLS=%.3f | Perf=%d%n",
                m.fcpSec(), m.speedIndexSec(), m.lcpSec(),
                m.tbtMs(), m.cls(), m.performanceScore()
        );
    }

    /** Averages over a list of runs and prints in the same order/format. */
    public static void printAverages(List<LhMetrics> list) {
        int n = list.size();
        String url = list.get(0).url();

        double avgFcp = list.stream().mapToDouble(LhMetrics::fcpSec).average().orElse(0);
        double avgSi  = list.stream().mapToDouble(LhMetrics::speedIndexSec).average().orElse(0);
        double avgLcp = list.stream().mapToDouble(LhMetrics::lcpSec).average().orElse(0);
        double avgTbt = list.stream().mapToDouble(LhMetrics::tbtMs).average().orElse(0);
        double avgCls = list.stream().mapToDouble(LhMetrics::cls).average().orElse(0);
        double avgPerf = list.stream().mapToInt(LhMetrics::performanceScore).average().orElse(0);


        // Line 1: headline
        System.out.println();
        System.out.printf("AVERAGE over %d runs of %s%n", n, url);

        // Line 2: metrics
        System.out.printf(
                "Average: FCP=%.2fs | Speed Index=%.2fs | LCP=%.2fs | TBT=%.0fms | CLS=%.3f | Perf=%.0f%n",
                avgFcp, avgSi, avgLcp, avgTbt, avgCls, avgPerf
        );
    }
}


