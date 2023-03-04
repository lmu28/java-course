package multithreading.thread_safe.synchronized_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  Collections.synchronized*(new *);
 *  создание синх коллекции (берет обычную коллекцию и расставляет локи на всех методах)
 *  не эффективное решение
 *
 *
 */

public class Example1 {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> source = new ArrayList<>();
        //ArrayList<Integer> target = new ArrayList<>();
        List<Integer> target = Collections.synchronizedList(new ArrayList<>());
        for (int i = 0; i < 5; i++){
            source.add(i);
        }

        Runnable runnable = () -> {target.addAll(source);};
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(target);
    }
}
