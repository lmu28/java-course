package multithreading;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * можно вызвать метод thread.interrupt - попытка прервать поток thread
 * теперь в потоке thread метод isInterrupted() -> true
 */

public class InterruptionThreads {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterruptedThread.generateNumbers();
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

        thread.join();
        System.out.println("Main ends");
    }

}

class InterruptedThread extends Thread {

    public static double[] numbers;

    public static void generateNumbers() {
        numbers = new double[100000];
        for (int i = 0; i < 100000; i++) {
            numbers[i] = i;
        }
    }

    @Override
    public void run() {
        System.out.println(Arrays.stream(InterruptedThread.numbers).map(e -> Math.sqrt(e))
                .reduce((e1, e2) -> e1 + e2).getAsDouble());

       while(true) {
           if (isInterrupted()) { //проверка, пытаются ли прервать данный поток
               System.out.println("Поток " + this.getName() + " прерван");
               return;
           }
       }

    }
}
