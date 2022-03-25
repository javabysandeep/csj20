package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        File file = new File("EmployeeDetails.txt");
        FileOutputStream  fileOutputStream = new FileOutputStream(file,true);
        fileOutputStream.write(65);
        byte[] byteArray= {66,67,68,69,70};
        fileOutputStream.write(byteArray);
        System.out.println("");

    }
}
