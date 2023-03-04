package multithreading;


/**
 * Deadlock - когда или более потока залочены (ожидают друг друга и ничего не делают)
 * пример ниже - возможна такая ситуация
 * решение - поменять порядок lock(сделать одинаковым)
 *
 */



public class DeadLock {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {

        Thread thread0 = new Thread(new Thread0());
        Thread thread2 = new Thread(new Thread2());

        thread0.start();
        thread2.start();


    }
}

class Thread0 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread0 Попытка захватить монитор lock1");
        synchronized (DeadLock.lock1){
            System.out.println("Thread0 монитор lock1 захвачен");
            System.out.println("Thread0 Попытка захватить монитор lock2");
            synchronized (DeadLock.lock2){
                System.out.println("Thread0 монитор lock2 захвачен");
            }
        }


    }
}class Thread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread2 Попытка захватить монитор lock2");
        synchronized (DeadLock.lock2){
            System.out.println("Thread2 монитор lock2 захвачен");
            System.out.println("Thread2 Попытка захватить монитор lock1");
            synchronized (DeadLock.lock1){
                System.out.println("Thread2 монитор lock1 захвачен");
            }
        }


    }
}
