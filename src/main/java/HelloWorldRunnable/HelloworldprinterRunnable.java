package HelloWorldRunnable;

public class HelloworldprinterRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello world "+ Thread.currentThread().getName());
    }
}
