package com.empower;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//import static com.empower.BaseTest.loadProps;
//import static java.lang.Thread.sleep;

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

//    protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();
////    protected WebDriver driver;
//
//    protected WebDriver getDriver() {
//        return driver.get();
//    }
//
//    @BeforeMethod(alwaysRun = true)
//    @SuppressWarnings("unchecked")
//    public void setUp() throws Exception {
//
//        String authPath = System.getProperty(
//                "auth.file",
//                java.nio.file.Paths.get(System.getProperty("user.dir"), ".properties").toString()
//        );
//        Properties p = loadProps(authPath);
//
//        String stageUrl = p.getProperty("STAGE_URL");
//        String user     = p.getProperty("STAGE_USER");
//        String pass     = p.getProperty("STAGE_PASS");
//
//        if (isBlank(stageUrl) || (isBlank(user) && isBlank(p.getProperty("BASIC_AUTH_B64")))) {
//            throw new IllegalStateException("Missing STAGE_URL and/or credentials in .properties");
//        }
//
//        // 2) Build Basic auth value (prefer precomputed if present)
//        String b64 = p.containsKey("BASIC_AUTH_B64")
//                ? p.getProperty("BASIC_AUTH_B64").trim()
//                : Base64.getEncoder().encodeToString((user + ":" + pass).getBytes(StandardCharsets.UTF_8));
//
//        // 3) Put Authorization header into bstack:options.headerParams (JSON string)
//        String headerJson = "{\"Authorization\":\"Basic " + b64 + "\"}";
//        Map<String, Object> bstackOptions = new HashMap<>();
//        bstackOptions.put("headerParams", headerJson);
//
//        MutableCapabilities caps = new MutableCapabilities();
//        caps.setCapability("bstack:options", bstackOptions);
//
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
//        WebDriver driverBS = new ChromeDriver(options);
//        driver.set(driverBS);
//
//        getDriver().get(stageUrl);
//    }
//
//    @AfterMethod(alwaysRun = true)
//    public void tearDown() throws Exception {
//        WebDriver driverBS = driver.get();
//        if (driverBS != null) {
//            try {
//                driverBS.quit();
//            } finally {
//                driver.remove(); // avoid leaks between threads
//            }
//        }
//    }
//
//    // -------- helpers --------
//    private static Properties loadProps(String path) throws IOException {
//        Properties props = new Properties();
//        try (var in = Files.newInputStream(Path.of(path))) { props.load(in); }
//        return props;
//    }
//
//    private static boolean isBlank(String s) {
//        return s == null || s.trim().isEmpty();
//    }
}
