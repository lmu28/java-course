package lambda_expression;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class InterfacePredicate {
    /**
     * готовый интрфейс
     * нужно реализовать 1 метод - boolean test(T t), T - param
     * используется с методом removeIf - пройдется по коллекции и удалит все элементы, для которых будет возвр true
     */

    void testStudents(ArrayList<Student> list,Predicate<Student>studentChecks){
        for (Student s:list){
            if (studentChecks.test(s)){
                System.out.println(s);
            }
        }

    }

    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        List<Student> list = new ArrayList<>();
        studentInfo.addStudents((ArrayList<Student>) list);
        InterfacePredicate interfacePredicate = new InterfacePredicate();

        interfacePredicate.testStudents((ArrayList<Student>) list, s -> s.getCourse() == 1);
        System.out.println("--------------------------------------------------");
        System.out.println(list);
        System.out.println("--------------------------------------------------");
        list.removeIf(s->s.getAge()<20);
        System.out.println("--------------------------------------------------");
        System.out.println(list);
        System.out.println("--------------------------------------------------");

        // объедение предикатов(метод add из интерфейса Predicate)
        list.clear(); studentInfo.addStudents((ArrayList<Student>) list);
        Predicate<Student> predicate1 = s -> s.getAge() >= 20;
        Predicate<Student> predicate2 = s -> s.getAverageScore() > 8;

        interfacePredicate.testStudents((ArrayList<Student>)list,predicate1.and(predicate2));
        //также будет работать и с or(||)
        //negate - отрицание нашего предиката







    }
}
