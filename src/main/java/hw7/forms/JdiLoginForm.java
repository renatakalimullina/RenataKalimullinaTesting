package hw7.forms;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.common.TextField;
import hw7.entities.Users;
import org.openqa.selenium.support.FindBy;

public class JdiLoginForm extends Form<Users> {

    @FindBy(css = "#name")
    TextField login;

    @FindBy(css = "#password")
    TextField password;

    @FindBy(css = "#login-button")
    Button submit;

    @Override
    public void login(Users user) {
        login.input(user.getLogin());
        password.input(user.getPassword());

        submit.click();
    }
}
