package T5_1;

public class SumCalculator extends Thread {
    private int numbers[];
    private int startIndex;
    private int endIndex;
    private long sum = 0;

    public SumCalculator(int numbers[], int startIndex, int endIndex) {
        this.numbers = numbers;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        long localSum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            localSum += numbers[i];
        }
        sum = localSum;
    }

    public long getSum() {
        return sum;
    }
}
