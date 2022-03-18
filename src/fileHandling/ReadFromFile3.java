package fileHandling;

import java.io.*;

public class ReadFromFile3 {
    public static void main(String[] args) throws IOException {
        File file = new File("EmployeeDetails.txt");
        FileReader fileReader = new FileReader(file);
        int ch = fileReader.read();
        while (ch != -1) {
            System.out.print((char) ch);
            ch = fileReader.read();
        }
        fileReader.close();
    }
}
