package nested_classes.static_nested_class;

public class Car {
    private String color;
    private int doorsCount;
    private Engine engine;

    private static int a = 10;

    public Car(String color, int doorsCount, Engine engine) {
        this.color = color;
        this.doorsCount = doorsCount;
        this.engine = engine;
    }

    public static class Engine{
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        public void test(){
            int b = a;
        }

    }
}
