package files.nio.path_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ex2 {
    public static void main(String[] args) throws IOException {



        Path filePath = Paths.get("resources\\files\\test15.txt");
        Path folderPath = Paths.get("resources\\pathFolder");

       // Files.copy(filePath,folderPath.resolve( filePath.getFileName() ));
        Files.copy(filePath,folderPath.resolve( filePath.getFileName() )
                , StandardCopyOption.REPLACE_EXISTING); // заменить,если существует
       // Files.copy(filePath,folderPath.resolve( Paths.get("test16.txt") ));

        Files.delete(Paths.get("test5.txt"));

        // move работает так же как  copy, только он не копирует, а перемещает
    }
}
