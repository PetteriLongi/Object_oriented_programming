package T3_2;

public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    private String type;
    private String fuel;
    private double fuelEfficiency;
    private String fuelEfficiencyUnit;
    public AbstractVehicle(String type, String fuel, double fuelEfficiency, String fuelEfficiencyUnit) {
        this.type = type;
        this.fuel = fuel;
        this.fuelEfficiency = fuelEfficiency;
        this.fuelEfficiencyUnit = fuelEfficiencyUnit;
    }

    public String getType() {
        return type;
    }
    public String getFuel() {
        return fuel;
    }
    public String getFuelEfficiencyUnit() {
        return fuelEfficiencyUnit;
    }

    @Override
    public void start() {
        System.out.println(type + " is starting...");
    }
    @Override
    public void stop() {
        System.out.println(type + " is stopping...");
    }
    @Override
    public void charge() {
        System.out.println("Not possible to charge");
    }
    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }
    @Override
    public abstract String getInfo();
}
