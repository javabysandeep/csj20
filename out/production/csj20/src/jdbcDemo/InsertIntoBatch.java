package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertIntoBatch {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "root@1234";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();

        String query1 = "INSERT INTO STUDENT values(8,'Chaitrali', 'Khadakwasla')";
        String query2 = "INSERT INTO STUDENT values(9,'Mohini', 'Parbhani')";
        String query3 = "INSERT INTO STUDENT values(10,'Shubhangi', 'Akola')";
        String query4 = "INSERT INTO STUDENT values(11,'Namrta', 'Pune')";

        statement.addBatch(query1);
        statement.addBatch(query2);
        statement.addBatch(query3);
        statement.addBatch(query4);

        int[] ints = statement.executeBatch();
        connection.close();
        System.out.println("Batch statements executed");

    }
}
