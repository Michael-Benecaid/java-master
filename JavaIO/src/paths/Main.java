package paths;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
        printFile(path);
        Path path2 = FileSystems.getDefault().getPath("./files/SubdirectoryFile.txt");
        printFile(path2);
        Path filePath = Paths.get("/Users/mzhang/Documents/Project/java-master/OutThere.txt");
        printFile(filePath);
        filePath = Paths.get(".");
        System.out.println(filePath.toAbsolutePath());
    }

    private static void printFile(Path path){
        try(BufferedReader fileReader = Files.newBufferedReader(path)) {
            String line;
            while((line = fileReader.readLine())!= null) {
                System.out.println(line);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}