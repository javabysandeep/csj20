package jdbc.statementDemo;

import java.sql.*;

public class CreateTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "root@1234";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String query = "create table student\n" +
                "(\n" +
                "    studentId   int auto_increment,\n" +
                "    studentName varchar(50)     null,\n" +
                "    city        varchar(50) null,\n" +
                "    constraint student_pk\n" +
                "        primary key (studentId)\n" +
                ");";
        int update = statement.executeUpdate(query);
        System.out.println("Table created");

    }
}
