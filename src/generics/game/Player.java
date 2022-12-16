package generics.game;

public class Player {
    private String name;
    private int age;

    public Player(String name, int age){
        this.age = age;
        this.name = name;
    }
    public String getName(){
        return(this.name);
    }
    public int getAge() {
        return age;
    }

}
