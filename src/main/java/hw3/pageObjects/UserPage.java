package hw3.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserPage {

    @FindBy(css = "#user-name")
    private WebElement logginedUser;



    @FindBy(css = "li")
    private List<WebElement>  elements;

    @FindBy(css = "a[href^='metals-colors']")
    private WebElement metalsColors;


    @FindBy(css = ".icon-practise")
    private WebElement firstImage;

    @FindBy(css = ".icon-custom")
    private WebElement secondImage;

    @FindBy(css = ".icon-multi")
    private WebElement thirdImage;

    @FindBy(css = ".icon-base")
    private WebElement fourthImage;



    @FindBy(xpath = ("(//*[@class = 'row clerafix benefits']//span[@class = 'benefit-txt'])[1]"))
    private WebElement firstText;

    @FindBy(xpath = ("(//*[@class = 'row clerafix benefits']//span[@class = 'benefit-txt'])[2]"))
    private WebElement secondText;

    @FindBy(xpath = ("(//*[@class = 'row clerafix benefits']//span[@class = 'benefit-txt'])[3]"))
    private WebElement thirdText;

    @FindBy(xpath = ("(//*[@class = 'row clerafix benefits']//span[@class = 'benefit-txt'])[4]"))
    private WebElement fourthText;



    @FindBy(css = "[name = 'main-title']")
    private WebElement mainTitle;

    @FindBy(css = "[name = 'jdi-text']")
    private WebElement jdiText;



    @FindBy(css = "#iframe")
    private WebElement iframe;

    @FindBy(css = "#epam_logo")
    private WebElement epamLogoIframe;



    @FindBy(css = "#mCSB_1")
    private WebElement leftSection;



    @FindBy(css = ".footer-bg")
    private WebElement footer;



    public String getLoggedUser() {
        return logginedUser.getText();
    }

    public String fourItems(int number) {
        return elements.get(number).getText();
    }

    public String getMetals(){
        return metalsColors.getText();
    }

    public void fourImages(){
        firstImage.isDisplayed();
        secondImage.isDisplayed();
        thirdImage.isDisplayed();
        fourthImage.isDisplayed();
    }

    public String fourTexts(int number){
        if (number == 1)
            return firstText.getText();
        else if (number == 2)
            return secondText.getText();
        else if (number == 3)
            return thirdText.getText();
        else
            return fourthText.getText();
    }

    public String textsOfTheMainHeaders(int number){
        if (number == 1)
            return mainTitle.getText();
        else
            return jdiText.getText();
    }

    public void iframeInTheCenter(){
        iframe.isDisplayed();
    }

    public WebElement switchToTheIframe(){
        return iframe;
    }

    public void checkEpamLogoIframe(){
        epamLogoIframe.isDisplayed();
    }

    public void LeftSection(){
        leftSection.isDisplayed();
    }

    public void thereIsFooter(){
        footer.isDisplayed();
    }
}

