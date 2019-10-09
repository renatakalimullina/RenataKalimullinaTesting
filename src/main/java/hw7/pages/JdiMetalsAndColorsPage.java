package hw7.pages;


import com.epam.jdi.light.elements.complex.Droplist;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.objects.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.Css;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.complex.Checklist;
import com.epam.jdi.light.ui.html.complex.RadioButtons;
import hw7.entities.Colors;
import hw7.entities.Metals;
import hw7.entities.Vegetables;

//import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;

public class JdiMetalsAndColorsPage extends WebPage {

    @Css("#odds-selector")
    public RadioButtons summaryFirstLine;

    @Css("#even-selector")
    public RadioButtons summarySecondLine;










    @FindBy(id = "elements-checklist")
    //@FindBy(xpath = "//*[@id='elements-checklist']")
    public Checklist elementsSettings;






    @JDropdown(root = "div[ui=dropdown]",
                value = ".filter-option",
                list = "li",
                expand = ".caret")
    public Droplist colors;


    @JDropdown(root = "div[ui=combobox]",
            list = "li",
            value = ".filter-option",
            expand = ".caret")
    private Droplist metals;

    @JDropdown(root = "div[ui=droplist]",
            list = "li",
            value = ".filter-option",
            expand = ".caret")
    private Droplist vgetables;


    @Css("#submit-button")
    public Button submitButton;


    public void chooseSummaryFirstLine(String number){
        summaryFirstLine.select(number);
    }

    public void chooseSummarySecondLine(String number){
        summarySecondLine.select(number);
    }







//    public void chooseElements(){
//
//        elementsSettings.select("Water");
//        elementsSettings.select(2);
//        //elementsSettings.select(0);
//        //elementsSettings.select(2);
//        //elementsSettings.check(2);
//    }











    public void chooseColor(Colors colorsName){
        colors.select(colorsName.getName());
    }

    public void chooseMetal(Metals metalsName){
        metals.select(metalsName.getName());
    }

    public void chooseVegetables(Vegetables vegetablesName){
        vgetables.select(vegetablesName.getName());
    }

    public void submitFormMetalsColors(){
        submitButton.click();
    }

}
