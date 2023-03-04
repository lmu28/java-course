package files.io.serialization.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialiaztionEx2 {
    public static void main(String[] args) {
        //Employee employee = new Employee("Maria","Sales",28,1000,new Car("red"));
        Employee employee = new Employee("Maria","Ivanova","Sales",1000,new Car("red"));

        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("resources\\files\\employees2.bin")
        )
        ) {
            outputStream.writeObject(employee);
            System.out.println("Done");


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
