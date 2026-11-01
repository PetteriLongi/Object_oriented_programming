package T3_1;

import T2_1.Car;

public class Bus extends Car {

    private int passengerCount;
    public Bus(String typeName) {
        super(typeName);
        passengerCount = 0;
    }
    public void passengerEnter() {
        passengerCount++;
    }
    public void passengerExit() {
        if (passengerCount > 0) {
            passengerCount--;
        }
    }
    public int getPassengerCount() {
        return passengerCount;
    }
}
