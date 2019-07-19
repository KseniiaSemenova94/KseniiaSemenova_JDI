package hw7.entities;

import com.epam.jdi.tools.DataClass;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MetalAndColors extends DataClass<MetalAndColors> {

    private int oddSummaryNumber;
    private int evenSummaryNumber;
    private List<String> elements;
    private String color;
    private String metal;
    private List<String> vegetables;

   private int sum() {
       return (oddSummaryNumber + evenSummaryNumber);
   }


}
