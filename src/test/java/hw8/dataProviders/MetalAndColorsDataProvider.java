package hw8.dataProviders;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import hw7.entities.MetalAndColors;
import hw7.entities.MetalAndColorsDTO;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class MetalAndColorsDataProvider {

    private static final String PATH = "src\\test\\resources\\JDI_ex8_metalsColorsDataSet.json";

    @DataProvider(name = "dataset")
    public Object[] getData() {
        ArrayList<MetalAndColors> list = new ArrayList<>();
        HashMap<String, MetalAndColorsDTO> map = getMapFromFile(PATH);
        for (MetalAndColorsDTO value : map.values()) {
            list.add(MetalAndColorsDTO.getMetalAndColorsFromDTO(value));
        }
        return list.toArray();
    }

    private HashMap<String, MetalAndColorsDTO> getMapFromFile(String path) {
        HashMap<String, MetalAndColorsDTO> map = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            map = mapper.readValue(new File(path), new TypeReference<HashMap<String, MetalAndColorsDTO>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
