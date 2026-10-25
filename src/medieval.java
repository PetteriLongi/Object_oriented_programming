import java.util.Scanner;

public class medieval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Weight in grams: ");
        double ogGrams = Double.parseDouble(scanner.nextLine());
        double grams = ogGrams;
        double luotiG = 13.28;
        double naulaG = 32 * luotiG;
        double leiviskaG = 20 * naulaG;

        int leiviska = (int) (grams / leiviskaG);
        grams -= leiviska * leiviskaG;
        int naula = (int) (grams / naulaG);
        grams -= naula * naulaG;
        double luoti = grams / luotiG;

        System.out.printf(
                "%.0f grams is %d leiviska, %d naula, and %.2f luoti %n",
                ogGrams, leiviska, naula, luoti);
        scanner.close();
    }
}
