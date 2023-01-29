package com.epsile.selenium_automation;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class YouTubeTest {
    private WebDriver driver;

    @BeforeAll
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "//usr//bin//chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    @Test
    public void testOpenRickRollVideo() {
        driver.get("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        Assertions.assertEquals("Rick Astley - Never Gonna Give You Up (Official Music Video) - YouTube", driver.getTitle());
    }

    @AfterAll
    public void tearDown() {
        driver.quit();
    }
}
