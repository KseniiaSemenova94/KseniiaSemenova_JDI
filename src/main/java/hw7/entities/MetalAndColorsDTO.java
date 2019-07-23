package hw7.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class MetalAndColorsDTO {
    public List<Integer> summary;
    public List<String> elements;
    public String color;
    public String metals;
    public List<String> vegetables;

    public static MetalAndColors getMetalAndColorsFromDTO(MetalAndColorsDTO dto) {
        return new MetalAndColors(
                dto.summary.get(0),
                dto.summary.get(1),
                dto.elements,
                dto.color,
                dto.metals,
                dto.vegetables);
    }
}
