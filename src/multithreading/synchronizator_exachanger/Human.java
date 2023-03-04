package multithreading.synchronizator_exachanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Human extends Thread {

    private String name;
    private String playWith;
    private List<Action> actions;
    private Exchanger<Action> exchanger;

    private ResultOfGames resultOfGames;

    public String getPlayWith() {
        return playWith;
    }

    public void setPlayWith(String playWith) {
        this.playWith = playWith;
    }

    public ResultOfGames getResultOfGames() {
        return resultOfGames;
    }

    public String getPlayerName() {
        return name;
    }

    public void setPlayerName(String name) {
        this.name = name;
    }

    public Human(String name, List<Action> actions, Exchanger<Action> exchanger, ResultOfGames result) {
        this.name = name;
        this.actions = actions;
        this.exchanger = exchanger;
        this.resultOfGames = result;
    }

    @Override
    public void run() {
        Action reply;
        try {
            for (Action action : actions) {
                resultOfGames.isExecuted.set(false);
                reply = exchanger.exchange(action);

                if (resultOfGames.isExecuted.compareAndSet(false,true)) {
                    resultOfGames.whoWins(name,action,getPlayWith(),reply);

                }




            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


}
