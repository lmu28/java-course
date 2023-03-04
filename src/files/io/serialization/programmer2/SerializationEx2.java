package files.io.serialization.programmer2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx2 {

    public static void main(String[] args) {
        try(ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("resources\\files\\employees2.bin")
        )){
            Object o = inputStream.readObject();
            System.out.println(o);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
