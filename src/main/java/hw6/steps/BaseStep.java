package hw6.steps;

import hw6.hooks.TestDriver;
import hw6.pageObjects.HomePage;

public abstract class BaseStep {

    protected HomePage homePage;
//    protected UserPage userPage;
//    protected DifferentElementsPage differentElementsPage;

    public BaseStep() {

        homePage = HomePage.getInstance(TestDriver.getDriver());
//        userPage = UserPage.getInstance(TestDriver.getDriver());


//        differentElementsPage = DifferentElementsPage.getInstance(TestDriver.getDriver());

    }

}
