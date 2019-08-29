package hw3.pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    @FindBy(css = ".profile-photo")
    private WebElement profilePhoto;

    @FindBy(css = "[id = 'name']")
    private WebElement userName;

    @FindBy(css = "[id = 'password']")
    private WebElement userPassword;

    @FindBy(css = ".login [type = 'submit']")
    private WebElement loginButton;


    @Step("Open test site by URL")
    public void openPage(){
        open("https://epam.github.io/JDI/index.html");
    }

    public void login(String name, String password) {
        profilePhoto.click();
        userName.sendKeys(name);
        userPassword.sendKeys(password);
        loginButton.click();
    }
}
