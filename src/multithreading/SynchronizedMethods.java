package multithreading;

/**
 * Data Race(гонка данных) - когда два и более потока обращаются к одной и той же переменной и как
 * минимум один из них её изменяет
 *
 * можно поставить замок(lock) на метод(public static synchronized void name(){...}), тогда
 * тогда потоки не смогут одновременно обращаться к этому методу(будут ждать)
 *
 *
 */

public class SynchronizedMethods {
    public static void main(String[] args) throws InterruptedException {
        MyRunnableImpl1 runnable = new MyRunnableImpl1();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();




    }
}

class Counter{
    static int count = 0;

    synchronized public static  void increment(){
        Counter.count++;
        System.out.print(Counter.count + " ");
    }
}

class MyRunnableImpl1 implements Runnable{


    @Override
    public void run() {
        for(int i = 0; i < 3; i++){
            Counter.increment();
        }

    }
}
