package jdbc.preparedStatementDemo;

import java.sql.*;

public class InsertIntoTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "root@1234";
        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "INSERT INTO STUDENT(studentName, city) values (?,?);";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1,"John");
        statement.setString(2,"Delhi");
        int update = statement.executeUpdate();
        System.out.println("Record inserted");

    }
}
