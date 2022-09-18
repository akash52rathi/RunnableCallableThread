package PrintHundred;

public class PrintHundred implements Runnable {
    private  int numberToprint;
    public  PrintHundred(int x)
    {
        this.numberToprint=x;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(numberToprint + "Thread " + Thread.currentThread().getName());
    }
}
