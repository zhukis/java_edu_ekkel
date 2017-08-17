package threads.resourceaccess.sync;

import threads.resourceaccess.withoutsync.EvenChecker;
import threads.resourceaccess.withoutsync.IntGenerator;

public class SynchronizedEvenGenerator extends IntGenerator {
    private int currentValue = 0;

    public synchronized int next() {
        ++currentValue;
        Thread.yield(); // casue failure faster
        ++currentValue;
        return currentValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new SynchronizedEvenGenerator());
    }
}
