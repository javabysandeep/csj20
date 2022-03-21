package jdbcDemo;

import java.io.*;
import java.sql.*;

public class DownloadImageFromDatabase {
    public static void main(String[] args) throws SQLException, IOException {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "root@1234";

        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "SELECT * FROM IMAGES where imageId=10;";

        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();

        String imageName = null;
        InputStream image = null;
        while (resultSet.next()) {
            imageName = resultSet.getString("imageName");
            image = resultSet.getBinaryStream("image");

        }
        File file = new File(imageName);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
       int r = image.read();
        while (r !=-1){
            fileOutputStream.write(r);
            r = image.read();
        }
        System.out.println("Images download");
        connection.close();
    }
}
