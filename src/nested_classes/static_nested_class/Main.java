package nested_classes.static_nested_class;

public class Main {
    public static void main(String[] args) {

        Car car =  new Car("red",4,new Car.Engine(150));

    }
}
