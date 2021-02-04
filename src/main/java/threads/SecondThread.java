package threads;

public class SecondThread extends Thread {
    public static void readTheThread(){
        Thread secThread = new Thread();
        System.out.println(secThread.getName());
    }
}
