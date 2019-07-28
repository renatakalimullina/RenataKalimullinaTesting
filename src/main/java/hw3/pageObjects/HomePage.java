package hw3.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(css = ".profile-photo")
    private WebElement profilePhoto;

    @FindBy(css = "[id = 'name']")
    private WebElement userName;

    @FindBy(css = "[id = 'password']")
    private WebElement userPassword;

    @FindBy(css = ".login [type = 'submit']")
    private WebElement loginButton;


    public void login(String name, String password) {
        profilePhoto.click();
        userName.sendKeys(name);
        userPassword.sendKeys(password);
        loginButton.click();
    }
}
