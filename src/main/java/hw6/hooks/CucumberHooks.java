package hw6.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import hw6.pageObjects.DifferentElementsPage;
import hw6.pageObjects.HomePage;
import hw6.pageObjects.UserPage;
import hw6.pageObjects.UserTablePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.setProperty;

public class CucumberHooks {

    @Before
    public void setUp() {
        setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        TestDriver.setDriver(driver);
    }

    @After
    public void closeDriver() {
        HomePage.closePage();
        UserPage.closePage();
        DifferentElementsPage.closePage();
        UserTablePage.closePage();

        TestDriver.getDriver().close();
    }

}
