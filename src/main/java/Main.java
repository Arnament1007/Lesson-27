
import threads.myCallable;
import threads.myRunnable;
import threads.myThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        myThread myThread = new myThread();
        myThread.start();

        myRunnable myRunnable = new myRunnable();
        Thread threadRunnable = new Thread(myRunnable);
        threadRunnable.start();

//        myCallable myCallable = new myCallable();
//        FutureTask<Object> task = new FutureTask<Object>(myCallable);
//        Thread thread = new Thread(task);
//        thread.start();
//        Object object = task.get();
    }
}
