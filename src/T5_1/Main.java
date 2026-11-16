package T5_1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int start = 1;
        int end = 20;
        int arraySize = 100000;
        int numbers[] = new int[arraySize];

        Random random = new Random();

        // Fill the array with new random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        int numberOfThreads = Runtime.getRuntime().availableProcessors();
        int portionSize = arraySize / numberOfThreads;
        System.out.println("Number of threads: " + numberOfThreads);

        SumCalculator[] threads = new SumCalculator[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            int startIndex = i * portionSize;
            int endIndex = (i == numberOfThreads - 1) ? arraySize : (i + 1) * portionSize;
            threads[i] = new SumCalculator(numbers, startIndex, endIndex);
            threads[i].start();
        }

        NumberPrinter oddPrinter = new NumberPrinter(start, end, true);
        NumberPrinter evenPrinter = new NumberPrinter(start, end, false);

        // Start the threads, The order in which they print varies due to scheduling
        oddPrinter.start();
        evenPrinter.start();

        // This is for the NumberPrinter.
        // Wait for the threads to finish
        try {
            oddPrinter.join();
            evenPrinter.join();
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
        System.out.println("Printing complete.");

        // This is for the SumCalculator.
        // Wait for the threads to finish and calculate the total sum
        long totalSum = 0;
        try {
            for (SumCalculator thread : threads) {
                thread.join();
                totalSum += thread.getSum();
            }
        } catch (InterruptedException e) {
            System.out.println("Error");
        }

        System.out.println("Total sum of the array: " + totalSum);
    }
}

