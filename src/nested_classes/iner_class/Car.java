package nested_classes.iner_class;


public class Car {
    private String color;
    private int doorsCount;

    private Engine engine;

    private static int a = 10;

    public Car(String color, int doorsCount, int horsePower) {
        this.color = color;
        this.doorsCount = doorsCount;
        this.engine = this.new Engine(horsePower);
    }

    public class Engine{ // inner class
        private int horsePower;
        private static int q = 100;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        public void test(){
            int b = a;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorsCount=" + doorsCount +
                ", engine=" + engine +
                '}';
    }
}