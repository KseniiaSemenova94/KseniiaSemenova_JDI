package hw7;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import hw7.pages.HomePage;
import hw7.pages.MetalAndColorsPage;

@JSite("https://epam.github.io/JDI/")
public class JdiSite {

    public static HomePage homePage;
    public static MetalAndColorsPage metalAndColorsPage;

    public static void open() {
        homePage.open();
    }
}
