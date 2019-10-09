package hw7;

import com.epam.jdi.light.driver.get.DriverData;
import hw7.entities.MenuOptions;
import hw7.entities.Users;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import static com.epam.jdi.light.ui.html.PageFactory.initElements;

public class JdiSiteTest {
    @BeforeClass
    public void beforeClass() {
        DriverData.CHROME_OPTIONS = () -> {
            ChromeOptions cap = new ChromeOptions();
            cap.addArguments("--start-maximized");
            return cap;
        };
        initElements(JdiSite.class);
    }

    @Test
    public void loginTest() {
        JdiSite.open();

        //Login on JDI site as User
        JdiSite.homePage.login(Users.PITER_CHAILOVSKII);
        JdiSite.homePage.checkLoggedin(Users.PITER_CHAILOVSKII);

        //Open Metals & Colors page by Header menu
        JdiSite.userPage.openMetalsAndColorsPage(MenuOptions.METALS_AND_COLORS);

        //Fill form Metals & Colors by data
        JdiSite.metalsAndColorsPage.chooseSummaryFirstLine("3");
        JdiSite.metalsAndColorsPage.chooseSummarySecondLine("8");
        //!!!!!


        JdiSite.metalsAndColorsPage.chooseMetal();

//        JdiSite.metalsAndColorsPage.chooseElements();
//
//
//
//        JdiSite.metalsAndColorsPage.chooseMetal();
//        JdiSite.metalsAndColorsPage.chooseColor();






        JdiSite.metalsAndColorsPage.submitFormMetalsColors();

    }

    @AfterClass
    public void afterClass() {
        killAllSeleniumDrivers();
    }
}

