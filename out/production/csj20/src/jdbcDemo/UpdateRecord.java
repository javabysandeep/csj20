package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "root@1234";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String query = "UPDATE IMAGES SET imageName='cyber.png' WHERE imageId=1";
        int status = statement.executeUpdate(query);
        connection.close();
        System.out.println("Record is inserted ");
    }
}
