package hw6.hooks;

import org.openqa.selenium.WebDriver;

public class TestDriver {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    static void setDriver(WebDriver driver) {
        TestDriver.driver = driver;
    }
}
