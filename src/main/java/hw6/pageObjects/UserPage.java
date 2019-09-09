package hw6.pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.AssertJUnit.assertEquals;

public class UserPage extends BasePage {

    private static UserPage instance;

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
    private SelenideElement userTableOption;

    @FindBy(css = "a[href^='table-pages.html']")
    private WebElement tablePagesOption;

    @FindBy(css = "a[href^='different-elements.html']")
    private WebElement differentElementsOption;

    @FindBy(css = "a[href^='performance.html']")
    private WebElement performanceOption;

    @FindBy(css = ".menu-title")
    private WebElement dropdownButtonServiceLeft;



    private UserPage(WebDriver driver) {
        super(driver);
    }

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

    public void clickDatesPage(){
        dropdownButtonServiceHeader.click();
        datesOption.click();
    }

    public void checkUsername(String username){
        assertEquals(logginedUser.getText(), username);//PITER_CHAILOVSKII.getUserName());
    }

    public static UserPage getInstance(WebDriver driver) {
        if (instance == null) {
            instance = new UserPage(driver);
        }
        return instance;
    }

}

