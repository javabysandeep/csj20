package jdbcDemo;

import java.sql.*;

public class CallStoreProcedure {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "root@1234";

//        Class.forName("com.mysql.cj.jdbc.Driver");
//        System.out.println("Driver is loaded");

        Connection connection = DriverManager.getConnection(url, username, password);

//        Statement statement = connection.createStatement();

//        PreparedStatement preparedStatement = connection.prepareStatement("");

        String sql = "call student_proc(?,?)";
        CallableStatement callableStatement = connection.prepareCall(sql);
        callableStatement.setString(1, "repeat");
        callableStatement.setString(2, "Deccan");

        boolean execute = callableStatement.execute();
        connection.close();
        System.out.println("Stored proc executed");

    }
}
