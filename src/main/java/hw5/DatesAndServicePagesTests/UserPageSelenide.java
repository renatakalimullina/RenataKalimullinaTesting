package hw5.DatesAndServicePagesTests;

import com.codeborne.selenide.SelenideElement;
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



    public String getLoggedUser() {
        return logginedUser.text();
    }

    public void clickOnServiceHeader(){
        dropdownButtonServiceHeader.click();
    }

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
}

