package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class SetEqualsHashcode {
    public static void main(String[] args) {
        Set<Employee> set = new HashSet();
        Employee employee1 = new Employee(1, "Vaishnav", 230000.11f);
        Employee employee2 = new Employee(1, "Vaishnav", 230000.11f);
        set.add(employee1);
        set.add(employee2);

        for (Employee emp:set) {
            System.out.println(emp);
        }

    }
}
