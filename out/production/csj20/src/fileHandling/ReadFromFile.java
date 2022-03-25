package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        File file = new File("EmployeeDetails.txt");
       /* file.createNewFile();
        System.out.println("File is created.");*/

        FileInputStream fileInputStream = new FileInputStream(file);
//        int read = fileInputStream.read();
        /*long fileLength = file.length();
        for (int i = 1; i <=fileLength ; i++) {
            System.out.print((char) fileInputStream.read());
        }*/
        int ch = fileInputStream.read();
        while (ch != -1) {
            System.out.print((char) ch);
            ch = fileInputStream.read();
        }

        fileInputStream.close();
    }
}
