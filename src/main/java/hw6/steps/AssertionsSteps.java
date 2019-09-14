package hw6.steps;

import cucumber.api.java.en.Then;
import hw6.entities.UserTableValue;
import hw6.hooks.TestDriver;

import java.util.List;

import static hw5.enums.HomePage.HOME_PAGE;
import static hw5.enums.LogRow.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AssertionsSteps extends BaseStep{

    private List<UserTableValue> Values;

    @Then("The browser title is Home Page")
    public void userName(){
        assertEquals(TestDriver.getDriver().getTitle(), HOME_PAGE.getTitleName());
    }

    @Then("The user name in the left-top side is '([^\\\"]*)'")
    public void checkUsername(String username){
        assertEquals(userPage.getLoggedUser(), username);
    }

    @Then("Check that drop down contains options")
    public void checkDropDownHeader(){
        userPage.containsOptions();
    }

    @Then("Assert that there is Right Section")
    public void checkRightSection(){
        assertTrue(differentElementsPage.rightSection());
    }

    @Then("Assert that there is Left Section")
    public void checkLeftSection(){
        assertTrue(differentElementsPage.leftSection());
    }

    @Then("Check for each checkbox individual log row")
    public void checkLogRowWithCheckboxes(){
        assertEquals(differentElementsPage.getLogRowText(),
                differentElementsPage.getIndividualLog(timeListForLogRowDifferentElements, WATERtrue, WINDtrue));
    }

    @Then("Check for radio button individual log row")
    public void checkLogRowWithRadiobutton(){
        assertEquals(differentElementsPage.getLogRowText(),
                differentElementsPage.getIndividualLog(timeListForLogRowDifferentElements, WATERtrue, WINDtrue, SELENtrue));
    }

    @Then("Check for dropdown individual log row")
    public void checkLogRowWithDropdown(){
        assertEquals(differentElementsPage.getLogRowText(),
                differentElementsPage.getIndividualLog(timeListForLogRowDifferentElements, WATERtrue, WINDtrue, SELENtrue, DROPDOWNyellow));
    }

    @Then("Check for each unselected checkbox individual log row")
    public void checkLogRowWithUnselectedCheckboxes(){
        assertEquals(differentElementsPage.getLogRowText(),
                differentElementsPage.getIndividualLogWithUnselect(timeListForLogRowDifferentElements, WATERtrue,  WINDtrue, SELENtrue,  DROPDOWNyellow,  WATERfalse,  WINDfalse));
    }



    @Then("\"User Table\" page is opened")
    public void checkPage(){
        assertEquals(TestDriver.getDriver().getCurrentUrl(), "https://epam.github.io/JDI/user-table.html");
    }

    @Then("6 NumberType Dropdowns are displayed on Users Table on User Table Page")
    public void checkNumberTypeDropdowns(){
        userTablePage.checkDropdownsAreDisplayed();
    }

    @Then("6 User names are displayed on Users Table on User Table Page")
    public void checkUserNames(){
        userTablePage.checkUserNamesAreDisplayed();
    }

    @Then("6 Description images are displayed on Users Table on User Table Page")
    public void checkDescriptionImages(){
        userTablePage.checkDescriptionImagesAreDisplayed();
    }

    @Then("6 Description texts under images are displayed on Users Table on User Table Page")
    public void checkTextsUnderImages(){
        userTablePage.checkTextsUnderImagesAreDisplayed();
    }

    @Then("6 checkboxes are displayed on Users Table on User Table Page")
    public void checkCheckboxes(){
        userTablePage.checkCheckboxesAreDisplayed();
    }

    @Then("User table contains following values")
    public void userTableContains(List<UserTableValue> values)
    {
        assertEquals(values.get(0).getUser(), userTablePage.getName(0));
        assertEquals(values.get(0).getDescription(), userTablePage.getDescription(0));

        for(int i = 1; i < 3; i++)
        {
            assertEquals(values.get(i).getUser(), userTablePage.getName(i));
            assertEquals(values.get(i).getDescription(), userTablePage.getDescription(i));
        }

        for(int i = 3; i < 6; i++)
        {
            assertEquals(values.get(i).getUser(), userTablePage.getName(i));
            assertEquals(values.get(i).getDescription(), userTablePage.stringWithoutLineBreak(userTablePage.getDescription(i)));
        }
    }

    @Then("1 log row has \"Vip: condition changed to true\" text in log section")
    public void checkLogRowWithVipCheckbox(){
        assertEquals(userTablePage.getLogRowText(), userTablePage.getIndividualLog(timeArrayForLogRowUserTable) );
    }

    @Then("droplist contains values")
    public void droplistContainsValues(List<String> DropdownValues){
        assertEquals(userTablePage.getDropdownValues(), DropdownValues.get(1) + "\n" +DropdownValues.get(2) + "\n" + DropdownValues.get(3));
    }
}
