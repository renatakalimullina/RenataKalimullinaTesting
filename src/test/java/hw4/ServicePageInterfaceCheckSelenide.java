package hw4;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static hw4.enums.HomePage.HOME_PAGE;
import static hw4.enums.LogRow.*;
import static hw4.enums.Users.PITER_CHAILOVSKII;
import static org.testng.Assert.assertEquals;

public class ServicePageInterfaceCheckSelenide extends SelenideTestBase{

    ArrayList<String> timeListForLogRow = new ArrayList<>();

    @Test
    public void openTestSiteSelenide(){
        //1 Open test site by URL
        homePageSelenide.openPage();

        //2 Assert Browser title
        assertEquals(getWebDriver().getTitle(), HOME_PAGE.getTitleName());

        //3 Perform login
        homePageSelenide.login(PITER_CHAILOVSKII);

        //4 Assert User name in the left-top side of screen that user is loggined
        assertEquals(userPageSelenide.getLoggedUser(), PITER_CHAILOVSKII.getUserName());

        //5 Click on "Service" subcategory in the Header and check that drop down contains options
        userPageSelenide.clickOnServiceHeader();
        userPageSelenide.containsOptions();

        //6 Click on Service subcategory in the left section and check that drop down contains options
        userPageSelenide.clickOnServiceLeft();
        userPageSelenide.containsOptions();

        //7 Open through the header menu Service -> Different Elements Page
        userPageSelenide.clickOnServiceHeader();
        userPageSelenide.clickDifferentElementsHeader();

        //8 Check interface on Different elements page, it contains all needed elements
        differentElementsPageSelenide.checkInterfaceOnDifferentElementsPage();

        //9 Assert that there is Right Section
        differentElementsPageSelenide.rightSection();

        //10 Assert that there is Left Section
        differentElementsPageSelenide.leftSection();



        //11 Select checkboxes
        differentElementsPageSelenide.selectCheckboxes(timeListForLogRow);


        //12 Assert that for each checkbox there is an individual log row and value is corresponded to the status of checkbox.
        differentElementsPageSelenide.checkIndividualLog(timeListForLogRow, WATERtrue, WINDtrue);


        //13 Select radio
        differentElementsPageSelenide.selectRadio(timeListForLogRow);

        //14 Assert that for radiobutton there is a log row and value is corresponded to the status of radiobutton.
        differentElementsPageSelenide.checkIndividualLog(timeListForLogRow, WATERtrue, WINDtrue, SELENtrue);


        //15 Select in dropdown
        differentElementsPageSelenide.selectInDropdown(timeListForLogRow);

        //16 Assert that for dropdown there is a log row and value is corresponded to the selected value.
        differentElementsPageSelenide.checkIndividualLog(timeListForLogRow, WATERtrue, WINDtrue, SELENtrue, DROPDOWNyellow);


        //17 Unselect and assert checkboxes
        differentElementsPageSelenide.unselectCheckboxes(timeListForLogRow);

        //18 Assert that for each checkbox there is an individual log row and value is corresponded to the status of checkbox.
        differentElementsPageSelenide.checkIndividualLogWithUnselect(timeListForLogRow, WATERtrue,  WINDtrue, SELENtrue,  DROPDOWNyellow,  WATERfalse,  WINDfalse);

    }
}