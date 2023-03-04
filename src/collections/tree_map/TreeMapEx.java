package collections.tree_map;

import collections.class_collectios.Employee;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

    public static void testMap1() {
        Map<Employee, Double> map = new TreeMap<>();
        Employee employee1 = new Employee("Oleg Petrov", 15000);
        Employee employee2 = new Employee("Lubov Ivanova", 25000);
        Employee employee3 = new Employee("Maxim Oreshkin", 50000);
        Employee employee4 = new Employee("Misha Rebrov", 100000);
        Employee employee5 = new Employee("Alexandr Fedotov", 27700);

        map.put(employee1, 50.5);
        map.put(employee2, 20.7);
        map.put(employee3, 34.15);
        map.put(employee4, 17.585);
        map.put(employee5, 84.45);
        //сортируются по зарплате(CompareTo)
        System.out.println(map);
        System.out.println(((TreeMap)map).descendingMap());
        System.out.println("------------------------------------------------");
        System.out.println(((TreeMap<Employee, Double>) map).lastEntry());
        System.out.println(((TreeMap<Employee, Double>) map).firstEntry());
        System.out.println("------------------------------------------------");
        System.out.println(map);
        System.out.println(((TreeMap<Employee, Double>) map).tailMap(employee5));
        System.out.println(((TreeMap<Employee, Double>) map).headMap(employee5));
        System.out.println("------------------------------------------------");
        //возьмем такой отрезок: Employee{name='Lubov Ivanova', salary=25000}=20.7, Employee{name='Alexandr Fedotov'
        Map<Employee,Double> map2 = new TreeMap<>(((TreeMap<Employee, Double>) map).tailMap(employee2));
        System.out.println(map2);
        map2 = ((TreeMap<Employee, Double>) map2).headMap(((TreeMap<Employee, Double>) map2).higherKey(employee5));
        System.out.println(map2);






    }

    public static void main(String[] args) {
        testMap1();

    }

}
