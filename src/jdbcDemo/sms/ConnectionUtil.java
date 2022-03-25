package jdbcDemo.sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    private ConnectionUtil() {
    }

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "root@1234";
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
