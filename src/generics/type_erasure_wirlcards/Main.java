package generics.type_erasure_wirlcards;

import java.util.ArrayList;
import java.util.List;

public class Main{//создаём метод, находящий сумму всех элментов листа, если он Number (не факт, что это хорошо работает)

    public static double  getSum(List<? extends Number> list){ // можно было добавить параметр T классу
       double sum = 0;
        for(Number num:list){
            sum += num.doubleValue();
        }

        return sum;



    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(3);
        System.out.println(getSum(list1));
        List<Double> list2 = new ArrayList<Double>();
        list2.add(1.111);
        list2.add(3.14);

        System.out.println(getSum(list2));




    }
}
