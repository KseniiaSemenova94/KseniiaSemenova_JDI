package hw7;

import hw7.entities.DefaultsData;
import hw7.enums.User;
import org.testng.annotations.Test;

public class MetalAndColorsTest extends BaseTest {

    @Test
    public void metalAndColorsTest() {
        loginAsUser(User.PITER);
        JdiSite.homePage.openMetalAndColorsPageByHeaderMenu();
        JdiSite.metalAndColorsPage.checkMetalAndColorsPageOpened();
        JdiSite.metalAndColorsPage.fillAndSubmitMetalAndColorsForm(DefaultsData.DEFAULT_DATA);
    }
}
