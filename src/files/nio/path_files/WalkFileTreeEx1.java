package files.nio.path_files;


import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class WalkFileTreeEx1 {

    public static void main(String[] args) throws IOException {

        Files.walkFileTree(Paths.get("C:\\Java\\Worksapces\\Java-Black\\java-course\\resources\\pathFolder")
                ,new FileVisitor<Path>() {
                    /**
                     *FileVisitResult - enum
                     * CONTINUE - продолжаем обход по файлам
                     * TERMINATE - немедленно прекратить обход по файлам
                     * SKIP_SUBTREE - пропустить данную директорию/файл
                     * SKIP_SIBLINGS - в данной директории обход нужно завершить
                     *
                     */
                    @Override
                    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                        System.out.println("Enter " + dir);
                        return FileVisitResult.CONTINUE;
                    }

                    @Override
                    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                        System.out.println("File name " + file.getFileName());
                        return FileVisitResult.CONTINUE;
                    }

                    @Override
                    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                        System.out.println("Error while visiting" + file.getFileName());
                        return FileVisitResult.TERMINATE;
                    }

                    @Override
                    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                        System.out.println("Exit from dir " + dir);
                        return FileVisitResult.CONTINUE;
                    }
                });

    }

}
