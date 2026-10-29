package T2_1;

public class CoffeeMaker {
    private boolean on;
    private String coffeeType;
    private int coffeeAmount;

    public CoffeeMaker() {
        on = false;
        coffeeType = "normal";
        coffeeAmount = 10;
    }

    public boolean isOn() {
        return on;
    }
    public void pressOnOff() {
        on = !on;
    }

    public String getCoffeeType() {
        return coffeeType;
    }
    /* I chose to use logical operators to avoid duplicate code "this.coffeetype"
       || means that at least one has to be true
       && means that both have to be true
     */
    public void setCoffeeType(String coffeeType) {
        if (on) {
            if (coffeeType.equals("normal") || coffeeType.equals("espresso"))
                this.coffeeType = coffeeType;
        }
    }
    public int getCoffeeAmount() {
        return coffeeAmount;
    }
    public void setCoffeeAmount(int coffeeAmount) {
        if (on) {
            if (coffeeAmount >= 10 && coffeeAmount <= 80)
                this.coffeeAmount = coffeeAmount;
        }
    }
}
