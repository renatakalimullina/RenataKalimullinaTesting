package hw6.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage {

    private static HomePage instance;

    private HomePage(WebDriver driver) {
        super(driver);
    }

    public static HomePage getInstance(WebDriver driver) {
        if (instance == null) {
            instance = new HomePage(driver);
        }
        return instance;
    }

    @FindBy(css = ".profile-photo")
    private WebElement profilePhoto;

    @FindBy(css = "[id = 'name']")
    private WebElement userName;

    @FindBy(css = "[id = 'password']")
    private WebElement userPassword;

    @FindBy(css = ".login [type = 'submit']")
    private WebElement loginButton;




    public void openPage(){
        driver.get("https://epam.github.io/JDI");
    }


    public void login(String username, String password){
        profilePhoto.click();
        userName.sendKeys(username);
        userPassword.sendKeys(password);
        loginButton.click();
    }



}
