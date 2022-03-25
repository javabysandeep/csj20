package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "root@1234";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String query = "create table images\n" +
                "(\n" +
                "    imageId   int         not null,\n" +
                "    imageName varchar(50) null,\n" +
                "    image     longblob    null,\n" +
                "    constraint images_pk\n" +
                "        primary key (imageId)\n" +
                ");\n" +
                "\n";
        int i = statement.executeUpdate(query);
        connection.close();
        System.out.println("Table is created " + i);
    }
}
