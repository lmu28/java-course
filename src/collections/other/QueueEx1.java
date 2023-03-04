package collections.other;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {
    // очередь FIFO
    public static void main(String[] args) {
        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(10);
        linkedList.add(0);
        linkedList.add(-5);
        System.out.println(linkedList);
        linkedList.remove();
        linkedList.remove();
        linkedList.poll(); // тоже удаляет первый элемент, но не выбросит искл, в случае когда очередь пуста
        System.out.println(linkedList);
        System.out.println(linkedList.element());
        System.out.println(linkedList.peek()); // как и верхнее, но без исключения,в случае пустой очереди

    }
}
