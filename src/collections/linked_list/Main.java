package collections.linked_list;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Misha",2);
        Student student2 = new Student("Ivan",3);
        Student student3 = new Student("Sveta",1);
        Student student4 = new Student("Olya",4);
        Student student5 = new Student("Stepa",4);

        Student student6 = new Student("Faruh",4);
        Student student7 = new Student("Tina",1);

        LinkedList<Student> linkedList = new LinkedList<>();

        linkedList.add(student1);
        linkedList.add(student2);
        linkedList.add(student3);
        linkedList.add(student4);
        linkedList.add(student5);
        System.out.println("------------------------------------------------");
        System.out.println(linkedList.get(2));
        linkedList.add(2,student6);
        System.out.println("------------------------------------------------");
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));
        linkedList.remove(3);
        System.out.println("------------------------------------------------");
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));
        System.out.println("------------------------------------------------");




    }
}
