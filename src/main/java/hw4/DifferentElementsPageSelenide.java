package hw4;

import com.codeborne.selenide.SelenideElement;
import hw4.enums.LogRow;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.text;

public class DifferentElementsPageSelenide {

    @FindBy(css = "input[type=checkbox]")
    private List<SelenideElement> checkboxesOnDifferentElementsPage;

    @FindBy(css = "input[type=radio]")
    private List<SelenideElement> radiosOnDifferentElementsPage;

    @FindBy(css = ".uui-form-element")
    private SelenideElement dropdownOnDifferentElementsPage;

    @FindBy(css = "[attribute = 'Default Button']")
    private SelenideElement defaultButtonOnDifferentElementsPage;



    @FindBy(css = "[name='log-sidebar']")
    private SelenideElement rightSection;

    @FindBy(css = "#mCSB_1")
    private SelenideElement leftSection;



    @FindBy(css = ".info-panel-section")
    private SelenideElement  log;



    @FindBy(css = "select[class='uui-form-element']")
    private SelenideElement dropdown;





    public void checkInterfaceOnDifferentElementsPage(){
        for(int i = 0; i < 4; i++)
            checkboxesOnDifferentElementsPage.get(i).exists();
        for(int i = 0; i < 4; i++)
            radiosOnDifferentElementsPage.get(i).exists();
        dropdownOnDifferentElementsPage.exists();
        defaultButtonOnDifferentElementsPage.exists();
    }

    public void rightSection(){
        rightSection.exists();
    }

    public void leftSection(){
        leftSection.exists();
    }


    public void selectCheckboxes(ArrayList<String> timeArrayForLogRow) {
        checkboxesOnDifferentElementsPage.get(0).setSelected(true);
        timeArrayForLogRow.add(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
        checkboxesOnDifferentElementsPage.get(0).shouldBe(checked);

        checkboxesOnDifferentElementsPage.get(2).setSelected(true);
        timeArrayForLogRow.add(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
        checkboxesOnDifferentElementsPage.get(2).shouldBe(checked);
    }

    public void selectRadio(ArrayList<String> timeArrayForLogRow) {
        radiosOnDifferentElementsPage.get(3).setSelected(true);
        timeArrayForLogRow.add(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
        radiosOnDifferentElementsPage.get(3).shouldBe(checked);
    }

    public void selectInDropdown(ArrayList<String> timeArrayForLogRow) {
        dropdown.selectOptionContainingText("Yellow");
        timeArrayForLogRow.add(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
    }


    public void unselectCheckboxes(ArrayList<String> timeArrayForLogRow){
        checkboxesOnDifferentElementsPage.get(0).setSelected(false);
        timeArrayForLogRow.add(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));

        checkboxesOnDifferentElementsPage.get(2).setSelected(false);
        timeArrayForLogRow.add(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
    }





    public void checkIndividualLog(ArrayList<String> timeArrayForLogRow, LogRow firstCheckbox, LogRow secondCheckbox){
        log.shouldBe(text(
                        timeArrayForLogRow.get(1) +
                        secondCheckbox.getStatusOfButton() + "\n" +
                        timeArrayForLogRow.get(0) +
                        firstCheckbox.getStatusOfButton() ));
    }

    public void checkIndividualLog(ArrayList<String> timeArrayForLogRow, LogRow firstCheckbox, LogRow secondCheckbox, LogRow radioName){
        log.shouldBe(text(
                        timeArrayForLogRow.get(2) +
                        radioName.getStatusOfButton() + "\n" +
                        timeArrayForLogRow.get(1) +
                        secondCheckbox.getStatusOfButton() + "\n" +
                        timeArrayForLogRow.get(0) +
                        firstCheckbox.getStatusOfButton() ));
    }

    public void checkIndividualLog(ArrayList<String> timeArrayForLogRow, LogRow firstCheckbox, LogRow secondCheckbox, LogRow radioName, LogRow dropdownName){
        log.shouldBe(text(
                        timeArrayForLogRow.get(3) +
                        dropdownName.getStatusOfButton() + "\n" +
                        timeArrayForLogRow.get(2) +
                        radioName.getStatusOfButton() + "\n" +
                        timeArrayForLogRow.get(1) +
                        secondCheckbox.getStatusOfButton() + "\n" +
                        timeArrayForLogRow.get(0) +
                        firstCheckbox.getStatusOfButton() ));
    }

    public void checkIndividualLogWithUnselect(ArrayList<String> timeArrayForLogRow, LogRow firstCheckbox, LogRow secondCheckbox, LogRow radioName, LogRow dropdownName, LogRow firstUnselectCheckbox, LogRow seconUnselectdCheckbox){
        log.shouldBe(text(
                        timeArrayForLogRow.get(5) +
                        seconUnselectdCheckbox.getStatusOfButton() + "\n" +
                        timeArrayForLogRow.get(4) +
                        firstUnselectCheckbox.getStatusOfButton() + "\n" +
                        timeArrayForLogRow.get(3) +
                        dropdownName.getStatusOfButton() + "\n" +
                        timeArrayForLogRow.get(2) +
                        radioName.getStatusOfButton() + "\n" +
                        timeArrayForLogRow.get(1) +
                        secondCheckbox.getStatusOfButton() + "\n" +
                        timeArrayForLogRow.get(0) +
                        firstCheckbox.getStatusOfButton() ));
    }
}
