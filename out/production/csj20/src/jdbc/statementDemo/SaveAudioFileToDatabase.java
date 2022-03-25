package jdbc.statementDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveAudioFileToDatabase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "root@1234";

        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "INSERT INTO SONGS values (?,?,?);";

        PreparedStatement statement = connection.prepareStatement(query);

        File file = new File("/Users/sandeepbhingle/Downloads/sample.mp4");
        FileInputStream fileInputStream = new FileInputStream(file);

        statement.setInt(1, 1);
        statement.setString(2, file.getName());
        statement.setBinaryStream(3, fileInputStream,(int)file.length());

        int update = statement.executeUpdate();
        System.out.println("Video file uploaded");

    }
}
