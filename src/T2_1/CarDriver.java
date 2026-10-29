package T2_1;
/* Why to modify the CarDriver first?
    To define expected behaviour before implementing it? Test driven development.
 */

public class CarDriver {
    public static void main(String[] args) {
        Car myCar;
        Car myCar2;

        myCar = new Car("Toyota Corolla");
        myCar2 = new Car("Gas Tesla", 60, 0);

        System.out.println(myCar.getTypeName() + ": gas at: " + myCar.getGasolineLevel());
        System.out.println(myCar2.getTypeName() + ": gas at: " + myCar2.getGasolineLevel());

        myCar.fillTank();
        myCar2.fillTank();

        System.out.println(myCar.getTypeName() + ": gas at: " + myCar.getGasolineLevel());
        System.out.println(myCar2.getTypeName() + ": gas at: " + myCar2.getGasolineLevel());

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
        // Cruise control tests

        myCar2.setCruiseControlSpeed(50);
        System.out.println("Target speed: "
                + myCar2.getCruiseControlSpeed());

        if (myCar2.turnOnCruiseControl()) {
            System.out.println("Cruise control turned on.");
        } else {
            System.out.println("Cruise control could not be turned on.");
        }

        System.out.println("Current speed: " + myCar2.getSpeed());

        myCar2.setCruiseControlSpeed(35);
        System.out.println("New target speed: "
                + myCar2.getCruiseControlSpeed());
        System.out.println("Adjusted speed: " + myCar2.getSpeed());

        myCar2.turnOffCruiseControl();
        System.out.println("Cruise control turned off.");

        if (!myCar2.setCruiseControlSpeed(0)) {
            System.out.println("Speed below minimum was rejected.");
        }

        if (!myCar2.setCruiseControlSpeed(500)) {
            System.out.println("Speed above maximum was rejected.");
        }

        Car emptyCar = new Car("Empty Car");
        emptyCar.setCruiseControlSpeed(50);

        if (!emptyCar.turnOnCruiseControl()) {
            System.out.println(
                    "Cruise control cannot operate without fuel.");
        }
    }
}