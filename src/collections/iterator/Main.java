package collections.iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("qwert");
        list1.add("asdfgh");

        Iterator<String> iterator = list1.iterator();

        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(list1);
    }
}
