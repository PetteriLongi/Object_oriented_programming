package T5_2.T1;

public class Theater {
    private int availableSeats;
    public Theater(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public synchronized void reserveSeats(int customerId, int tickets) {
        if (tickets <= availableSeats) {
            availableSeats -= tickets;
            System.out.println("Customer " + customerId + " reserved " +
                    tickets + " tickets.");
        } else {
            System.out.println("Customer " + customerId +
                    " failed to reserve " + tickets + " tickets.");
        }
    }
}
