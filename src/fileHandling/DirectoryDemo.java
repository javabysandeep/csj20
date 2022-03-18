package fileHandling;

import java.io.File;
import java.io.IOException;

public class DirectoryDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("newFolder2022");
//        file.createNewFile();
        System.out.println(file.isDirectory());
        File[] files = file.listFiles();
        for (File file1:files) {
            System.out.println(file1.getName());
        }

    }
}
