package collections.iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorPalindrom {
    // будем проверять строку на то, палиндром ли она
    public static void main(String[] args) {

        String s = "argentinamanitnegra";

        List<Character> list = new LinkedList<>();
        for (char c: s.toCharArray()){
            list.add(c);
        }
        ListIterator listIteratorLeft = list.listIterator();
        ListIterator listIteratorRight = list.listIterator(list.size()); // c Какой позиции начинаем итерации

        boolean isPalindrom = true;
        while (listIteratorLeft.hasNext() && listIteratorRight.hasPrevious()){
            if (listIteratorLeft.nextIndex() > listIteratorRight.previousIndex()) break;

            if (listIteratorLeft.next() != listIteratorRight.previous()){
                isPalindrom = false;
                break;
            }
        }

        System.out.println(isPalindrom);



    }
}
