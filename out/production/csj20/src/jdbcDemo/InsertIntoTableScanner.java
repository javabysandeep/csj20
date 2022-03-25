package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertIntoTableScanner {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "root@1234";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student details");
        int studentId = scanner.nextInt();
        String studentName = scanner.next();
        String city = scanner.next();

        String query = " INSERT INTO student values(" + studentId + ",'" +
                studentName + "'," + "'" +
                city +
                "')";

        int status = statement.executeUpdate(query);
        connection.close();
        System.out.println("Record is inserted ");
    }
}
