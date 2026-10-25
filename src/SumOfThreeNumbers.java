import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        int sum = first + second + third;
        int product = first * second * third;
        // We have to use 3.0 instead of 3 since 3 is an integer and dividing two integers discards the decimal.
        // 3.0 is a double so it keeps the decimal.
        double average = sum / 3.0;

        System.out.println("The sum of the numbers is " + sum);
        System.out.println("The product of the number is " + product);
        System.out.println("The average of the number is " + average);
    }
}