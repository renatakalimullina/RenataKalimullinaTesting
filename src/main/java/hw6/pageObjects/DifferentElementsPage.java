package hw6.pageObjects;

import hw5.enums.LogRow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class DifferentElementsPage  extends BasePage {

    private static DifferentElementsPage instance;

    private DifferentElementsPage(WebDriver driver) {
        super(driver);
    }

    public static DifferentElementsPage getInstance(WebDriver driver) {
        if (instance == null) {
            instance = new DifferentElementsPage(driver);
        }
        return instance;
    }

    public static void closePage(){
        instance = null;
    }


    @FindBy(css = "input[type=checkbox]")
    private List<WebElement> checkboxesOnDifferentElementsPage;

    @FindBy(css = "input[type=radio]")
    private List<WebElement> radiosOnDifferentElementsPage;

    @FindBy(css = ".uui-form-element")
    private WebElement dropdownOnDifferentElementsPage;

    @FindBy(css = "[attribute = 'Default Button']")
    private WebElement defaultButtonOnDifferentElementsPage;



    @FindBy(css = "[name='log-sidebar']")
    private WebElement rightSection;

    @FindBy(css = "#mCSB_1")
    private WebElement leftSection;



    @FindBy(css = ".info-panel-section")
    private WebElement  log;



    @FindBy(css = "select[class='uui-form-element']")
    private WebElement dropdown;



    public void checkInterfaceOnDifferentElementsPage(){
        for(int i = 0; i < 4; i++)
            checkboxesOnDifferentElementsPage.get(i).isDisplayed();
        for(int i = 0; i < 4; i++)
            radiosOnDifferentElementsPage.get(i).isDisplayed();
        dropdownOnDifferentElementsPage.isDisplayed();

    }

    public boolean rightSection(){
        return rightSection.isDisplayed();
    }

    public boolean leftSection(){
        return leftSection.isDisplayed();
    }


    public void selectCheckboxes(ArrayList<String> timeListForLogRowDifferentElements) {
        checkboxesOnDifferentElementsPage.get(0).click();
        timeListForLogRowDifferentElements.add(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
        checkboxesOnDifferentElementsPage.get(0).isSelected();

        checkboxesOnDifferentElementsPage.get(2).click();
        timeListForLogRowDifferentElements.add(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
        checkboxesOnDifferentElementsPage.get(2).isSelected();
    }

    public void selectRadio(ArrayList<String> timeListForLogRowDifferentElements) {
        radiosOnDifferentElementsPage.get(3).click();
        timeListForLogRowDifferentElements.add(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
            radiosOnDifferentElementsPage.get(3).isSelected();
    }

    public void selectInDropdown(ArrayList<String> timeListForLogRowDifferentElements) {
        Select select = new Select(dropdown);
        select.selectByVisibleText("Yellow");
        timeListForLogRowDifferentElements.add(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
    }


    public void unselectCheckboxes(ArrayList<String> timeListForLogRowDifferentElements){
        checkboxesOnDifferentElementsPage.get(0).click();
        timeListForLogRowDifferentElements.add(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));

        checkboxesOnDifferentElementsPage.get(2).click();
        timeListForLogRowDifferentElements.add(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
    }



    public String getLogRowText(){
        return log.getText();
    }

    public String getIndividualLog(ArrayList<String> timeListForLogRowDifferentElements, LogRow firstCheckbox, LogRow secondCheckbox){
        return (timeListForLogRowDifferentElements.get(1) +
                secondCheckbox.getStatusOfButton() + "\n" +
                timeListForLogRowDifferentElements.get(0) +
                firstCheckbox.getStatusOfButton());
    }


    public String getIndividualLog(ArrayList<String> timeListForLogRowDifferentElements, LogRow firstCheckbox, LogRow secondCheckbox, LogRow radioName){
        return timeListForLogRowDifferentElements.get(2) +
                radioName.getStatusOfButton() + "\n" +
                timeListForLogRowDifferentElements.get(1) +
                secondCheckbox.getStatusOfButton() + "\n" +
                timeListForLogRowDifferentElements.get(0) +
                firstCheckbox.getStatusOfButton();
    }


    public String getIndividualLog(ArrayList<String> timeListForLogRowDifferentElements, LogRow firstCheckbox, LogRow secondCheckbox, LogRow radioName, LogRow dropdownName){
        return timeListForLogRowDifferentElements.get(3) +
                dropdownName.getStatusOfButton() + "\n" +
                timeListForLogRowDifferentElements.get(2) +
                radioName.getStatusOfButton() + "\n" +
                timeListForLogRowDifferentElements.get(1) +
                secondCheckbox.getStatusOfButton() + "\n" +
                timeListForLogRowDifferentElements.get(0) +
                firstCheckbox.getStatusOfButton();
    }


    public String getIndividualLogWithUnselect(ArrayList<String> timeListForLogRowDifferentElements, LogRow firstCheckbox, LogRow secondCheckbox, LogRow radioName, LogRow dropdownName, LogRow firstUnselectCheckbox, LogRow seconUnselectdCheckbox) {

        return timeListForLogRowDifferentElements.get(5) +
                seconUnselectdCheckbox.getStatusOfButton() + "\n" +
                timeListForLogRowDifferentElements.get(4) +
                firstUnselectCheckbox.getStatusOfButton() + "\n" +
                timeListForLogRowDifferentElements.get(3) +
                dropdownName.getStatusOfButton() + "\n" +
                timeListForLogRowDifferentElements.get(2) +
                radioName.getStatusOfButton() + "\n" +
                timeListForLogRowDifferentElements.get(1) +
                secondCheckbox.getStatusOfButton() + "\n" +
                timeListForLogRowDifferentElements.get(0) +
                firstCheckbox.getStatusOfButton();
    }


}
