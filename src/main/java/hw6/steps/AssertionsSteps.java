package hw6.steps;

import cucumber.api.java.en.Then;

public class AssertionsSteps extends BaseStep{

    @Then("The browser title is Home Page")
    public void userName(){
        homePage.checkTitle();
    }

//    @Then("The user name in the left-top side is '([^\\\"]*)'")
//    public void checkUsername(String username){
//        userPage.checkUsername(username);
//    }

//    @Then("Check that drop down contains options")
//    public void checkDropDownHeader(){
//        userPage.containsOptions();
//    }



}
