package hw7.forms;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.common.TextField;
import hw7.enums.User;

public class LoginForm extends Form<User> {

    @FindBy(css = "#name")
    private TextField login;

    @FindBy(css = "#password")
    private TextField password;

    @FindBy(css = "#login-button")
    private Button submit;

    @Override
    public void login(User user) {
        login.input(user.getLogin());
        password.input(user.getPassword());
        submit.click();
    }
}
