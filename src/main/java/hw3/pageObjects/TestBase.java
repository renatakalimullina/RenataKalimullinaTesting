package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static java.lang.System.setProperty;

public abstract class TestBase {

    protected static WebDriver driver ;//= new ChromeDriver();
    protected HomePage homePage;
    protected UserPage userPage;

    @BeforeClass
    public void beforeClass(){
        setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = PageFactory.initElements(driver, HomePage.class);
        userPage = PageFactory.initElements(driver, UserPage.class);
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        driver.close();
    }
}
