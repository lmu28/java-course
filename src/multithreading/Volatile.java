package multithreading;


/**
 *  Concurrency (согласованность) - Выполнение нескольких задач сразу(неодновременно) (петь и кушать)
 *  Parallelism - Выполнение нескольких задач одновременно (готовить и говорить по телефону)
 *  Synchronous - последовательно друг за другом
 *  Asynchronous - можно переключаться с задачи на задачу (используя Concurrency, Parallelism)
 *  при использовании Asynchronous программирования нельзя предсказать порядок выполнения потоков
 *
 *  поток копирует значение переменной в кэш CPU для быстрого доступа к ним, в нашем примере это переменная b
 *  volatile переменные хранятся не кэше потока, а в потоке main memory (основная память )
 *  volatile можно использовать только когда ОДИН поток может изменять
 *  volatile объект, а остальные только читать (a++)
 *
 *
 */


public class Volatile implements Runnable {

    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b){
            counter++;
        }
        System.out.println("Loop finished, counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {

        Volatile vol = new Volatile();
        Thread thread = new Thread(vol);
        thread.start();
        System.out.println("Поток main уснул");
        Thread.sleep(3000);//поток Main уснул на 3 секунды
        System.out.println("Поток main проснулся");
        vol.b = false;


    }
}
