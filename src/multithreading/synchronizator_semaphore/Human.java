package multithreading.synchronizator_semaphore;

import java.util.concurrent.Semaphore;

public class Human extends Thread{
    String name;
    Semaphore callBox;

    public Human(String name, Semaphore semaphore) {
        this.name = name;
        this.callBox = semaphore;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ждет...");
            callBox.acquire();
            System.out.println(name + " использует телефон");
            sleep(2000);
            System.out.println(name + " завершил звонок");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            callBox.release(); //освобождаем одно место в Semaphore
        }


    }
}
