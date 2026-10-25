package T1_3;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter B: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter C: ");
        double c = Double.parseDouble(scanner.nextLine());

        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.print("Root: " + root1 + " ");
            System.out.print("Root: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);

            System.out.println("Root: " + root);
        } else {
            System.out.println("No realroots");
        }
        scanner.close();
    }
}
