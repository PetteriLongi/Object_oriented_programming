import java.util.Scanner;

public class F_to_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = Double.parseDouble(scanner.nextLine());
        double celsius = (fahrenheit - 32) * 5/9;

        System.out.printf("Temperature in Celsius %.1f%n", celsius);

        scanner.close();
    }
}
