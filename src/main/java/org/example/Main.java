package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    // defining browser options
    private ChromeOptions getDriverOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1600,1024");
        chromeOptions.addArguments("--disable-extensions");

        return chromeOptions;
    }

    public Main() {
        WebDriver driver = new ChromeDriver(getDriverOptions());    // defining chrome browser

        String url = "https://demo.guru99.com/test/guru99home/";
        driver.get(url);                                            // navigating to url
        driver.close();                                             // closing browser when finished
    }

    public static void main(String[] args) {
        new Main();
    }
}

// Supports other browsers: https://www.selenium.dev/documentation/webdriver/browsers/
// More browser options: https://github.com/GoogleChrome/chrome-launcher/blob/main/docs/chrome-flags-for-tools.md
