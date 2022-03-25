package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile4 {
    public static void main(String[] args) throws IOException {
        File file = new File("EmployeeDetails.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int ch = bufferedReader.read();
        while (ch != -1) {
            System.out.print((char) ch);
            ch = bufferedReader.read();
        }
        bufferedReader.close();
        fileReader.close();
    }
}
