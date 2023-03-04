package collections.other;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx1 {
    // все то же самое как и в обычной очереди, но элементы содержаться не в порядке добавления, а в отсортированном
    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(4);
        priorityQueue.add(2);
        priorityQueue.add(10);
        priorityQueue.add(0);
        priorityQueue.add(-5);

        System.out.println(priorityQueue); // при выводе не видно, что очередь отсортирована, но при использовании элементов, она в определенный момент отсортируется
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.remove());
        }

    }
}
