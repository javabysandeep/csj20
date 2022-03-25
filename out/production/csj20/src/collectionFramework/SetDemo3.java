package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        Set<Employee> set = new HashSet();
        Employee employee1 = new Employee(1, "Vaishnav", 230000.11f);
        Employee employee11 = new Employee(1, "Vaishnav", 230000.11f);
        Employee employee2 = new Employee(10, "Shantu", 300000.11f);
        Employee employee3 = new Employee(9, "Sanket", 23000.11f);
        Employee employee4 = new Employee(6, "Shubham", 1900000.11f);
        Employee employee5 = new Employee(12, "Mohini", 245000.11f);
        Employee employee6 = new Employee(11, "Chaitrali", 4230000.11f);
        set.add(employee1);
        set.add(employee2);
        set.add(employee2);
        set.add(employee2);
        set.add(employee2);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        set.add(employee5);
        set.add(employee6);
        set.add(employee11);

        for (Employee emp:set) {
            System.out.println(emp);
        }

    }
}
