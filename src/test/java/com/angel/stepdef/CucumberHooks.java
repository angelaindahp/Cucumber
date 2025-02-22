package com.angel.stepdef;

import com.angel.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CucumberHooks extends BaseTest {

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Menjalankan tanpa GUI (dibutuhkan untuk GitHub Actions)
        options.addArguments("--no-sandbox"); // Mencegah sandbox error
        options.addArguments("--disable-dev-shm-usage"); // Menghindari error resource di GitHub Actions
        options.addArguments("--user-data-dir=/tmp/chrome-user-data"); // Mengatasi error session di beberapa environment

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


