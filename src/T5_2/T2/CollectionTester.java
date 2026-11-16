package T5_2.T2;

public class CollectionTester extends Thread{
    private ThreadSafeList list;
    private int threadId;
    private int numberOfElements;
    private boolean removeElements;

    public CollectionTester(ThreadSafeList list, int threadId,
                            int numberOfElements, boolean removeElements) {
        this.list = list;
        this.threadId = threadId;
        this.numberOfElements = numberOfElements;
        this.removeElements = removeElements;
    }

    @Override
    public void run() {
        for (int i = 0; i < numberOfElements; i++) {
            String element = "Thread " + threadId + " - Element " + i;

            if (removeElements) {
                list.removeElement(element);
            } else {
                list.addElement(element);
            }
            list.getSize();
        }
    }
}
