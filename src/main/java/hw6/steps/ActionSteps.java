package hw6.steps;

import cucumber.api.java.en.When;

public class ActionSteps extends BaseStep{

    @When("I login as '([^\\\"]*)'/'([^\\\"]*)'")
    public void login(String username, String password) {
        homePage.login(username, password);
    }

//    @When("Click on \"Service\" subcategory in the Header")
//    public void clickOnServiceHeader(){
//        userPage.clickOnServiceHeader();
//    }
//
//    @When("Click on \"Service\" subcategory in the left section")
//    public void clickOnServiceLeftSection(){
//        userPage.clickOnServiceLeft();
//    }
//
//    @When("Open through the header menu Service -> Different Elements Page")
//    public void openThroughTheHeaderMenu(){
//        userPage.clickOnServiceHeader();
//        userPage.clickDifferentElementsHeader();
//    }
//
//
//
//
//
//
//    @When("Check interface on Different elements page")
//    public void checkInterface(){
//
//    }


}
