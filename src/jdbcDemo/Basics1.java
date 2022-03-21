package jdbcDemo;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class Basics1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Driver driver = new com.mysql.cj.jdbc.Driver();
        //1. It loads the class into the memory. Once the class is loaded then its static block is executed.
        //2. Static block of Driver class registers the Driver with the DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "root@1234";

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();

        String query = "SELECT studentName FROM student";
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            /*System.out.println(resultSet.getInt(1) + "\t" +
                    resultSet.getString(2) + "\t" +
                    resultSet.getString(3));*/
            System.out.println(resultSet.getString("studentName"));
        }
        connection.close();
    }
}

interface I1 {
    void m1();
}

class A implements I1 {
    @Override
    public void m1() {

    }
}

class B extends A implements I1 {

}