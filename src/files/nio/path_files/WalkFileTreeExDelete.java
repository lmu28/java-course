package files.nio.path_files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class WalkFileTreeExDelete {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\Desktop\\Copy_dir");

        Files.walkFileTree(path,new DeleteFileVisitor());
    }
}
class DeleteFileVisitor extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }
}
