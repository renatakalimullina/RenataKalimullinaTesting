package hw6.pageObjects;

import hw6.hooks.TestDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static hw5.enums.HomePage.HOME_PAGE;
import static org.testng.Assert.assertEquals;

public class HomePage  extends BasePage {

    private static HomePage instance;

    @FindBy(css = ".profile-photo")
    private WebElement profilePhoto;

    @FindBy(css = "[id = 'name']")
    private WebElement userName;

    @FindBy(css = "[id = 'password']")
    private WebElement userPassword;

    @FindBy(css = ".login [type = 'submit']")
    private WebElement loginButton;

    private HomePage(WebDriver driver) {
        super(driver);
    }


    public void openPage(){
        driver.get("https://epam.github.io/JDI");
    }


    public void login(String username, String password){
        profilePhoto.click();
        userName.sendKeys(username);
        userPassword.sendKeys(password);
        loginButton.click();
    }


    public void checkTitle(){
        assertEquals(TestDriver.getDriver().getTitle(), HOME_PAGE.getTitleName());
    }


    public static HomePage getInstance(WebDriver driver) {
        if (instance == null) {
            instance = new HomePage(driver);
        }
        return instance;
    }

}
