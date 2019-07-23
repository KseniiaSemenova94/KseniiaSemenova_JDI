package hw7;

import hw7.entities.DefaultsData;
import hw7.enums.User;
import org.testng.annotations.Test;

public class MetalAndColorsTest extends BaseTest {

    @Test
    public void metalAndColorsTest() {
        loginAsUser(User.PITER);
        // TODO Why don't you parametrised thi methods ??
        JdiSite.homePage.openMetalAndColorsPageByHeaderMenu();
        JdiSite.metalAndColorsPage.checkMetalAndColorsPageOpened();
        // !TODO
        JdiSite.metalAndColorsPage.fillAndSubmitMetalAndColorsForm(DefaultsData.DEFAULT_DATA);
        JdiSite.metalAndColorsPage.checkResults(DefaultsData.DEFAULT_DATA);
    }
}
