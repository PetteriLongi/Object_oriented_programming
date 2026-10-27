package T1_4;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size of the array?");
        int size = Integer.parseInt(scanner.nextLine());

        int[] num = new int[size];
        System.out.println("Integers for the array?");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ":");
            num[i] = Integer.parseInt(scanner.nextLine());
        }
        int[] uniqueNum = new int[size];
        int uniqueCount = 0;

        for (int i = 0; i < size; i++) {
            boolean duplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (num[i] == uniqueNum[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                uniqueNum[uniqueCount] = num[i];
                uniqueCount++;
            }
        }
        System.out.println("the array without duplicates:");

        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueNum[i] + " ");
        }
        scanner.close();
    }
}