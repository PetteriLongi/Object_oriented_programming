package T1_4;

import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstN = {"Jonathan", "Sneed", "Benedict", "Gallandhorn", "Grinsh", "Benjamin-benjaminson" };
        String[] lastN = {"Throckmorton", "Stormcloak", "Damdaniel", "Slork", "Slorg", "Workman"};

        System.out.print("How many names should I generate? ");
        int amount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < amount; i++) {
            int firstIndex = (int) (Math.random() * firstN.length);
            int lastIndex = (int) (Math.random() * lastN.length);

            System.out.println(firstN[firstIndex] + " " + lastN[lastIndex]);
        }
        scanner.close();
    }
}
