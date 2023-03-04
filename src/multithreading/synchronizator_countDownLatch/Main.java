package multithreading.synchronizator_countDownLatch;


import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch - синхронизатор позволяющий любому количеству потоков ждать,пока не завершится опреде
 * ленное количество операция, в конструторе - кол-во операция
 *
 *
 */
public class Main {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff is on place");
        countDownLatch.countDown();
        System.out.println("now countDownLatch: " + countDownLatch.getCount());
    }

    private static void marketIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Market is ready");
        countDownLatch.countDown();
        System.out.println("now countDownLatch: " + countDownLatch.getCount());
    }

    private static void marketIsOpen() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Market is open");
        countDownLatch.countDown();
        System.out.println("now countDownLatch: " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {

        Human human1 = new Human("Oleg",countDownLatch);
        Human human2 = new Human("Elena",countDownLatch);
        Human human3 = new Human("Vasiliy",countDownLatch);
        Human human4 = new Human("Arkadiy",countDownLatch);
        Human human5 = new Human("Petr",countDownLatch);

        marketStaffIsOnPlace();
        marketIsReady();
        marketIsOpen();


    }
}
