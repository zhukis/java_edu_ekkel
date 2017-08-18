package threads.resourceaccess.interrupt.basic;

import java.io.*;
import java.net.*;
import java.util.concurrent.*;

public class CloseResource {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool();
        ServerSocket server = new ServerSocket(8080);
        InputStream socketInput =
                new Socket("localhost", 8080).getInputStream();

        exec.execute(new IOBlocked(socketInput));
        exec.execute(new IOBlocked(System.in));

        TimeUnit.MILLISECONDS.sleep(100);

        System.out.println("Shutting down all threads");
        exec.shutdownNow();

        TimeUnit.SECONDS.sleep(1);
        System.out.println("Closing " + socketInput.getClass().getName());

        socketInput.close(); // Releases blocked thread

        TimeUnit.SECONDS.sleep(1);

        System.out.println("Closing " + System.in.getClass().getName());
        System.in.close();
    }
}
