package CallableFuture;

import java.util.concurrent.Callable;

public class SumCallable implements Callable<Integer> {

    private  int input;

    public SumCallable(int input)
    {
        this.input=input;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        int sum=0;
        for(int i=1;i<=input;i++)
            sum+=i;

        System.out.println( "sum " + input + " " + sum );
        return sum;
    }
}
