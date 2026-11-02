package T3_2;

public class Bus extends AbstractVehicle {
    private int capacity;
    public Bus() {
        super("Bus", "Diesel", 5, "l/100km");
        capacity = 40;
    }

    @Override
    public String getInfo() {
        return getType() + " Information:\n" +
                "Type: " + getType() + "\n" +
                "Fuel: " + getFuel() + "\n" +
                "Capacity: " + capacity + " passengers";
    }
}
