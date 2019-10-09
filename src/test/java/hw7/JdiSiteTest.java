package hw7;

import com.epam.jdi.light.driver.get.DriverData;
import hw7.entities.*;
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


        //JdiSite.metalsAndColorsPage.checkSelectedOne();









        JdiSite.metalsAndColorsPage.chooseColor(Colors.RED);
        JdiSite.metalsAndColorsPage.chooseMetal(Metals.SELEN);
        JdiSite.metalsAndColorsPage.chooseVegetables(Vegetables.CUCUMBER);
        JdiSite.metalsAndColorsPage.chooseVegetables(Vegetables.TOMATO);
        JdiSite.metalsAndColorsPage.chooseVegetables(Vegetables.VEGETABLES);


        JdiSite.metalsAndColorsPage.submitFormMetalsColors();

    }

    @AfterClass
    public void afterClass() {
        killAllSeleniumDrivers();
    }
}

