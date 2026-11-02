package T3_2;

public class ElectricMotorcycle extends AbstractVehicle {
    private String colour;
    public ElectricMotorcycle() {
        super("Electric Motorcycle", "Electricity", 0.1, "kWh/km");
        colour = "Blue";
    }

    @Override
    public void charge() {
        System.out.println("Electric Motorcycle is charging...");
    }
    @Override
    public String getInfo() {
        return getType() + " information:\n" +
                "Type: " + getType() + "\n" +
                "Fuel: " + getFuel() + "\n" +
                "Colour: " + colour;
    }
}
