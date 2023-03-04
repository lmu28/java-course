package multithreading.thread_safe;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * нужно использовать, когда нужна потокобезопасность и нужно часто обращаться к элементам листа,
 * но не нужно их изменять, тк при каждом изменении будет создаваться новая копия исходного листа
 *
 *
 */
public class CopyOnWriteArrayListEx {

    public static void main(String[] args) throws InterruptedException {

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Ivan");
        list.add("Masha");
        list.add("Sveta");
        list.add("Alena");
        list.add("Petya");



        Runnable runnable1 = () -> {

            Iterator iterator = list.iterator();
            while(iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println(iterator.next());
            }
        };


        Runnable runnable2 = () ->{
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            list.remove(list.size()-1);
            list.add("Olya");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        // В итераторе не выводится Olya, тк он работает с исходным видом list, и не обращает внимания
        // на то, что в процессе list уже дважды пересоздавался



    }
}
