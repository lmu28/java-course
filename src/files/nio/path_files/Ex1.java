package files.nio.path_files;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

/**
 * Path - содержит путь к файлу
 * Files - содержит множество методов для работы с файлами
 *
 */
public class Ex1 {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("resources\\files\\pathEx.txt");
        Path pathToRes = Paths.get("C:\\Java\\Worksapces\\Java-Black\\java-course\\resources\\pathFolder");

        System.out.println("filePath.getFileName() " + filePath.getFileName());
        System.out.println("pathToRes.getFileName() " + pathToRes.getFileName());
        System.out.println("--------------------------------------------------------");

        System.out.println("getParent " + filePath.getParent());
        System.out.println("getParent " + pathToRes.getParent());
        System.out.println("--------------------------------------------------------");

        System.out.println("getRoot " + filePath.getRoot());
        System.out.println("getRoot " + pathToRes.getRoot());
        System.out.println("--------------------------------------------------------");

        System.out.println("absolutePath " + filePath.toAbsolutePath());
        System.out.println("--------------------------------------------------------");


        System.out.println("resolve " + pathToRes.resolve(filePath)); // соединяет пути
        System.out.println("--------------------------------------------------------");

        Path anotherPath = Paths.get("C:\\Java\\Worksapces\\Java-Black\\java-course\\resources\\pathFolder\\N\\Z\\A");
        System.out.println("relative " + pathToRes.relativize(anotherPath)); // находит относительный путь anotherPath
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");
        if (!Files.exists(filePath)){
            Files.createFile(filePath);
        }

        System.out.println(Files.isReadable(filePath));
        System.out.println(Files.isWritable(filePath));
        System.out.println(Files.isExecutable(filePath));
        System.out.println("--------------------------------------------------------");

        Map<String,Object> map = Files.readAttributes(filePath,"*");

        for(Map.Entry<String,Object> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("--------------------------------------------------------");


    }
}
