package threads;

import java.lang.Thread;

public class myThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread 1");
        }
    }

}
