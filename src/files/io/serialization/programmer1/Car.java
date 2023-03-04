package files.io.serialization.programmer1;

import java.io.Serializable;
//Car тоже должен быть Serializable
public class Car implements Serializable {
    String color;

    public Car(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }
}
