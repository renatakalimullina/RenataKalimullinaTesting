package hw6.steps;

import hw6.hooks.TestDriver;
import hw6.pageObjects.DifferentElementsPage;
import hw6.pageObjects.HomePage;
import hw6.pageObjects.UserPage;
import hw6.pageObjects.UserTablePage;

import java.util.ArrayList;

public abstract class BaseStep {

    static public ArrayList<String> timeListForLogRowDifferentElements;
    static public ArrayList<String> timeArrayForLogRowUserTable;
    protected  HomePage homePage;
    protected  UserPage userPage;
    protected  DifferentElementsPage differentElementsPage;
    protected  UserTablePage userTablePage;

    public BaseStep() {
        timeListForLogRowDifferentElements = new ArrayList<>();
        timeArrayForLogRowUserTable = new ArrayList<>();

        homePage = HomePage.getInstance(TestDriver.getDriver());
        userPage = UserPage.getInstance(TestDriver.getDriver());
        differentElementsPage = DifferentElementsPage.getInstance(TestDriver.getDriver());
        userTablePage = UserTablePage.getInstance(TestDriver.getDriver());
    }
}
