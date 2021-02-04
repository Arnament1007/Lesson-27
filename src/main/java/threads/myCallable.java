package threads;

import java.util.concurrent.Callable;

public class myCallable implements Callable<String> {
    public String call() throws Exception {
        for (int i = 0; i < 1000; i++) {
            Thread.sleep(50);
            System.out.println("Thread 3");
        }
        return "FINISHED";
    }
}
