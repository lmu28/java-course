package multithreading.synchronizator_exachanger;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

public class ResultOfGames {


    public AtomicBoolean isExecuted = new AtomicBoolean(false);

    ArrayList<String> results;

    public ResultOfGames() {
        this.results = new ArrayList<>();
    }

    synchronized public void whoWins(String name1, Action action1, String name2,Action action2){

        if(action1.equals(Action.NOJNICI) && action2.equals(Action.NOJNICI)) results.add("draw");
        if(action1.equals(Action.NOJNICI) && action2.equals(Action.KAMEN)) results.add(name2);
        if(action1.equals(Action.NOJNICI) && action2.equals(Action.BUMAGA))results.add(name1);
        if(action1.equals(Action.KAMEN) && action2.equals(Action.NOJNICI)) results.add(name1);
        if(action1.equals(Action.KAMEN) && action2.equals(Action.KAMEN)) results.add("draw");
        if(action1.equals(Action.KAMEN) && action2.equals(Action.BUMAGA))results.add(name2);
        if(action1.equals(Action.BUMAGA) && action2.equals(Action.NOJNICI))results.add(name2);
        if(action1.equals(Action.BUMAGA) && action2.equals(Action.KAMEN)) results.add(name1);
        if(action1.equals(Action.BUMAGA) && action2.equals(Action.BUMAGA)) results.add("draw");

    }

}
