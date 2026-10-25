import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lenght of the first leg: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the length of the second leg: ");
        double b = Double.parseDouble(scanner.nextLine());

        double c = Math.sqrt(a * a + b * b);

        System.out.print("The hypotenuse is: " + c);
        scanner.close();
    }
}
