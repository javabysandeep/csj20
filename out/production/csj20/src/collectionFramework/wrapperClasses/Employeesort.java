package collectionFramework.wrapperClasses;

import collectionFramework.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employeesort {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Guru",22312.2f);
        Employee employee2 = new Employee(2,"Saurabh",5546312.2f);
        Employee employee3 = new Employee(3,"Sanket",922312.2f);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        Collections.sort(employees);

        for (Employee emp: employees) {
            System.out.println(emp);
        }
    }
}
