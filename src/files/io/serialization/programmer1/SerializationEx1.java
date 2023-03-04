package files.io.serialization.programmer1;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Сериализация - процесс преобразования объекта в последовательность байт
 * Десериализация - обратный процесс
 *
 * ObjectOutputStream out = new FileOutputStream("employees1.bin") - сериализация
 *
 *
 */
public class SerializationEx1 {

    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Maria");
        employees.add("Katya");
        employees.add("Olya");
        employees.add("Sveta");

        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("resources\\files\\employees1.bin"))
        ){
            outputStream.writeObject(employees);
            System.out.println("Done");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
