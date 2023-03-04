package multithreading.callable_future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Sum10 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        int diff = 10000000 / 10;
        List<Future<Long>> resultList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int from = i * diff + 1;
            int to = from + diff - 1;
            CallableImpl task = new CallableImpl(from,to);
            resultList.add(pool.submit(task));
        }
        long result = resultList.stream().map(r -> {
            try {
                return r.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }).reduce((r1,r2) -> r1+r2).get();
        pool.shutdown();
        System.out.println("Общий результат: " + result);

    }
}


class CallableImpl implements Callable<Long> {
    int from;
    int to;
    long localSum = 0;

    public CallableImpl(int from, int to) {
        this.from = from;
        this.to = to;
        //this.call();
    }

    @Override
    public Long call() throws Exception {
        for (int i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.println("[" + from + ","+to+"] ---> " + localSum);
        return localSum;
    }
}
