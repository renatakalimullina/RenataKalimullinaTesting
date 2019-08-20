package hw4;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static hw4.enums.HomePage.HOME_PAGE;
import static hw4.enums.Users.PITER_CHAILOVSKII;
import static org.testng.Assert.assertEquals;

public class DatesPageSlidersCheckTest extends SelenideTestBase{

    HomePageSelenide homePageSelenide;
    UserPageSelenide userPageSelenide;
    DatesPageSelenide datesPageSelenide;

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
        //datesPageSelenide.dragAndDrop();
        //datesPageSelenide.setSliderPosition(0, "right");
        datesPageSelenide.initSliders();
        datesPageSelenide.moveSliders(0, 100);
        datesPageSelenide.moveSliders(10, 80);
        datesPageSelenide.moveSliders(30, 50);

        //7 Assert that for "From" and "To" sliders there are logs rows with corresponding values


        //8 Using drag-and-drop set Range sliders. left sliders - the most left position, right slider - the most left position.


        //9 Assert that for "From" and "To" sliders there are logs rows with corresponding values

        //10 Using drag-and-drop set Range sliders. left sliders - the most rigth position, right slider - the most rigth position.

        //11 Assert that for "From" and "To" sliders there are logs rows with corresponding values

        //12 Using drag-and-drop set Range sliders.

        //13 Assert that for "From" and "To" sliders there are logs rows with corresponding values


    }
}
