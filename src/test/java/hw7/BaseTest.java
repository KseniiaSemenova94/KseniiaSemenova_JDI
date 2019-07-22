package hw7;

import com.epam.jdi.light.driver.get.DriverData;
import hw7.enums.User;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import static com.epam.jdi.light.ui.html.PageFactory.initElements;

public class BaseTest {

    @BeforeTest
    public void beforeClass() {
        DriverData.CHROME_OPTIONS = () -> {
            ChromeOptions cap = new ChromeOptions();
            cap.addArguments("--start-maximized");
            return cap;
        };
        initElements(JdiSite.class);
    }

    // TODO 1. This is not the bes idea to create just a methods in a *test class.
    // Use @Before* annotation, for the example.
    public void loginAsUser(User user) {
        JdiSite.open();
        JdiSite.homePage.login(user);
        JdiSite.homePage.checkLoggedIn(user);
    }

    @AfterClass
    public void afterClass() {
        killAllSeleniumDrivers();
    }
}
