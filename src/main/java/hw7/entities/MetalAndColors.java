package hw7.entities;

import com.epam.jdi.tools.DataClass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class MetalAndColors extends DataClass<MetalAndColors> {

    private static final String LINE_SEPARATOR = ", ";

    private int oddSummaryNumber;
    private int evenSummaryNumber;
    private List<String> elements;
    private String color;
    private String metal;
    private List<String> vegetables;

    MetalAndColors() {

    }

    public List<String> getExpectedResults(){
        // TODO FYI
        return new ArrayList<String>() {{
            add("Summary: " + sum());
            add("Elements: " + String.join(LINE_SEPARATOR, elements));
            add("Color: " + color);
            add("Metal: " + metal);
            add("Vegetables: " + String.join(LINE_SEPARATOR, vegetables));
        }};
    }

    private int sum() {
        return (oddSummaryNumber + evenSummaryNumber);
    }
}
