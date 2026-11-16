package T5_2.T2;

import java.util.ArrayList;

public class ThreadSafeList {
    private ArrayList<String> elements = new ArrayList<>();

    public synchronized void addElement(String element) {
        elements.add(element);
    }
    public synchronized int getSize() {
        return elements.size();
    }
    public synchronized boolean removeElement(String element) {
        return elements.remove(element);
    }
}
