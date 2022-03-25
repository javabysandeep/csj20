package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListOfEmployees {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList();
        Employee employee1 = new Employee(1, "Vaishnav", 230000.11f);
        Employee employee2 = new Employee(10, "Shantu", 300000.11f);
        Employee employee3 = new Employee(9, "Sanket", 23000.11f);
        Employee employee4 = new Employee(6, "Shubham", 1900000.11f);
        Employee employee5 = new Employee(12, "Mohini", 245000.11f);
        Employee employee6 = new Employee(11, "Chaitrali", 4230000.11f);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println("Sort employees");
        Collections.sort(employees);
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
