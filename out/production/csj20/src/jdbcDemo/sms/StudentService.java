package jdbcDemo.sms;

import fileHandling.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentService {
    void registerStudent(Student student) {
        Connection connection = ConnectionUtil.getConnection();
        String query = "insert into student(studentName, city) values(?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, student.getStudentName());
            preparedStatement.setString(2, student.getPassword());
            int executeUpdate = preparedStatement.executeUpdate();
            System.out.println("Student registered");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }

    }

    void deleteStudent(int studentId){
        {
            Connection connection = ConnectionUtil.getConnection();
            String query = "DELETE FROM STUDENT WHERE studentId=?";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, studentId);
                int executeUpdate = preparedStatement.executeUpdate();
                System.out.println("Student deleted");
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {

            }

        }
    }

}
