package multithreading.synchronizator_countDownLatch;

import java.util.concurrent.CountDownLatch;

public class Human extends Thread {
    private String name;
    private CountDownLatch countDownLatch;

    public Human(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " waits");
            countDownLatch.await();
            System.out.println(name + " starts shopping");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
