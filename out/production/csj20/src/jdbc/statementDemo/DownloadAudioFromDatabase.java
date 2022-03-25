package jdbc.statementDemo;

import java.io.*;
import java.sql.*;

public class DownloadAudioFromDatabase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "root@1234";

        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "SELECT * FROM songs;";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        String fileName = null;
        InputStream binaryStream = null;

        while (resultSet.next()) {
            fileName = resultSet.getString(2);
            Blob blob = resultSet.getBlob(3);
            binaryStream = blob.getBinaryStream();
        }
        File file = new File(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);
        int r = binaryStream.read();
        while (r != -1) {
            bos.write(r);
            r = binaryStream.read();
        }
        System.out.println("file downloaded");

    }
}
