package T1_4;

import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size of the array? ");
        int size = Integer.parseInt(scanner.nextLine());

        int [] num = new int[size];
        System.out.println("Integers for the array ");
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter integer " + (i + 1) + " ");
            num[i] = Integer.parseInt(scanner.nextLine());
        }

        int max = num[0];
        int startI = 0;
        int endI = 0;

        for (int start = 0; start < num.length; start++) {
            int sum = 0;
            for (int end = start; end < num.length; end ++) {
                sum += num[end];

                if (sum > max) {
                    max = sum;
                    startI = start;
                    endI = end;
                }
            }
        }
        System.out.println();
        System.out.println("Max sum " + max);
        System.out.println("Integers: " + (startI + 1) + "-" + (endI + 1));

        scanner.close();
    }
}
