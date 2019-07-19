package hw7.pages;

import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import hw7.entities.MetalAndColors;
import hw7.forms.MetalAndColorsForm;

@Url("metals-colors.html") @Title("Metal and Colors")
public class MetalAndColorsPage extends BasePage {

    private MetalAndColorsForm metalAndColorsForm;

    public void checkMetalAndColorsPageOpened(){
        checkOpened();
    }

    public void fillAndSubmitMetalAndColorsForm(MetalAndColors defaultData) {
        metalAndColorsForm.fillForm(defaultData);
        metalAndColorsForm.submitForm();
    }


}
