package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx1 {

    /**
     * map
     * collection/array => stream
     * stream => collection/array
     * forEach
     * reduce
     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("qwerty");
        list.add("asdfgh2");
        list.add("zxcvbn33");
        list.add("zz");
        list.add("aaaaaaaaaaaaaa");

        List<Integer> list1 = list.stream().map(e1 ->e1.length()).collect(Collectors.toList());
        //создаём поток потом задаём lambda ex, в соответствии с интрефейсом Function,
        // преобразуем полученный поток в массив int
        System.out.println(list1);
        list.stream().forEach(e1 -> System.out.println(e1)); // Вывод сразу стрима
        list.stream().forEach(System.out::println); // короткий способ записи - предаём ссылку на println

        //с массивом
        int a[] = {1,2,4,10,-11};
        Arrays.stream(a).map(e1 -> e1*2).forEach(System.out::println);
        int b[] = new int[10];
        b = Arrays.stream(a).map(e1 -> e1*-1).toArray();
        System.out.println();
        for(int i:b){
            System.out.println(i);
        }

        System.out.println("--------------------------reduce--------------------------");
        //reduce
        //конкатенация list
        Optional<String> o = list.stream().reduce((acum, e) -> acum + ";" + e );
        if (o.isPresent()){
            System.out.println(o.get());
        }else {
            System.out.println("not present");
        }
        System.out.println();

        if (Arrays.stream(a).reduce((acum,e)->acum+e).isPresent()){
            System.out.println(Arrays.stream(a).reduce((acum,e)->acum+e).getAsInt());
        }else{
            System.out.println("-");
        }
        System.out.println();
        int mlt = Arrays.stream(a).reduce(1,(acum,e)-> acum*e);
        System.out.println(mlt);




    }
}
