package hw4;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static hw4.enums.HomePage.HOME_PAGE;
import static hw4.enums.Users.PITER_CHAILOVSKII;
import static org.testng.Assert.assertEquals;

public class DatesPageSlidersCheckTest extends SelenideTestBase{

    HomePageSelenide homePageSelenide;
    UserPageSelenide userPageSelenide;
    DatesPageSelenide datesPageSelenide;

    ArrayList<String> timeListForLogRow = new ArrayList<>();

    @BeforeClass
    public void beforeClass() {
        homePageSelenide = Selenide.page(HomePageSelenide.class);
        userPageSelenide = Selenide.page(UserPageSelenide.class);
        datesPageSelenide = Selenide.page(DatesPageSelenide.class);
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        getWebDriver().close();
    }


    @Test
    public void openTestSiteSelenide() {
        //1 Open test site by URL
        homePageSelenide.openPage();

        //2 Assert Browser title
        assertEquals(getWebDriver().getTitle(), HOME_PAGE.getTitleName());

        //3 Perform login
        homePageSelenide.login(PITER_CHAILOVSKII);

        //4 Assert User name in the left-top side of screen that user is loggined
        assertEquals(userPageSelenide.getLoggedUser(), PITER_CHAILOVSKII.getUserName());

        //5 Open through the header menu Service -> Dates Page
        userPageSelenide.clickDatesPage();

        //6 Using drag-and-drop set Range sliders. left sliders - the most left position, right slider - the most rigth position
        datesPageSelenide.initSliders();
        datesPageSelenide.moveSliders(timeListForLogRow,0, 100);

        //7 Assert that for "From" and "To" sliders there are logs rows with corresponding values
        datesPageSelenide.checkIndividualLog(timeListForLogRow, 1, 100); //with an error  will be 1 and 100

        //8 Using drag-and-drop set Range sliders. left sliders - the most left position, right slider - the most left position.
        datesPageSelenide.moveSliders(timeListForLogRow,0, 0);

        //9 Assert that for "From" and "To" sliders there are logs rows with corresponding values
        datesPageSelenide.checkIndividualLog(timeListForLogRow, 1,100,1,3);
    }
}
