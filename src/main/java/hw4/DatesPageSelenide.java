package hw4;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class DatesPageSelenide {
    @FindBy(css = "div[class='uui-slider blue range ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all']")
    private SelenideElement sliderTrack;

    @FindBy(css = "a[class='ui-slider-handle ui-state-default ui-corner-all']")
    private List<SelenideElement> sliders;

    private SelenideElement leftSlider;
    private SelenideElement rightSlider;



    public double getStep() {
        return sliderTrack.getSize().width / 101.0;
    }

    public void initSliders()
    {
        leftSlider = sliders.get(0);
        rightSlider = sliders.get(1);
    }

    public void moveSliders(int leftPos, int rightPos) {
        System.out.print("left slider was on ");
        System.out.print(leftSlider.getText());
        System.out.print(" - right slider was on ");
        System.out.print(rightSlider.getText());
        System.out.println();
        System.out.print("left slider should be on ");
        System.out.print(leftPos);
        System.out.print(" - right slider should be on ");
        System.out.print(rightPos);
        Integer leftOffset = (int)((leftPos - Integer.parseInt(leftSlider.getText())) * getStep());
        Integer rightOffset = (int)((rightPos - Integer.parseInt(rightSlider.getText())) * getStep());
        Actions actions = new Actions(getWebDriver());
        actions.dragAndDropBy(leftSlider, leftOffset, 0).perform();
        actions.dragAndDropBy(rightSlider, rightOffset, 0).perform();
        System.out.println();
        System.out.print("left become on ");
        System.out.print(leftSlider.getText());
        System.out.print(" - right become on ");
        System.out.print(rightSlider.getText());
        System.out.println();
        System.out.println("----------");
    }
}
