package T2_1;

/* Define a class Car (convention capitalizes class names).
 * Car is public (as classes usually are, more on this later).
 */
public class Car {
    /* An object of class Car will have instance variables speed and gasolineLevel.
     * Both are private (they can not be accessed outside the class methods).
     * Keep instance variables private whenever possible.
     */
    private double speed;
    private double gasolineLevel;
    private double tankCapacity;
    private String typeName;
    private double cruiseControlSpeed;
    private boolean cruiseControlOn;

    /* This is the method (constructor) called when a new instance of Car is created (with new).
     * Constructors may also have arguments.
     */
    public Car(String typeName) {
        speed = 0; gasolineLevel = 0; tankCapacity = 100;
        this.typeName = typeName;   // this refers to the object itself.
        // The reference is useful if you want to use parameter names that are
        // identical to instance variable names (and for more, later on)
    }

    public Car(String typeName, double tankCapacity, double speed) {
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.speed = speed;
        gasolineLevel = 0;
        cruiseControlSpeed = 0;
        cruiseControlOn = false;
    }

    /* Implementations of some methods.
     * Note that methods refer to and change instance variable values.
     */
    protected void consumeGasoline(double amount) {
        gasolineLevel = Math.max(0, gasolineLevel - amount);
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
            consumeGasoline(1);
        } else {
            speed = 0;
        }
    }
    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    double getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = tankCapacity;
    }
    public double getGasolineLevel() {
        return gasolineLevel;
    }

    public boolean setCruiseControlSpeed(double speed) {
        if (speed >= 30 && speed <= 180) {
            cruiseControlSpeed = speed;

            if (cruiseControlOn) {
                while (this.speed < cruiseControlSpeed) {
                    accelerate();

                    if (this.speed > cruiseControlSpeed) {
                        this.speed = cruiseControlSpeed;
                    }
                }
                while (this.speed > cruiseControlSpeed) {
                    decelerate((int) Math.min(10, this.speed - cruiseControlSpeed));
                }
            }
            return true;
        }
        return false;
    }

    public double getCruiseControlSpeed() {
        return cruiseControlSpeed;
    }

    public boolean turnOnCruiseControl() {
        if (gasolineLevel > 0 &&
                cruiseControlSpeed >= 30 &&
                cruiseControlSpeed <= 180) {
            cruiseControlOn = true;
            while (this.speed < cruiseControlSpeed) {
                accelerate();

                if (this.speed > cruiseControlSpeed) {
                    this.speed = cruiseControlSpeed;
                }
            }
            while (this.speed > cruiseControlSpeed) {
                decelerate((int) Math.min(10, this.speed - cruiseControlSpeed));
            }
            return true;
        } else {
            cruiseControlOn = false;
            return false;
        }
    }

    public void turnOffCruiseControl() {
        cruiseControlOn = false;
    }
}