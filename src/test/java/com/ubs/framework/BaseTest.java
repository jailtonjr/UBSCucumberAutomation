package com.ubs.framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Project: SimpleTestFramework
 * Created by: Jailton Louzada
 * WebSite: https://jailtonjr.dev
 * Description: BaseTest
 */
public class BaseTest {

    public static WebDriver driver;

    @BeforeSuite
    public static void startServer() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterSuite
    public static void stopServer() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
