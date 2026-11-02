package T3_2;

public class ElectricCar extends AbstractVehicle {
    private String colour;
    public ElectricCar() {
        super("Electric car", "Electricity", 0.2, "kWh/km");
        colour = "White";
    }

    @Override
    public void charge() {
        System.out.println("Electric car is charging...");
    }
    @Override
    public String getInfo() {
        return getType() + " Information:\n" +
                "Type" + getType() + "\n" +
                "Fuel" + getFuel() + "\n" +
                "Colour: " + colour;
    }
}
