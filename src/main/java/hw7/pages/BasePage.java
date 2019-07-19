package hw7.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.XPath;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.common.Label;
import com.epam.jdi.light.ui.html.complex.Menu;
import hw7.enums.HeaderMenuItem;
import hw7.enums.User;
import hw7.forms.LoginForm;
import org.hamcrest.Matchers;

public class BasePage extends WebPage {

    private LoginForm loginForm;

    @Css("#user-name")
    private Label userName;

    @Css(".profile-photo")
    private Button profilePhoto;

    @XPath("//ul[@class='uui-navigation nav navbar-nav m-l8']/li")
    private Menu headerMenu;

    public void login(User user) {
        profilePhoto.click();
        loginForm.login(user);
    }

    public void checkLoggedIn(User user) {
        userName.shouldBe().text(Matchers.equalTo(user.getFullName()));
    }

    public void openMetalAndColorsPageByHeaderMenu() {
        clickOnHeaderMenuItem(HeaderMenuItem.METALS_AND_COLORS);
    }

    private void clickOnHeaderMenuItem(HeaderMenuItem item){
        headerMenu.select(item.getName());
    }
}
