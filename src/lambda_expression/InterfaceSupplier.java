package lambda_expression;

import java.util.ArrayList;

import java.util.List;
import java.util.function.Supplier;

public class InterfaceSupplier {
    /**
     * поствляет объекты, когда вызывается его метод - get(), В нашем примере поставляется 3 студента(лучше заменить,например,на машины)
    */

    public static ArrayList<Student> createThreeStudents(Supplier<Student> supplier){
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            list.add(supplier.get());
        }
        return (ArrayList<Student>)list;
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list = createThreeStudents(()->new Student("Ivan",'m',20,3,7.7));
        System.out.println(list);
    }
}
