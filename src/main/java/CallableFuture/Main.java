package CallableFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<Integer> future =executorService.submit(new SumCallable(10));
        System.out.println("before");
        System.out.println(future.get());
        System.out.println("after");


        System.out.println("Calculating sum from 1 to 100 ");

        List<Future<Integer>>list = new ArrayList<>();
        for(int i=1;i<=100;i++)
        {
            Future<Integer> newfuture =executorService.submit(new SumCallable(i));
            list.add(newfuture);
        }

        for(Future f:list)
            System.out.println(f.get());

    }
}
