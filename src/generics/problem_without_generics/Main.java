package generics.problem_without_generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("asdfgh");
        list.add("1");
        list.add("QWERT");
        list.add("32432");
        list.add("!@#$%#%#");
        list.add(1); // в этои моменте возникает ошибка
        for(Object o: list){
            System.out.println((String)o);
        }
    }
}
