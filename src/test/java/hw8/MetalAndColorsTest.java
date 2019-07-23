package hw8;

import hw7.BaseTest;
import hw7.JdiSite;
import hw7.entities.MetalAndColors;
import hw7.enums.User;
import hw8.dataProviders.MetalAndColorsDataProvider;
import org.testng.annotations.Test;

public class MetalAndColorsTest extends BaseTest {

    @Test(dataProvider = "dataset", dataProviderClass = MetalAndColorsDataProvider.class)
    public void metalAndColorsTest(MetalAndColors data) {
        loginAsUser(User.PITER);
        JdiSite.homePage.openMetalAndColorsPageByHeaderMenu();
        JdiSite.metalAndColorsPage.checkMetalAndColorsPageOpened();
        JdiSite.metalAndColorsPage.fillAndSubmitMetalAndColorsForm(data);
        JdiSite.metalAndColorsPage.checkResults(data);
    }
}
