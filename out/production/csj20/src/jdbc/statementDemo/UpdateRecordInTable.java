package jdbc.statementDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecordInTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "root@1234";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String query = "UPDATE STUDENT SET city='Mumbai' WHERE studentId=1;";
        int update = statement.executeUpdate(query);
        System.out.println("Record Updated");

    }
}
