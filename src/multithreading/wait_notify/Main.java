package multithreading.wait_notify;


/**
 * wait - освобождает монитор; переводит поток в состояние ожидания
 * wait(millis) - millis - максимум сколько он будет ждать
 * notify - не освобождает монитор; будит поток, у которого ранее был вызван метод Wait
 * notifyAll - не освобождает монитор; будит все потоки, у которых ранее был вызван метод Wait
 *
 * В данном примере два synchronized метода - putBread, takeBread Синхронизированы по объекту market(по его монитору)
 * то есть одновременно эти два метода работать не будут
 *
 *
 *
 *
 *
 */







public class Main {


    public static void main(String[] args) {
        Market market = new Market();
        Thread producerThread = new Thread(new Producer(market));
        Thread consumerThread = new Thread(new Consumer(market));

        consumerThread.start();
        producerThread.start();



        System.out.println("---------------");

    }


}
