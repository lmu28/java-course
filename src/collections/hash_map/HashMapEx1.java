package collections.hash_map;

import collections.class_collectios.Employee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class HashMapEx1 {

    public static void testMap1(){
        Map<String,Integer> map = new HashMap<>();
        map.put("Ivan Petrov",5);
        map.put("Vasya Krilov",10);
        map.put("Olya Sidorova",0);
        map.put("Ivan Ivaniv",50);
        System.out.println(map);
        map.putIfAbsent("Ivan Ivaniv",50);
        System.out.println(map);
        map.putIfAbsent("Ivan Ivaniv",20);
        System.out.println(map);
        System.out.println(map.get("Ivan Petrov"));
        System.out.println(map.get("Svetlana Andreeva"));
        map.remove("Olya Sidorova");
        System.out.println(map);
        System.out.println(map.containsValue(10));
        System.out.println(map.containsValue(-10));
        System.out.println(map.keySet());
        System.out.println(map.values());

    }

    public static void testMap2(){
        Map<Employee,Double> map =new HashMap<>();
        Employee employee1 = new Employee("Oleg Petrov",15000);
        Employee employee2 = new Employee("Lubov Ivanova",25000);
        Employee employee3 = new Employee("Maxim Oreshkin",50000);
        Employee employee4 = new Employee("Misha Rebrov",100000);
        Employee employee5 = new Employee("Alexandr Fedotov",27700);

        map.put(employee1,50.5);
        map.put(employee2,20.7);
        map.put(employee3,34.15);
        map.put(employee4,17.585);
        map.put(employee5,84.45);

        Employee employee6 = new Employee("Oleg Petrov",15000);
        System.out.println(employee6.equals(employee1)); // без переопределения hashcode(), equals() будет работать некорректно
        System.out.println(employee6.hashCode() == employee1.hashCode());
        map.put(employee6,31.0);
        System.out.println(map);
        System.out.println("------------------------------------------------------------------------");
        for(Map.Entry<Employee,Double> entry: map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("------------------------------------------------------------------------");
        //----2----//
        Set<Map.Entry<Employee,Double>> set = new HashSet<>(map.entrySet());
        for (Map.Entry<Employee,Double> entry: set){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("------------------------------------------------------------------------");
        //----3----//
        for (Employee emp: map.keySet()){
            System.out.println(emp + " - " + map.get(emp));

        }







    }

    public static void main(String[] args) {
        //testMap1();
        testMap2();


    }
}
