package multithreading.thread_safe.array_blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;


/**
 * ArrayBlockingQueue - потокобезопасная очередь
 * методы put и take автоматически вызывают wait/notify
 *
 */

public class Ex1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);// 4 - размер



        Runnable producer = () -> {

            for (int i = 0; i < 15; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    queue.put(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("producer put " + i+ " " +queue);

            }


        };

        Runnable consumer = () -> {

            for (int i = 0; i < 15;i++){

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
                    int v = queue.take();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("consumer take " + i + " " +queue);
            }
        };

        new Thread(producer).start();
        new Thread(consumer).start();

    }

}
