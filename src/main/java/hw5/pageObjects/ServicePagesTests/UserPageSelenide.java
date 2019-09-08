package hw5.pageObjects.ServicePagesTests;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class UserPageSelenide {

    @FindBy(css = "#user-name")
    private SelenideElement logginedUser;



    @FindBy(css = ".dropdown-toggle")
    private SelenideElement dropdownButtonServiceHeader;

    @FindBy(css = "a[href^='support.html']")
    private SelenideElement supportOption;

    @FindBy(css = "a[href^='dates.html']")
    private SelenideElement datesOption;

    @FindBy(css = "a[href^='search.html']")
    private SelenideElement searchOption;

    @FindBy(css = "a[href^='complex-table.html']")
    private SelenideElement complexTableOption;

    @FindBy(css = "a[href^='simple-table.html']")
    private SelenideElement simpleTableOption;

    @FindBy(css = "a[href^='user-table.html']")
    private SelenideElement userTableOption;

    @FindBy(css = "a[href^='table-pages.html']")
    private SelenideElement tablePagesOption;

    @FindBy(css = "a[href^='different-elements.html']")
    private SelenideElement differentElementsOption;

    @FindBy(css = "a[href^='performance.html']")
    private SelenideElement performanceOption;

    @FindBy(css = ".menu-title")
    private SelenideElement dropdownButtonServiceLeft;


    @Step("Get logged user name")
    public String getLoggedUser() {
        return logginedUser.text();
    }

    @Step("Click on \"Service\" subcategory in the Header")//5 Click on "Service" subcategory in the Header and check that drop down contains options
    public void clickOnServiceHeader(){
        dropdownButtonServiceHeader.click();
    }

    @Step("Check that drop down contains options")
    public void containsOptions(){
        supportOption.exists();
        datesOption.exists();
        searchOption.exists();
        complexTableOption.exists();
        simpleTableOption.exists();
        tablePagesOption.exists();
        differentElementsOption.exists();
        performanceOption.exists();
    }

    @Step("Click on Service subcategory in the left section")
    public void clickOnServiceLeft(){
        dropdownButtonServiceLeft.click();
    }

    @Step("Open through the header menu Service -> Different Elements Page")
    public void clickDifferentElementsHeader(){
        differentElementsOption.click();
    }

    @Step("Open through the header menu Service -> Dates Page")
    public void clickDatesPage(){
        dropdownButtonServiceHeader.click();
        datesOption.click();
    }
}

