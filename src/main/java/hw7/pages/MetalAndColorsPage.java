package hw7.pages;

import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;

@Url("metals-colors.html") @Title("Metal and Colors")
public class MetalAndColorsPage extends BasePage {

    public void checkMetalAndColorsPageOpened(){
        checkOpened();
    }
}
