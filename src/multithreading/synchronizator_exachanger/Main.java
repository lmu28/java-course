package multithreading.synchronizator_exachanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * Exchanger - позволяет обмениваться данными, обеспечивает то, что оба потока получают данные одновременно
 *
 *
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> list1 = new ArrayList<>();
        List<Action> list2 = new ArrayList<>();
        list1.add(Action.KAMEN);
        list1.add(Action.NOJNICI);
        list1.add(Action.KAMEN);
        list2.add(Action.BUMAGA);
        list2.add(Action.NOJNICI);
        list2.add(Action.NOJNICI);
        ResultOfGames resultOfGames = new ResultOfGames();

        Human human1 = new Human("Vanya",list1,exchanger,resultOfGames);
        Human human2 = new Human("Petya",list2,exchanger,resultOfGames);
        human1.setPlayWith(human2.getPlayerName());
        human2.setPlayWith(human1.getPlayerName());
        human1.start();
        human2.start();
        human1.join();
        human2.join();
        System.out.println("----------------------------");

        for (String res: resultOfGames.results){
            System.out.println(res);
        }

    }

}
