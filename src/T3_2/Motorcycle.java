package T3_2;

public class Motorcycle extends AbstractVehicle {
    private String colour;
    public Motorcycle() {
        super("Motorcycle", "Gasoline", 45, "l/100km");
        colour = "Black";
    }

    @Override
    public String getInfo() {
        return getType() + " information:\n" +
                "Type: " + getType() + "\n" +
                "Fuel: " + getFuel() + "\n" +
                "Colour: " + colour;
    }
}
