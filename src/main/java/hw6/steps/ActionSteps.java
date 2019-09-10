package hw6.steps;

import cucumber.api.java.en.When;

public class ActionSteps extends BaseStep{

    @When("I login as '([^\\\"]*)'/'([^\\\"]*)'")
    public void login(String username, String password) {
        homePage.login(username, password);
    }

    @When("I click on \"Service\" button in Header")
    public void clickOnServiceHeader(){
        userPage.clickOnServiceHeader();
    }

    @When("Click on \"Service\" subcategory in the left section")
    public void clickOnServiceLeftSection(){
        userPage.clickOnServiceLeft();
    }

    @When("Open through the header menu Service -> Different Elements Page")
    public void openThroughTheHeaderMenu(){
        userPage.clickOnServiceHeader();
        userPage.clickDifferentElementsHeader();
    }

    @When("Check interface on Different elements page")
    public void checkInterface(){
        differentElementsPage.checkInterfaceOnDifferentElementsPage();
    }

    @When("Select checkboxes: Water, Wind")
    public void selectCheckboxes(){
        differentElementsPage.selectCheckboxes(timeListForLogRowDifferentElements);
    }

    @When("Select radio: Selen")
    public void selectRadio(){
        differentElementsPage.selectRadio(timeListForLogRowDifferentElements);
    }

    @When("Select in dropdown: Yellow")
    public void selectDropdown(){
        differentElementsPage.selectInDropdown(timeListForLogRowDifferentElements);
    }

    @When("Unselect checkboxes: Water, Wind")
    public void unselectCheckboxes(){
        differentElementsPage.unselectCheckboxes(timeListForLogRowDifferentElements);
    }








    @When("I click on \"User Table\" button in Service dropdown")
    public void clickOnUserTableButton(){
        userPage.clickUserTable();
    }

    @When("I select 'vip' checkbox for \"Sergey Ivan\"")
    public void selectCheckboxSergeyIvan(){
        userTablePage.selectSergeyIvan(timeArrayForLogRowUserTable);
    }

    @When("I click on dropdown in column Type for user Roman")
    public void clickOnDropdownForRoman(){
        userTablePage.clickOnDropdownForRoman();
    }

}
