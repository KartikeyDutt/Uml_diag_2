import java.util.ArrayList;
import java.util.List;

public class Equipment {
    private List<EquipmentProperty> properties;

    public Equipment() {
        this.properties = new ArrayList<>();
    }

    public void addProperty(EquipmentProperty property) {
        properties.add(property);
    }

    public List<EquipmentProperty> getProperties() {
        return properties;
    }
}
