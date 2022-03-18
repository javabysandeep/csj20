package fileHandling;

import java.io.File;
import java.io.IOException;

public class DeleteDirectory {
    public static void main(String[] args) throws IOException {
        File dir = new File("newFolder2022");
            dir.delete();
    }
}
