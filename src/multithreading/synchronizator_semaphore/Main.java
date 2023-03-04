package multithreading.synchronizator_semaphore;


import java.util.concurrent.Semaphore;

/**
 * Semaphore - ограничивает доступ к какому-то ресурсу, в парметрах передаем количество потоков, которые
 * смогут одновременно использовать этот ресурс
 *
 *
 *
 */
public class Main {

    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        Human human1 =new Human("Ivan",callBox);
        Human human2 =new Human("Misha",callBox);
        Human human3 =new Human("Maxim",callBox);
        Human human4 =new Human("Olya",callBox);
        Human human5 =new Human("Katya",callBox);
    }
}
