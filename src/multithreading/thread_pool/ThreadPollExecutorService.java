package multithreading.thread_pool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Thread poll - пул(множество) поток, каждый тз которых выполняет способен выполнять любую задачу
 * (будет выполнять код в методе run() переданной задачи)
 *
 * удобно создавать, используя factory - ExecutorService pool = Executors.newFixedThreadPool(int num);
 * execute() - передает задачу
 * shutdown() - pool понимает, что больше задач не будет, и, выполнив оставшиеся, заканчивает работу
 *
 * awaitTermination(time, timeUnit) - Поток Main останавливается и ждет min(time,timeF), timeF - время,
 * которое пройдетБ пока пул не закончит выполнять задачи
 *
 * ExecutorService pool = Executors.newCachedThreadPool() - будет создавать потоки по надобности
 *
 *
 */
public class ThreadPollExecutorService {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(5);

        for(int i = 0; i < 10; i++){
            pool.execute(new RunnableImpl10()); // выдаем задания
        }
        pool.shutdown();// заканчиваем работу пула, иначе программа не закончится
        try {
            pool.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main ends");

    }
}

class RunnableImpl10 implements Runnable{
    @Override
    public void run() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
    }
}
