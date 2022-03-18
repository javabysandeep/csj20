package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectFromFile2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("vaishanvData.txt");

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student swapnil = (Student) objectInputStream.readObject();
        System.out.println("Object read from the file " + swapnil);

        fileInputStream.close();
        objectInputStream.close();
    }
}
