package jdbcDemo.sms;

import fileHandling.Student;

public class App {
    public static void main(String[] args) {
        StudentService  studentService = new StudentService();
        Student student = new Student();
        student.setStudentName("Shivam");
        student.setPassword("Pune");
        //studentService.registerStudent(student);
        studentService.deleteStudent(13);
    }
}
