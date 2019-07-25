package hw2.ex3;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static java.lang.System.setProperty;

public abstract class TestBase {

    @BeforeSuite(alwaysRun = true)
    public static void beforeSuite(){
        setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
    }

    @AfterSuite(alwaysRun = true)
    public static void afterSuite() {
        System.out.println(System.currentTimeMillis());
    }
}
