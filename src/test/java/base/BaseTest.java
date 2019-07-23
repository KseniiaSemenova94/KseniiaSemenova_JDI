package base;

import com.epam.jdi.light.driver.get.DriverData;
import hw7.JdiSite;
import hw7.enums.User;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import static com.epam.jdi.light.ui.html.PageFactory.initElements;

public class BaseTest {

    // TODO 1. This is not the bes idea to create just a methods in a *test class.
    // Use @Before* annotation, for the example. - I decided to take out the login step to BeforeTest, since in the hw8
    // we run several tests in a row, and I did't want to logout
    @BeforeTest
    public void beforeClass() {
        DriverData.CHROME_OPTIONS = () -> {
            ChromeOptions cap = new ChromeOptions();
            cap.addArguments("--start-maximized");
            return cap;
        };
        initElements(JdiSite.class);
        JdiSite.open();
        JdiSite.homePage.login(User.PITER);
        JdiSite.homePage.checkLoggedIn(User.PITER);
    }

    @AfterClass
    public void afterClass() {
        killAllSeleniumDrivers();
    }
}
