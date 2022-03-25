package fileHandling;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile3 {
    public static void main(String[] args) throws IOException {
        File file = new File("LoopMe.txt");
        file.createNewFile();
        System.out.println("File is created with name " + file.getName());

        long startTime = System.currentTimeMillis();
        //Write to a file
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        for (int i = 0; i < 100000; i++) {
            bufferedOutputStream.write(65);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken to write " + (endTime - startTime));
        fileOutputStream.close();
        System.out.println("File write operation complete & its closed");

    }
}
