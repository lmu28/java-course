package multithreading.thread_pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ScheduledExecutorService - испоользуется, когда нужно использовать расписание на запуск потоков
 *
 *
 *
 */
public class ThreadPollScheduledExecutorService {

    public static void main(String[] args) {

        ScheduledExecutorService pool = Executors.newScheduledThreadPool(1);
        for (int i = 0; i < 10; i++){
            //pool.execute(new RunnableImpl20()); // работает также как и обычный ExecutorService
            pool.schedule(new RunnableImpl20(),3, TimeUnit.SECONDS); // Выполни задание через 3 секунды

           // pool.scheduleAtFixedRate(new RunnableImpl20(),3,1,TimeUnit.SECONDS); // Выполнит задачу через 3 секунды
            // и далее будет её выполнять с периодичностью 1 сек

            pool.scheduleWithFixedDelay(new RunnableImpl20(),3,1,TimeUnit.SECONDS);
            // Начнет выполнять задачу1 через 3 секунды, потом через 1 секунду начнет задачу2,...



        }
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pool.shutdown();


    }


}

class RunnableImpl20 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starts");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(Thread.currentThread().getName() + " ends");
    }
}


