package T1_3;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;

        do {
            score = 0;
            for (int i = 1; i <= 10; i++) {
                int a = (int) (Math.random() * 10) + 1;
                int b = (int) (Math.random() * 10) + 1;
                System.out.print(a + " * " + b + " = ");
                int answer = Integer.parseInt(scanner.nextLine());

                if (answer == a * b) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect! correct answer is " + (a * b));
                }
            }
            System.out.println("Your score " + score + "/10");
            if (score == 10) {
                System.out.println("Congratulations! You are the master");
            } else {
                System.out.println("OOF try again!");
            }
        } while (score < 10);

            scanner.close();
        }
}

