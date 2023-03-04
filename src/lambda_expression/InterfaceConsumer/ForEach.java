package lambda_expression.InterfaceConsumer;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("Hi","How are you?","OK","By");
        for (String s:list){ // стандартный способ выводы
            System.out.println(s);
        }
        System.out.println();

        list.forEach(s -> System.out.println(s)); // вывод с помощью Consumer
    }
}
