package T4;

public class Calculator {
    private int value;

    public void reset() {
        value = 0;
    }

    // Adds a positive integer to the currecnt calculator value.
    // Throws an exception if the number is negative.
    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        int i = 0;
        while (i < number) {
            value++;
            i++;
        }
    }

    public int getValue() {
        return value;
    }
}
