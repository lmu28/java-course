package collections.array_list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("qwert");
        list1.add("asdfgh");
        List<String> list2 = new ArrayList<>(list1);
       // System.out.println(list1 == list2);

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(50);
        intList.remove((Integer)50);

        //System.out.println(intList);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ivan1",20));
        personList.add(new Person("Ivan2",30));
        personList.add(new Person("Ivan3",40));
        personList.add(new Person("Ivan4",50));

        Person ivan4 = new Person("Ivan4",50);



        personList.remove(ivan4); // до переопределения equals в Person обьекты сравнивались просто по адресам, и поэтому он искал бы только объект,находящийся по адресу ivan4
        System.out.println(personList);


    }
}
