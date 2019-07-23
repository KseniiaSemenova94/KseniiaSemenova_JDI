package hw7.pages;

import com.epam.jdi.light.elements.base.UIElement;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import hw7.entities.MetalAndColors;
import hw7.forms.MetalAndColorsForm;
import java.util.List;
import java.util.stream.Collectors;
import static org.testng.Assert.assertEquals;

@Url("metals-colors.html") @Title("Metal and Colors")
public class MetalAndColorsPage extends BasePage {

    private MetalAndColorsForm metalAndColorsForm;

    @FindBy(xpath = "//ul[@class='panel-body-list results']//li")
    private UIElement results;


    public void fillAndSubmitMetalAndColorsForm(MetalAndColors defaultData) {
        metalAndColorsForm.fillForm(defaultData);
        metalAndColorsForm.submitForm();
    }

    public void checkResults(MetalAndColors defaultData) {
        assertEquals(getResults(), defaultData.getExpectedResults());
    }

    public List<String> getResults() {
        // TODO Take a look on IDEA warning. - I understand now, it's more readable
        return results.getAll()
                .stream()
                .map(el -> el.getText())
                .collect(Collectors.toList());
    }
}
