package HelloWorldRunnable;

public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new HelloworldprinterRunnable());
        t1.start();
    }
}
