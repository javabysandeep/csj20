package oops;

public class Student {
    int rollNumber;
    String name;

    public Student() {
        System.out.println("zero param con");
    }

    public Student(int rollNumber, String name) {
        this();// calling zero param
        System.out.println("param con");
        this.rollNumber = rollNumber;
        this.name = name;
    }
    void m1(){
        display(this);
    }

    String display(Student student) {
        System.out.println(student.rollNumber + " " + student.name);
        return null;
    }

    public static void main(String[] args) {
        Student swapnil = new Student(101, "Swapnil");
        Student vaishnav = new Student(102, "Vaishnav");
        swapnil.m1();
        vaishnav.m1();

    }
}
