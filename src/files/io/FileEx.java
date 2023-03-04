package files.io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * класс File позволяет управлять информацией о файлах и директориях
 *
 *
 */
public class FileEx {

    public static void main(String[] args) throws IOException {
        File file = new File("resources\\files\\test1.txt");
        File file2 = new File("resources\\files\\test100.txt");
        File folder = new File("resources\\files");
        File folder2 = new File("resources\\files100");

        System.out.println("file Absolute Path: " + file.getAbsolutePath());
        System.out.println("folder Absolute Path: " + folder.getAbsolutePath());
        System.out.println("-------------------------------------------------------");
        System.out.println("file.isAbsolute " + file.isAbsolute());
        System.out.println("folder.isAbsolute() " + folder.isAbsolute());
        System.out.println("-------------------------------------------------------");

        System.out.println("file.isDirectory() " + file.isDirectory());
        System.out.println("folder.isDirectory() " + folder.isDirectory());
        System.out.println("-------------------------------------------------------");

        System.out.println("file.exists() " + file.exists());
        System.out.println("file2.exists() " + file2.exists());
        System.out.println("folder.exists() " + folder.exists());
        System.out.println("-------------------------------------------------------");

        System.out.println("file2.createNewFile() " + file2.createNewFile());
        System.out.println("file1.createNewFile() " + file.createNewFile());
        System.out.println("folder2.mkdir() " + folder2.mkdir());
        System.out.println("-------------------------------------------------------");

        System.out.println("file.length() " + file.length()); // размер в байтах
        System.out.println("folder.length() " + folder.length()); // для папки нельзя(нужно самостоятельно писать такой функционал)
        System.out.println("-------------------------------------------------------");

        System.out.println("file2.delete() " + file2.delete()); // можно удалить, только если папка пуста
        System.out.println("-------------------------------------------------------");

        File[] files = folder.listFiles();
        System.out.println("folder.listFiles " + Arrays.toString(files));
        System.out.println("-------------------------------------------------------");

        System.out.println("file.isHidden()" + file.isHidden());
        System.out.println("-------------------------------------------------------");

        System.out.println("file.canRead() " + file.canRead());
        System.out.println("-------------------------------------------------------");

        System.out.println("file.canWrite() " + file.canWrite());
        System.out.println("-------------------------------------------------------");

        System.out.println("file.canExecute()" + file.canExecute());
        System.out.println("-------------------------------------------------------");
    }
}
