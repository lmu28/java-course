package multithreading.callable_future;

import lambda_expression.InterfaceConsumer.InterfaceConsumer;

import java.sql.SQLOutput;
import java.util.concurrent.*;

/**
 * Callable - интерфейс как и Runnable, только он может возвращать значения и выбрасывать исключения
 * его можно и нужно использовать в при работе с ExecutorService
 * нужно вместо execute() использовать submit() - добавляет Task в pool и возвращает значение, результат
 * хранится в объекте типа Future
 * Future.get() - получить результат
 * в Future хранится как бы будущий результат, то  есть после вызова get() результат приходит не
 * моментально, а по мере готовности
 *
 */


public class CallableFactorial {

    //Thread thread1 = new Thread(new Factorial2(2));

    static int factorialResult;

    public static void main(String[] args)  {




        ExecutorService pool = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(6);
        System.out.println("задача отправлена");
        Future<Integer> future = pool.submit(factorial2);
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        try {
            System.out.println("попытка получить результат задачи задачу");
            factorialResult = future.get();
            System.out.println("результат получен");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getCause());
        }finally {
            pool.shutdown();
        }

        System.out.println(factorialResult);


    }
}

class Factorial2 implements Callable<Integer>{
    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) throw new Exception("Вы ввели неверное число");

        int res = 1;
        for (int i = 2; i <= f; i ++){
            res*=i;
        }

        Thread.sleep(2000);

        return res;
    }
}
