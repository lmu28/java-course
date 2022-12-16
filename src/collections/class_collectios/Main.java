package collections.class_collectios;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{1,2,7,30,0,20,-15,-7,17,-40});
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println();
        // если отрицательное значение - то не существует
        System.out.println(Collections.binarySearch(list,20));
        System.out.println(Collections.binarySearch(list,21));
        System.out.println(Collections.binarySearch(list,21));
        System.out.println(Collections.binarySearch(list,-200));

        System.out.println();
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Arkadiy",50000));
        employees.add(new Employee("Ivan",30000));
        employees.add(new Employee("Luba",45000));
        employees.add(new Employee("Gosha",5000));
        employees.add(new Employee("Petr",15000));
        employees.add(new Employee("Kristina",25000));
        System.out.println(employees);
        System.out.println();
        //Collections.sort(employees);

        System.out.println(employees);
        String name = "Luba";
        int salary = 45000;
        if(Collections.binarySearch(employees, new Employee(name)) >= 0){
            System.out.println(name + " +");
        }else System.out.println(name + "-");

        List<A> testList = new ArrayList<>();
        testList.add(new A("a"));
        testList.add(new A("z"));
        testList.add(new A("v"));
        testList.add(new A("b"));
        testList.add(new A("d"));
        testList.add(new A("o"));

        Collections.sort(testList, new Comparator<A>() {
            @Override
            public int compare(A o1, A o2) {
               return o1.s.compareTo(o2.s);
            }
        });



       Collections.binarySearch(testList, new A("s"), new Comparator<A>() {
           @Override
           public int compare(A o1, A o2) {
               return o1.s.compareTo(o2.s);
           }
       });





    }
}
// просто тест на то как работает Comparator
class A {

    String s;

    public A(String s){
        this.s= s;
    }





}
