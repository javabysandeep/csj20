package jdbcDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileDemo {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("March.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
    }
}
