package T4;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(5);
        calculator.add(10);
        calculator.add(15);

        System.out.println("Sum: " + calculator.getValue());

        calculator.reset();
        System.out.println("after reset: " + calculator.getValue());

        try {
            calculator.add(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
