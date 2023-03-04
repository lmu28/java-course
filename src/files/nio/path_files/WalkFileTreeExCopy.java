package files.nio.path_files;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class WalkFileTreeExCopy {

    public static void main(String[] args) {
        Path source = Paths.get("resources\\pathFolder");
        Path destination = Paths.get("D:\\Desktop\\Copy_dir");

        CopyFileVisitor copyFileVisitor = new CopyFileVisitor(source,destination);

        try {
            Files.walkFileTree(source,copyFileVisitor);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

class CopyFileVisitor extends SimpleFileVisitor<Path>{

    Path source;
    Path destination;

    public CopyFileVisitor(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

        Path AbsolutePathToCopy = source.relativize(dir);
        Files.copy(dir,destination.resolve(AbsolutePathToCopy));
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path AbsolutePathToCopy = source.relativize(file);
        Files.copy(file,destination.resolve(AbsolutePathToCopy));

        return FileVisitResult.CONTINUE;
    }
}


