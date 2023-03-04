package files.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * fileWriter = new FileWriter(path,append); append(true,false) - Если ставить true, то fileWriter
 * не будет перезаписывать, а просто будет добавлять в конец
 *
 */

public class FileWriterEx {

    public static void main(String[] args) {
        String comp = "Когда, стройна и светлоока,\n" +
                "Передо мной стоит она…\n" +
                "Я мыслю: «В день Ильи-пророка\n" +
                "Она была разведена!»";

        FileWriter fileWriter = null;
        try {
            //fileWriter = new FileWriter("D:\\Desktop\\FileWriter.txt");
            fileWriter = new FileWriter("test.txt",true); // файл создается в корне проекта
            for(int i = 0; i < comp.length();i++){
                //fileWriter.write(comp.charAt(i));
            }
            fileWriter.write(comp); // то же самое что и посимвольная запись
            fileWriter.write("\nprivet");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
