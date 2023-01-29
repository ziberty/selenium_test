package com.epsile.selenium_automation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YouTubeTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "//usr//bin//chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    @Test
    public void testOpenRickRollVideo() {
        driver.get("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
