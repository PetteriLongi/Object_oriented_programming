package T3_1;

import T2_1.Car;

public class SportsCar extends Car {
    public SportsCar(String typeName) {
        super(typeName);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        if (getGasolineLevel() > 0) {
            super.accelerate();
        }
    }
    @Override
    public void decelerate(int amount) {
        super.decelerate(amount * 2);
    }
}