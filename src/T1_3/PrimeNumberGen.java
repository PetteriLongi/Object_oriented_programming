package T1_3;

import java.util.Scanner;

public class PrimeNumberGen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start: positive integer: ");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter end: positive integer: ");
        int end = Integer.parseInt(scanner.nextLine());

        for (int number = start; number <= end; number++) {
            boolean isPrime = number >= 2;

            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
        if (isPrime) {
            System.out.print(number + " ");
        }
    }
        scanner.close();
    }
}
