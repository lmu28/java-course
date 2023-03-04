package collections.linked_hash_set;

import java.util.LinkedHashSet;

public class LinkedHashSetEx1 {
    // содержит элементы в ествественно порядке, как при добавлении

    public  static  void  test1(){
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(1);
        linkedHashSet.add(7);
        linkedHashSet.add(8);
        linkedHashSet.add(15);
        linkedHashSet.add(-4);
        System.out.println(linkedHashSet);

    }
    public static void main(String[] args) {
        test1();
    }

}
