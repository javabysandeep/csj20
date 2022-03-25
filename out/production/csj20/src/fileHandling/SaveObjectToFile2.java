package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveObjectToFile2 {
    public static void main(String[] args) throws IOException {
        Student student = new Student(2, "Vaishnav", 99);
        student.setPassword("password");
        File file = new File("vaishanvData.txt");
        file.createNewFile();
        System.out.println("File is created " + file.getName());

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);

        System.out.println("Object written to file");
        fileOutputStream.close();
        objectOutputStream.close();

    }
}
