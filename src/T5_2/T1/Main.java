package T5_2.T1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int totalSeats = 20;
        int numberOfCustomers = 30;

        // Create the theater
        Theater theater = new Theater(totalSeats);
        Customer[] customers = new Customer[numberOfCustomers];
        Random random = new Random();

        // Create customers with random ticket requests
        for (int i = 0; i < numberOfCustomers; i++) {
            int tickets = random.nextInt(3) + 1; // Request 1 to 3 tickets
            customers[i] = new Customer(theater, i + 1, tickets);
        }

        // Start all customer threads
        for (Customer customer : customers) {
            customer.start();
        }

        // Wait for all customer threads to finish
        try {
            for (Customer customer : customers) {
                customer.join();
            }
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
        System.out.println("All customers have finished booking.");
    }
}
