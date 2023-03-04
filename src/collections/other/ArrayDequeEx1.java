package collections.other;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx1 {
    // Queue -> Deque -> ArrayDeque
    //двунаправленная очередь
    // мы можем добавлять/удалять элементы как с начала, так и с конца и это будет эффективно
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(0);
        arrayDeque.addFirst(2);
        arrayDeque.addFirst(3);
        arrayDeque.addLast(-5);
        arrayDeque.addLast(-7);
        arrayDeque.addFirst(15);
        arrayDeque.add(100);
        System.out.println(arrayDeque);



    }
}
