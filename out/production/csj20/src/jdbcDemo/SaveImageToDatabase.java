package jdbcDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class SaveImageToDatabase {
    public static void main(String[] args) throws SQLException, FileNotFoundException {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "root@1234";

        File file = new File("/Users/sandeepbhingle/Downloads/urbanpro.mp4");
        FileInputStream fileInputStream = new FileInputStream(file);


        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "INSERT INTO IMAGES values(?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query);

        statement.setInt(1, 10);
        statement.setString(2, file.getName());
        statement.setBlob(3, fileInputStream);

        int i = statement.executeUpdate();
        System.out.println("Images uploaded");
        connection.close();
    }
}
