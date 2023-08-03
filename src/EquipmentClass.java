
import java.util.ArrayList;
import java.util.List;

public class EquipmentClass {
    private List<EquipmentProperty> properties;
    private List<EquipmentClassProperty> classProperties;

    public EquipmentClass() {
        this.properties = new ArrayList<>();
        this.classProperties = new ArrayList<>();
    }

    public void addProperty(EquipmentProperty property) {
        properties.add(property);
    }

    public void addClassProperty(EquipmentClassProperty classProperty) {
        classProperties.add(classProperty);
    }

    public List<EquipmentProperty> getProperties() {
        return properties;
    }

    public List<EquipmentClassProperty> getClassProperties() {
        return classProperties;
    }
}