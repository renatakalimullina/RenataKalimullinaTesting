package hw7.pages;

import com.epam.jdi.light.elements.complex.Droplist;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.objects.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.Css;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.common.Text;
import com.epam.jdi.light.ui.html.complex.Checklist;
import com.epam.jdi.light.ui.html.complex.RadioButtons;
import hw7.entities.Colors;
import hw7.entities.Elements;
import hw7.entities.Metals;
import hw7.entities.Vegetables;

import static org.testng.Assert.assertEquals;

public class JdiMetalsAndColorsPage extends WebPage {

    @Css("#odds-selector")
    public RadioButtons summaryFirstLine;

    @Css("#even-selector")
    public RadioButtons summarySecondLine;

    @Css("p[class=checkbox]")
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

    @Css("li[class=summ-res]")
    public Text summaryResult;

    @Css("li[class=elem-res]")
    public Text elementsResult;

    @Css("li[class=col-res]")
    public Text colorResult;

    @Css("li[class=met-res]")
    public Text metalResult;

    @Css("li[class=sal-res]")
    public Text vegetablesResult;

    public void chooseSummaryFirstLine(String number){
        summaryFirstLine.select(number);
    }

    public void chooseSummarySecondLine(String number){
        summarySecondLine.select(number);
    }

    public void chooseElements(Elements elementsName){
        elementsSettings.select(elementsName.getNumber());
    }

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

    public void checkResultLog(){
        assertEquals(summaryResult.getText(), "Summary: 11");
        assertEquals(elementsResult.getText(), "Elements: Water, Fire");
        assertEquals(colorResult.getText(), "Color: Red");
        assertEquals(metalResult.getText(), "Metal: Selen");
        assertEquals(vegetablesResult.getText(), "Vegetables: Cucumber, Tomato");
    }
}
