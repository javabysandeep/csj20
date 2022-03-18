package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveObjectToFile {
    public static void main(String[] args) throws IOException {
        Student student = new Student(1, "Swapnil", 95);
        File file = new File("swpanilData.txt");
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
