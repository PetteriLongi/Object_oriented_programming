package T3_2;

import java.util.ArrayList;
import java.util.List;

public class VehicleDemo {
    public static void main(String[] args) {

        List<AbstractVehicle> vehicles = new ArrayList<>();
                vehicles.add(new Car());
                vehicles.add(new Motorcycle());
                vehicles.add(new Bus());
                vehicles.add(new ElectricCar());
                vehicles.add(new ElectricMotorcycle());

        System.out.println("Vehicle Demonstration");
        System.out.println();
        for (AbstractVehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.stop();
            System.out.println(vehicle.getInfo());
            vehicle.charge();
            System.out.println("Fuel efficiency: " +
                    vehicle.calculateFuelEfficiency() + " " + vehicle.getFuelEfficiencyUnit());
            System.out.println();
        }
    }
}
