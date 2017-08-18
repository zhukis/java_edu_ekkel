package threads.collaboration.pipes;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.util.Random;
import java.util.concurrent.*;

class Sender1 implements Runnable {
    private Random rand = new Random(47);
    private BlockingQueue<Character> queue;

    Sender1(BlockingQueue<Character> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            while (true)
                for (char c = 'A'; c <= 'z'; c++) {
                    queue.put(c);
                    TimeUnit.MILLISECONDS.sleep(rand.nextInt(500));
                }
        } catch (InterruptedException e) {
            System.out.println(e + " Sender sleep interrupted");
        }
    }
}

class Receiver1 implements Runnable {
    private BlockingQueue<Character> queue;

    public Receiver1(BlockingQueue<Character> queue) throws IOException {
        this.queue = queue;
    }

    public void run() {
        try {
            while (true) {
                char c = queue.take();
                System.out.println("Got " + c + "; ");
            }
        } catch (InterruptedException e) {
            System.out.println(e + " Receiver read exception");
        }
    }
}

public class BlockingInsteadPipe {
    public static void main(String[] args) throws Exception {
        LinkedBlockingQueue<Character> queue = new LinkedBlockingQueue<>();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new Sender1(queue));
        exec.execute(new Receiver1(queue));
        exec.shutdown();

    }
}
