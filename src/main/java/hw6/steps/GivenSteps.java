package hw6.steps;

import cucumber.api.java.en.Given;

import static hw5.enums.Users.PITER_CHAILOVSKII;

public class GivenSteps extends BaseStep {

    @Given("I am on \"Home Page\"")
    public void openPageForUserTableTest(){
        homePage.openPage();
    }


    @Given("I login as user \"Piter Chailovskii\"")
    public void loginAsUser(){
        homePage.login(PITER_CHAILOVSKII.getLogin(), PITER_CHAILOVSKII.getPassword());
    }
}
