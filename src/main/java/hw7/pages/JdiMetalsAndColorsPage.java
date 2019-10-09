package hw7.pages;


import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.Css;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.complex.Checklist;
import com.epam.jdi.light.ui.html.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.complex.ComboBox;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JComboBox;

//import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;

public class JdiMetalsAndColorsPage extends WebPage {

    @Css("#odds-selector")
    public RadioButtons summaryFirstLine;

    @Css("#even-selector")
    public RadioButtons summarySecondLine;










    @FindBy(id = "elements-checklist")
    //@FindBy(xpath = "//*[@id='elements-checklist']")
    public Checklist elementsSettings;



//    @FindBy(css = "className = 'btn dropdown-toggle selectpicker btn-default'")
//    @UI("#colors")
//    public Dropdown colors;
//        @JDropdown(root = @FindBy(css = "div[ui=dropdown]"),
//                    value = @FindBy(css = ".filter-option"),
//                    list = @FindBy(css = "li"),
//                    expand = @FindBy(css = ".caret")
//        )
//        public Dropdown colors;



//    @FindBy(xpath = "//*[@id='metals']/div")
//    public Combobox metals;
    @JComboBox(root = @FindBy(css = "div[ui=combobox]"),
            value = @FindBy(css = "input"),
            list = @FindBy(css = "li"),
            expand = @FindBy(css = ".caret")
    )
    public ComboBox metals;








    @Css("#submit-button")
    public Button submitButton;


    public void chooseSummaryFirstLine(String number){
        summaryFirstLine.select(number);
    }

    public void chooseSummarySecondLine(String number){
        summarySecondLine.select(number);
    }







    public void chooseElements(){

        elementsSettings.select("Water");
        elementsSettings.select(2);
        //elementsSettings.select(0);
        //elementsSettings.select(2);
        //elementsSettings.check(2);
    }

    public void chooseColor(){
        //colors.select("Red");

        //.colors.select(4);

    }


    public void chooseMetal(){

        metals.select(2);

        metals.select(1);
        metals.select(3);
    }










    public void submitFormMetalsColors(){
        submitButton.click();
    }

}
