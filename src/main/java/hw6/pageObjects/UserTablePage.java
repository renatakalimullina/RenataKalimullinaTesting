package hw6.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class UserTablePage extends BasePage  {

    private static UserTablePage instance;

    private UserTablePage(WebDriver driver) {
        super(driver);
    }

    public static UserTablePage getInstance(WebDriver driver) {
        if (instance == null) {
            instance = new UserTablePage(driver);
        }
        return instance;
    }


    @FindBy(css = "tbody select")
    private List<WebElement> dropdowns;

    @FindBy(css = "tbody select option")
    private List<WebElement> dropdownValues;

    @FindBy(css = "tbody a")
    private List<WebElement> names;

    @FindBy(css = "tbody img")
    private List<WebElement> images;

    @FindBy(css = "div[class = 'user-descr'] span")
    private List<WebElement> texts;

    @FindBy(css = "div[class = 'user-descr'] input[type=checkbox]")
    private List<WebElement> checkbexes;

    @FindBy(css = ".info-panel-section")
    private WebElement  log;

    public void checkDropdownsAreDisplayed(){
        for(int i = 0; i < 6; i++)
            dropdowns.get(i).isDisplayed();
    }

    public void checkUserNamesAreDisplayed(){
        for(int i = 0; i < 6; i++)
            names.get(i).isDisplayed();
    }

    public void checkDescriptionImagesAreDisplayed(){
        for(int i = 0; i < 6; i++)
            images.get(i).isDisplayed();
    }

    public void checkTextsUnderImagesAreDisplayed(){
        for(int i = 0; i < 6; i++)
            texts.get(i).isDisplayed();
    }

    public void checkCheckboxesAreDisplayed(){
        for(int i = 0; i < 6; i++)
            checkbexes.get(i).isDisplayed();
    }

    public void selectSergeyIvan(ArrayList<String> timeArrayForLogRowUserTable){
        checkbexes.get(1).click();
        timeArrayForLogRowUserTable.add(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
    }

    public String getLogRowText(){
        return log.getText();
    }

    public String getIndividualLog(ArrayList<String> timeArrayForLogRowUserTable){
        return timeArrayForLogRowUserTable.get(0) +
                " Vip: condition changed to true";
    }

    public void clickOnDropdownForRoman(){
        dropdowns.get(0).click();
    }

    public String getDropdownValues(){
        return dropdownValues.get(0).getText() + "\n" + dropdownValues.get(1).getText() + "\n" + dropdownValues.get(2).getText();
    }

}
