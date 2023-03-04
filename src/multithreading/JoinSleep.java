package multithreading;

public class JoinSleep {
    /**
     * sleep(millis) - поток усыпает на millis
     * thread.join() - поток main останавливает свою работу и ждет пока thread закончит работу
     * состояния потока:
     * -NEW - поток только создан и еще не начал работу
     * -RUNNABLE - поток работает
     * -TERMINATED - поток завершил работу
     *
     *
     *
     *
     */
    public static void main(String[] args) {

        Thread thread = new Thread(()->{
           for (int i = 0; i < 10; i++){
               System.out.println(i);

               try {
                   Thread.sleep(1000);
               }catch (Exception e ){

               }

           }
        });
        System.out.println("Состояние потока: " + thread.getState());
        thread.start();
        System.out.println("Состояние потока: " + thread.getState());
        try {
            thread.join();

        }catch (Exception e){

        }
        System.out.println("Состояние потока: " + thread.getState());

    }
}
