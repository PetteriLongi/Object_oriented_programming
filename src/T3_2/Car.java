package T3_2;

public class Car extends AbstractVehicle {
    private String colour;
    public  Car() {
        super("Car", "Petrol", 25, "l/100km");
        colour = "Red";
    }

    @Override
    public String getInfo() {
        return getType() + " information:\n" +
                "Type: " + getType() + "\n" +
                "Fuel: " + getFuel() + "\n" +
                "Colour: " + colour;
    }

}
