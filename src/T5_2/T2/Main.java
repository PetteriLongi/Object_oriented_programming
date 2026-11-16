package T5_2.T2;

public class Main {
    public static void main(String[] args) {
        int numberOfThreads = 10;
        int elementsPerThread = 1000;

        ThreadSafeList list = new ThreadSafeList();
        CollectionTester[] threads = new CollectionTester[numberOfThreads];

        // Create and start threads that adds elements
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new CollectionTester(list, i + 1, elementsPerThread, false);
            threads[i].start();
        }

        // Wait for all threads to finish
        try {
            for (CollectionTester thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            System.out.println("Error");
        }

        System.out.println("Size after adding: " + list.getSize());

        // Create and start threads that removes elements
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new CollectionTester(list, i + 1, elementsPerThread, true);
            threads[i].start();
        }

        // Wait for all threads to finish
        try {
            for (CollectionTester thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            System.out.println("Error");
        }

        System.out.println("Size after removing: " + list.getSize());
    }
}
