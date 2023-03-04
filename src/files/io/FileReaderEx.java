package files.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("D:\\Desktop\\FileWriter.txt");
            int character; //read возвр int(тк в конце файла будет возвр -1(жля проверки конца файла))
            while((character = fileReader.read()) != -1){
                System.out.print((char)character);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
