package jdbcDemo;

import java.sql.*;
import java.util.Scanner;

public class InsertIntoTableScanner2 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "root@1234";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student details");
        int studentId = scanner.nextInt();
        String studentName = scanner.next();
        String city = scanner.next();

        Connection connection = DriverManager.getConnection(url, username, password);

        String query = " INSERT INTO student values(?,?,?);";

        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, studentId);
        statement.setString(2, studentName);
        statement.setString(3, city);

        int status = statement.executeUpdate();
        connection.close();
        System.out.println("Record is inserted ");
    }
}
