package hw5.DatesAndServicePagesTests;

import com.codeborne.selenide.SelenideElement;
import hw5.enums.Users;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.open;

public class HomePageSelenide {

    @FindBy(css = ".profile-photo")
    private SelenideElement profilePhoto;

    @FindBy(css = "[id = 'name']")
    private SelenideElement userName;

    @FindBy(css = "[id = 'password']")
    private SelenideElement userPassword;

    @FindBy(css = ".login [type = 'submit']")
    private SelenideElement loginButton;


    public void openPage(){
        open("https://epam.github.io/JDI/index.html");
    }


    public void login(Users piterChailovskii) {
        profilePhoto.click();
        userName.setValue(piterChailovskii.getLogin());
        userPassword.setValue(piterChailovskii.getPassword());
        loginButton.click();
    }
}
