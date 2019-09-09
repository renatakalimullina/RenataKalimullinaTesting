package hw6.steps;

import cucumber.api.java.en.Given;

public class GivenSteps extends BaseStep {

    @Given("I am on the JDI Index Page")
    public void openPage(){
        homePage.openPage();
    }
}
