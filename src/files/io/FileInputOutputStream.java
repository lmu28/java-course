package files.io;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * используются для работы с бинарными файлами(например, картинка)
 *
 */
public class FileInputOutputStream {
    public static void main(String[] args) {

        try(FileInputStream inputStream = new FileInputStream("resources\\images\\oblako.jpg");
            FileOutputStream outputStream = new FileOutputStream("resources\\images\\copy.jpg");
        ) {

            int character;
            while( (character = inputStream.read()) != -1){
                outputStream.write(character);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
