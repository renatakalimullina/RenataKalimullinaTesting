package hw5.DatesAndServicePagesTests;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class DatesPageSelenide {
    @FindBy(css = "div[class='uui-slider blue range ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all']")
    private SelenideElement sliderTrack;

    @FindBy(css = "a[class='ui-slider-handle ui-state-default ui-corner-all']")
    private List<SelenideElement> sliders;

    @FindBy(css = ".info-panel-section")
    private SelenideElement  log;

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

    public void moveSliders(ArrayList<String> timeArrayForLogRow, int leftPos, int rightPos) {
        Integer leftOffset = (int)((leftPos - Integer.parseInt(leftSlider.getText())) * getStep());
        Integer rightOffset = (int)((rightPos - Integer.parseInt(rightSlider.getText())) * getStep());
        Actions actions = new Actions(getWebDriver());

        actions.dragAndDropBy(leftSlider, leftOffset, 0).perform();
        timeArrayForLogRow.add(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));

        actions.dragAndDropBy(rightSlider, rightOffset, 0).perform();
        timeArrayForLogRow.add(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
    }



    public void checkIndividualLog(ArrayList<String> timeArrayForLogRow, int leftPos, int rightPos){
        log.shouldBe(text(
                        timeArrayForLogRow.get(1) +
                        " Range 2(To):" +
                        rightPos +
                        " link clicked\n" +
                        timeArrayForLogRow.get(0) +
                        " Range 2(From):" +
                        leftPos +
                        " link clicked\n"));
    }

    public void checkIndividualLog(ArrayList<String> timeArrayForLogRow, int firstLeftPos, int firstRightPos, int secondLeftPos, int secondRightPos){
        log.shouldBe(text(
                        timeArrayForLogRow.get(3) +
                        " Range 2(To):" +
                        secondRightPos +
                        " link clicked\n" +
                        timeArrayForLogRow.get(2) +
                        " Range 2(From):" +
                        secondLeftPos +
                        " link clicked\n" +
                        timeArrayForLogRow.get(1) +
                        " Range 2(To):" +
                        firstRightPos +
                        " link clicked\n" +
                        timeArrayForLogRow.get(0) +
                        " Range 2(From):" +
                        firstLeftPos +
                        " link clicked\n"));
    }
}
