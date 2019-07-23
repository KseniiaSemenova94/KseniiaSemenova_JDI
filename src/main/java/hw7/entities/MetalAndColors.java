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
        List<String>  resultList = new ArrayList<>();
        resultList.add("Summary: " + sum());
        resultList.add("Elements: " + String.join(LINE_SEPARATOR, elements));
        resultList.add("Color: " + color);
        resultList.add("Metal: " + metal);
        resultList.add("Vegetables: " + String.join(LINE_SEPARATOR, vegetables));
        return resultList;
    }

    private int sum() {
        return (oddSummaryNumber + evenSummaryNumber);
    }
}
