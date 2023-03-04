package multithreading.thread_safe;


import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * потокобезопасная коллекция при изменении элемента блокируется не весь Map
 * (как было бы в случае Synchronized HashMap), а только bucket, в котором элемент находится
 *
 *
 */

public class ConcurrentHashMapEx {


    public static void main(String[] args) throws InterruptedException {


        ConcurrentHashMap<Integer,String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1,"Ivan");
        concurrentHashMap.put(2,"Oleg");
        concurrentHashMap.put(3,"Misha");
        concurrentHashMap.put(4,"Petya");
        concurrentHashMap.put(5,"Fedor");


        Runnable runnable1 = () -> {

            Iterator iterator = concurrentHashMap.keySet().iterator();
            while(iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int i = (Integer)iterator.next();
                System.out.println(i + " " + concurrentHashMap.get(i));
            }
        };


        Runnable runnable2 = () ->{
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            concurrentHashMap.put(6,"Olya");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        // В итераторе выводится Olya



    }
}
