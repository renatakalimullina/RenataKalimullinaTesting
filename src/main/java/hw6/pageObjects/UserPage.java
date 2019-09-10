package hw6.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends BasePage {

    private static UserPage instance;

    private UserPage(WebDriver driver) {
        super(driver);
    }


    public static UserPage getInstance(WebDriver driver) {
        if (instance == null) {
            instance = new UserPage(driver);
        }
        return instance;
    }




    @FindBy(css = "#user-name")
    private WebElement logginedUser;



    @FindBy(css = ".dropdown-toggle")
    private WebElement dropdownButtonServiceHeader;

    @FindBy(css = "a[href^='support.html']")
    private WebElement supportOption;

    @FindBy(css = "a[href^='dates.html']")
    private WebElement datesOption;

    @FindBy(css = "a[href^='search.html']")
    private WebElement searchOption;

    @FindBy(css = "a[href^='complex-table.html']")
    private WebElement complexTableOption;

    @FindBy(css = "a[href^='simple-table.html']")
    private WebElement simpleTableOption;

    @FindBy(css = "a[href^='user-table.html']")
    private WebElement userTableOption;

    @FindBy(css = "a[href^='table-pages.html']")
    private WebElement tablePagesOption;

    @FindBy(css = "a[href^='different-elements.html']")
    private WebElement differentElementsOption;

    @FindBy(css = "a[href^='performance.html']")
    private WebElement performanceOption;

    @FindBy(css = ".menu-title")
    private WebElement dropdownButtonServiceLeft;



    public String getLoggedUser() {
        return logginedUser.getText();
    }

    public void clickOnServiceHeader(){
        dropdownButtonServiceHeader.click();
    }

    public void containsOptions(){
        supportOption.isDisplayed();
        datesOption.isDisplayed();
        searchOption.isDisplayed();
        complexTableOption.isDisplayed();
        simpleTableOption.isDisplayed();
        userTableOption.isDisplayed();
        tablePagesOption.isDisplayed();
        differentElementsOption.isDisplayed();
        performanceOption.isDisplayed();
    }

    public void clickOnServiceLeft(){
        dropdownButtonServiceLeft.click();
    }

    public void clickDifferentElementsHeader(){
        differentElementsOption.click();
    }

    public void clickUserTable(){
        userTableOption.click();
    }

}

