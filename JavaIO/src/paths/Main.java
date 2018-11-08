package paths;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {
    public static void main(String[] args) {
        try {
            // Path sourceFile = FileSystems.getDefault().getPath("examples", "file1.txt");
            // Path copyFile = FileSystems.getDefault().getPath("examples", "file1_copy.txt");
            // Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

            // sourceFile = FileSystems.getDefault().getPath("examples", "dir1");
            // copyFile = FileSystems.getDefault().getPath("examples", "dir4");
            // Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

            // Path fileToMove = FileSystems.getDefault().getPath("examples", "file1_copy.txt");
            // Path destination = FileSystems.getDefault().getPath("examples", "dir1" ,"file1_copy.txt");
            // Files.move(fileToMove, destination);

            // Path fileToMove = FileSystems.getDefault().getPath("examples", "file2.txt");
            // Path destination = FileSystems.getDefault().getPath("examples","file3.txt");
            // Files.move(fileToMove, destination);

            // Path fileToDelete = FileSystems.getDefault().getPath("examples", "dir1", "file1_copy.txt");
            // Files.deleteIfExists(fileToDelete);

            // Path fileToCreate = FileSystems.getDefault().getPath("examples", "file4.txt");
            // Files.createFile(fileToCreate);
            // Path dirToCreate = FileSystems.getDefault().getPath("examples", "dir5");
            // Files.createDirectory(dirToCreate);

            // Path dirToCreate = FileSystems.getDefault().getPath("examples", "dir2/dir3/dir4/dir5/dir6");
            // Files.createDirectories(dirToCreate);

            // Path filePath = FileSystems.getDefault().getPath("examples", "file1.txt");
            // long size = Files.size(filePath);
            // System.out.println("Size = "+ size);
            // System.out.println("Last modified " + Files.getLastModifiedTime(filePath));

            // BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
            // System.out.println("Size = "+ attrs.size());
            // System.out.println("Last Modified " + attrs.lastModifiedTime());
            // System.out.println("Created On " + attrs.creationTime());
            // System.out.println("Is directory? " + attrs.isDirectory());
            // System.out.println("Is regular file? " + attrs.isRegularFile());

            DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p);
            Path path = FileSystems.getDefault().getPath("examples/dir2");
            DirectoryStream<Path> contents = Files.newDirectoryStream(path);
            for(Path file: contents){
                System.out.println(file.getFileName());
            }

            String separator = File.separator;
            System.out.println(separator);
            separator = FileSystems.getDefault().getSeparator();
            System.out.println(separator);


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    //     Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
    //     printFile(path);
    //     Path path2 = FileSystems.getDefault().getPath("./files/SubdirectoryFile.txt");
    //     printFile(path2);
    //     Path filePath = Paths.get("/Users/mzhang/Documents/Project/java-master/OutThere.txt");
    //     printFile(filePath);
    //     filePath = Paths.get(".");
    //     System.out.println(filePath.toAbsolutePath());
    // }

    // private static void printFile(Path path){
    //     try(BufferedReader fileReader = Files.newBufferedReader(path)) {
    //         String line;
    //         while((line = fileReader.readLine())!= null) {
    //             System.out.println(line);
    //         }
    //     } catch(IOException e) {
    //         System.out.println(e.getMessage());
    //         e.printStackTrace();
    //     }
    // }
}