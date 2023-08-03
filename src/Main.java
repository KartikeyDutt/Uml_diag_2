import java.util.List;

public class Main {
    public static void main(String[] args) {
        Equipment equipment = new Equipment();
        EquipmentClass equipmentClass = new EquipmentClass();

        EquipmentProperty equipmentProperty1 = new EquipmentProperty("Equipment Property 1");
        EquipmentProperty equipmentProperty2 = new EquipmentProperty("Equipment Property 2");

        EquipmentClassProperty equipmentClassProperty1 = new EquipmentClassProperty("Equipment Class Property 1");
        EquipmentClassProperty equipmentClassProperty2 = new EquipmentClassProperty("Equipment Class Property 2");

        equipment.addProperty(equipmentProperty1);
        equipment.addProperty(equipmentProperty2);

        equipmentClass.addProperty(equipmentProperty1);
        equipmentClass.addProperty(equipmentProperty2);

        equipmentClass.addClassProperty(equipmentClassProperty1);
        equipmentClass.addClassProperty(equipmentClassProperty2);

        System.out.println("Equipment Properties:");
        List<EquipmentProperty> equipmentProperties = equipment.getProperties();
        for (int i = 0; i < equipmentProperties.size(); i++) {
            EquipmentProperty property = equipmentProperties.get(i);
            System.out.println(property.getName());
        }
        System.out.println("\nEquipment Class Properties:");
        List<EquipmentProperty> equipmentClassProperties = equipmentClass.getProperties();
        for (int i = 0; i < equipmentClassProperties.size(); i++) {
            EquipmentProperty property = equipmentClassProperties.get(i);
            System.out.println(property.getName());
        }
        System.out.println("\nEquipment-class Class Properties:");
        List<EquipmentClassProperty> classProperties = equipmentClass.getClassProperties();
        for (int i = 0; i < classProperties.size(); i++) {
            EquipmentClassProperty classProperty = classProperties.get(i);
            System.out.println(classProperty.getName());
        }
    }
}