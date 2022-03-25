package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalTime;

public class WriteToFile2 {
    public static void main(String[] args) throws IOException {
        File file = new File("LoopMe.txt");
        file.createNewFile();
        System.out.println("File is created with name " + file.getName());

        long startTime = System.currentTimeMillis();
        //Write to a file
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        for (int i = 0; i < 100000; i++) {
            fileOutputStream.write(65);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken to write " + (endTime - startTime));
        fileOutputStream.close();
        System.out.println("File write operation complete & its closed");

    }
}
