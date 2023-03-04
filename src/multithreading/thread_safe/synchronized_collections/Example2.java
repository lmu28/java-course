package multithreading.thread_safe.synchronized_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Example2 {

    public static void main(String[] args) throws InterruptedException {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }

        List<Integer> syncList = Collections.synchronizedList(list);

        Runnable runnable1 = () -> {
            synchronized (syncList) { // на методы ставится lock при synchronization,а на работу итератора нет поэтому нужно вручную синхронизировать
                Iterator<Integer> iterator = syncList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }

            }


        };

        Runnable runnable2 = () -> {
            syncList.remove(10);
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
