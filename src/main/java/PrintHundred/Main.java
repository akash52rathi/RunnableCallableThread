package PrintHundred;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        /// with executer
        Executor executor = Executors.newFixedThreadPool(10);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i=1;i<=100;i++)
        {
          //  Thread t = new Thread(new PrintHundred(i));

            executor.execute(new PrintHundred(i));
            executorService.submit(new PrintHundred(i));

            //t.start();
        }

    }
}
