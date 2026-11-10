package T3_4;

import java.io.*;

public class Task2 {
    private final static String FILENAME = "fibonakki.csv";
    public static void main(String[] args) {
        long first = 0;
        long second = 1;

        try (
                Writer writer = new FileWriter(FILENAME);
                BufferedWriter bufferedWriter = new BufferedWriter(writer)
                ) {
            // write columns
            bufferedWriter.write("Index;Fibonacci");
            bufferedWriter.newLine();

            // generate 60 nakki numbers
            for (int i = 0; i <= 60; i++) {
                bufferedWriter.write(i + ";" + first);
                bufferedWriter.newLine();

                // calculate next nakki number
                long next = first + second;
                first = second;
                second = next;
            }
            System.out.println("Fibonacci sequence written to " + FILENAME);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
