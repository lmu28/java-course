package collections.hash_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        Set<Integer> union = new HashSet<>(set);
        union.addAll(set2);
        Set<Integer> intersect = new HashSet<>(set);
        intersect.retainAll(set2);
        Set<Integer> subtract = new HashSet<>(set);
        subtract.removeAll(set2);
        System.out.println(union);
        System.out.println(intersect);
        System.out.println(subtract);


        Employee employee1 = new Employee("Oleg Petrov",20);
        Employee employee2 = new Employee("Lubov Ivanova",25);
        Employee employee3 = new Employee("Maxim Oreshkin",50);
        Employee employee4 = new Employee("Misha Rebrov",17);
        Employee employee5 = new Employee("Alexandr Fedotov",27);


        Set<Employee> employeesSet = new HashSet<>();
        employeesSet.add(employee1);
        employeesSet.add(employee2);
        employeesSet.add(employee3);
        employeesSet.add(employee4);
        employeesSet.add(employee5);
        System.out.println(employeesSet);





    }

}
