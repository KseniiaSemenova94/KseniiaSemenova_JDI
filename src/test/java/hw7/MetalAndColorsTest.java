package hw7;

import base.BaseTest;
import hw7.entities.DefaultsData;
import hw7.enums.HeaderMenuItem;
import org.testng.annotations.Test;

public class MetalAndColorsTest extends BaseTest {

    @Test
    public void metalAndColorsTest() {
        // TODO Why don't you parametrised thi methods ?? - Fixed, I made the method universal as it should have been
        JdiSite.homePage.openNewPageByHeaderMenu(HeaderMenuItem.METALS_AND_COLORS);
        JdiSite.metalAndColorsPage.checkOpened();
        // !TODO - I decided to remove the method from MetalAndColorsForm and make it easier
        JdiSite.metalAndColorsPage.fillAndSubmitMetalAndColorsForm(DefaultsData.DEFAULT_DATA);
        JdiSite.metalAndColorsPage.checkResults(DefaultsData.DEFAULT_DATA);
    }
}
