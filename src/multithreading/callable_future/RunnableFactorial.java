package multithreading.callable_future;


import java.awt.event.TextEvent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;



public class RunnableFactorial {
    public static int factorialResult;

    public static void main(String[] args) throws InterruptedException {

        ExecutorService pool = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
        pool.execute(factorial);
        pool.shutdown();
        pool.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(factorialResult);
    }


}

class Factorial implements Runnable{
    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {

        if (f <= 0 ){
            System.out.println("Введено неверное число");
            return;
        }
        int res = 1;
        for (int i = 2; i <= f; i ++){
            res*=i;
        }
        RunnableFactorial.factorialResult = res;



    }
}
