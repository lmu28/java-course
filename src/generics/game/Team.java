package generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Player> {
    private String name;
    private List<T> players = new ArrayList<>();

    public Team(String name){
        this.name = name;
    }
    public void addPlayer(T player){
        players.add(player);
        System.out.println("player" + " "+player.getName() + " was added to team " +this.name);
    }

    public void playWith(Team<T> team){
        Random random = new Random();
        int r = random.nextInt(2); // берем два инта 0,1
        if (r == 0){
            System.out.println("Win "+this.name);
        }else {
            System.out.println("Win "+team.name);
        }
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", players=" + players +
                '}';
    }
}
