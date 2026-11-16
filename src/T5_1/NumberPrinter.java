package T5_1;

public class NumberPrinter extends Thread{
    private int start;
    private int end;
    private boolean odd;

    public NumberPrinter(int start, int end, boolean odd) {
        this.start = start;
        this.end = end;
        this.odd = odd;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (odd && i % 2 != 0) {
                System.out.println("odd thread " + i);
            } else if (!odd && i % 2 == 0) {
                System.out.println("even thread " + i);
            }
        }
    }
    }