package fileHandling;

import java.io.*;

public class WriteToFile4 {
    public static void main(String[] args) throws IOException {
        File file = new File("LoopMe1.txt");
        file.createNewFile();
        System.out.println("File is created with name " + file.getName());

        long startTime = System.currentTimeMillis();
        //Write to a file
        FileWriter fileWriter = new FileWriter(file, true);
        for (int i = 0; i < 1000000; i++) {
            fileWriter.write(65);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken to write " + (endTime - startTime));
        fileWriter.close();
        System.out.println("File write operation complete & its closed");

    }
}
