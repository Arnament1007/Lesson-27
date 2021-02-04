package threads;

import java.lang.Runnable;

public class myRunnable implements Runnable {

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread 2");

        }
    }
};
