package collections.tree_set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {

    public static void test1(){
        TreeSet<Student> treeSet = new TreeSet<>();
        Student student1 = new Student("Ivan",2);
        Student student2= new Student("Olya",3);
        Student student3 = new Student("Katya",4);
        Student student4 = new Student("Luda",1);
        Student student5 = new Student("Sergey",6);

        // если не переопределить compareTo в Student, то будет исключение тк дереву нужно как-то сортировать студентов
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);

        //нужно позаботиться,что когда compareTo возвращает 0, equals() должен возвращать true; и hash должен быть одинаковым
        Student student6 = new Student("Sergey",6);
        System.out.println(treeSet.last().compareTo(student6));
        System.out.println(treeSet.last().equals(student6));
        System.out.println(treeSet.last().hashCode() == student6.hashCode());


        System.out.println(treeSet.lower(treeSet.higher(student2))); // обращение к студенту 2, можно просто проверять на contains, и если да,то уже работать непосредственно с объектом,который проверяли



    }

    public static void main(String[] args) {

        test1();

    }

}
