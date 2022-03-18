package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        file.createNewFile();
       // System.out.println(file.exists());
        //System.out.println("File name " + file.getName());

        long length = file.length();
        //lenght : no. of characters in  the given file
        System.out.println("Length of a file " + length);

        //permissions
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());
        System.out.println(file.canRead());

        file.setWritable(false);

        //file.delete();
        //System.out.println("File is deleted");

        //path
        System.out.println("Absolute path "+file.getAbsolutePath());
        System.out.println("Relative path "+file.getCanonicalPath());
        System.out.println("Relative path "+file.getPath());


    }
}
