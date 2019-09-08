package hw5.pageObjects.SimpleCompareTest;

import io.qameta.allure.Step;
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


    @Step("Get logged user name")
    public String getLoggedUser() {
        return logginedUser.getText();
    }

    @Step("Get one of the header section text")
    public String fourItems(int number) {
        return elements.get(number).getText();
    }

    @Step("Get one of the header section - Metals")
    public String getMetals(){
        return metalsColors.getText();
    }

    @Step("Check that the 4 images on the Index Page  are displayed")
    public void fourImages(){
        firstImage.isDisplayed();
        secondImage.isDisplayed();
        thirdImage.isDisplayed();
        fourthImage.isDisplayed();
    }

    @Step("Get one of the 4 texts on the Index Page")
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

    @Step("Get a text one of the main headers")
    public String textsOfTheMainHeaders(int number){
        if (number == 1)
            return mainTitle.getText();
        else
            return jdiText.getText();
    }

    @Step("Check that there is the iframe in the center of page")
    public void iframeInTheCenter(){
        iframe.isDisplayed();
    }

    @Step("Get iframe")
    public WebElement switchToTheIframe(){
        return iframe;
    }

    @Step("Check that there is Epam logo in the left top conner of iframe")
    public void checkEpamLogoIframe(){
        epamLogoIframe.isDisplayed();
    }

    @Step("Check Left Section")
    public void LeftSection(){
        leftSection.isDisplayed();
    }

    @Step("Check Footer")
    public void thereIsFooter(){
        footer.isDisplayed();
    }
}

