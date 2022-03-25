package jdbcDemo;

import java.sql.*;

public class GetMetadata {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "root@1234";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String query = " select * from student";
        ResultSet resultSet = statement.executeQuery(query);
        ResultSetMetaData metaData = resultSet.getMetaData();

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + "\t" +
                    resultSet.getString(2) + "\t" +
                    resultSet.getString(3));

        }
        System.out.println("Get metadata");
        int columnType = metaData.getColumnType(2);// to-do
        System.out.println(columnType);
        System.out.println("Column count " + metaData.getColumnCount());
        System.out.println("Table name " + metaData.getTableName(1));
        connection.close();
    }
}
