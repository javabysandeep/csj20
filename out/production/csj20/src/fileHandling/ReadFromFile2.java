package fileHandling;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile2 {
    public static void main(String[] args) throws IOException {
        File file = new File("EmployeeDetails.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        ///reading from buffer
        int ch = bufferedInputStream.read();
        while (ch != -1) {
            System.out.print((char) ch);
            ch = bufferedInputStream.read();
        }
        bufferedInputStream.close();
        fileInputStream.close();

    }
}
