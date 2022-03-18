package fileHandling;

import java.io.*;

public class ReadObjectFromFileDeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("swpanilData.txt");

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student swapnil = (Student) objectInputStream.readObject();
        System.out.println("Object read from the file "+swapnil);

        fileInputStream.close();
        objectInputStream.close();
    }
}
