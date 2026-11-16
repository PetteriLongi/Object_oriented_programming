package T5_2.T1;

public class Customer extends Thread{
    private Theater theater;
    private int customerId;
    private int tickets;

    public Customer(Theater theater, int customerId, int tickets) {
        this.theater = theater;
        this.customerId = customerId;
        this.tickets = tickets;
    }

    @Override
    public void run() {
        theater.reserveSeats(customerId, tickets);
    }
}
