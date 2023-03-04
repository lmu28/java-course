package multithreading;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *Lock - интерфейс, имплементируемый классом ReentrantLock
 * делает все тоже самое, что и sync блок
 *
 * методы
 * lock() - закрыть , unlock() - открыть(обязательно нужно вызывать)
 * if (lock.tryLock()){...} - пытается поставить lock
 *
 */
public class LockReentrantlock {

    public static void main(String[] args) {

        Call call =  new Call();

        Thread thread1 = new Thread(() ->call.mobileCall());
        Thread thread2 = new Thread(() ->call.skypeCall());
        Thread thread3 = new Thread(() ->call.viberCall());

        thread1.start();
        thread2.start();
        thread3.start();






    }
}

class Call{

    private Lock lock = new ReentrantLock(); // для достижения синхронизации

    void mobileCall(){
        lock.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock(); // обязательно нужно делать unlock
        }
    }

    void skypeCall(){
        lock.lock();
        try {
            System.out.println("Skype call starts");
            Thread.sleep(5000);
            System.out.println("Skype call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }
    void viberCall(){
        lock.lock();
        try {
            System.out.println("Viber call starts");
            Thread.sleep(7000);
            System.out.println("Viber call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }
}


//другой пример(метод tryLock())
class Bankomat{
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Victor",lock);
        new Employee("Mariya",lock);
        new Employee("Ivan",lock);
        new Employee("Petr",lock);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        new Employee("Max",lock);
        new Employee("Kristina",lock);
    }

}
class Employee extends Thread{
    private String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        //System.out.println(name + " ждет");
        //lock.lock();
        if(lock.tryLock()) { // проверка, можно ли поставить замок в данный момент(занять банкомат)
            try {
                System.out.println(name + " Использует банкомат");
                Thread.sleep(2000);
                System.out.println(name + " завершил свои дела в банкомате");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }else {
            System.out.println(name + " уходит, банкомат занят");

        }

    }
}
