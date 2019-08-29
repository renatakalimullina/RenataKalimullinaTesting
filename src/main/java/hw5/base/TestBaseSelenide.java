package hw5.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import hw3.pageObjects.HomePage;
import hw3.pageObjects.UserPage;
import hw5.steps.ServicePagesTests.DifferentElementsPageSelenide;
import hw5.steps.ServicePagesTests.HomePageSelenide;
import hw5.steps.ServicePagesTests.UserPageSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static java.lang.System.setProperty;

public abstract class TestBaseSelenide {

    protected HomePageSelenide homePageSelenide;
    protected UserPageSelenide userPageSelenide;
    protected DifferentElementsPageSelenide differentElementsPageSelenide;

    protected HomePage homePage;
    protected UserPage userPage;


    @BeforeSuite(alwaysRun = true)
    public static void beforeSuite(){
        setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        Configuration.browser = "chrome";
    }


    @BeforeClass
    public void beforeClass() {
        homePageSelenide = Selenide.page(HomePageSelenide.class);
        userPageSelenide = Selenide.page(UserPageSelenide.class);
        differentElementsPageSelenide = Selenide.page(DifferentElementsPageSelenide.class);

        homePage = Selenide.page(HomePage.class);
        userPage = Selenide.page(UserPage.class);
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        getWebDriver().close();
    }

}
