package multithreading.wait_notify;

public class Market {

    int breadCount = 0;

    private final Object lock = new Object();// заком для синхронизации на нем

//     ***** синхронизация на объекте this *****
//     public synchronized void takeBread(){
//        while(breadCount < 1){
//            try {
//                wait();
//
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        breadCount--;
//        System.out.println("Consumer took 1 bread");
//        notify();//будим поток производителя
//    }
//
//     public synchronized  void putBread(){
//        while(breadCount >= 5){
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        breadCount++;
//        System.out.println("Producer produced 1 bread with number ");
//        notify();//будим поток потребителя
    //     ***** синхронизация на объекте lock *****
     public void takeBread() {
         synchronized (lock) {
             while (breadCount < 1) {
                 try {
                     lock.wait();

                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
             breadCount--;
             System.out.println("Consumer took 1 bread");
             lock.notify();//будим поток производителя
         }
     }

     public void putBread() {
         synchronized (lock) {
             while (breadCount >= 5) {
                 try {
                     lock.wait();
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
             breadCount++;
             System.out.println("Producer produced 1 bread with number ");
             lock.notify();//будим поток потребителя
         }
     }
}
