package lambda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class InterfaceFunction {
    /**
     * когда нам нужно вернуть какой-то тип, отличный от boolean(используем Predicate)
     * Function<T,R>, метод R apply(T);
     */

    public static double avrOf(List<Student> list, Function<Student,Double> f){ // возвращает среднее арифметическое баллов всех студентов
        double res = 0;
        for(Student s:list){
            res+=f.apply(s);
        }
        return res/list.size();
    }

    public static void main(String[] args) {
        Function<Integer,Double> testF = integer -> 5.5; // пример

        StudentInfo studentInfo = new StudentInfo();
        List<Student> list = new ArrayList<>();
        studentInfo.addStudents((ArrayList<Student>) list);

        System.out.println(avrOf(list,s -> s.getAverageScore()));
        System.out.println(avrOf(list,s -> (double)s.getCourse()));
        System.out.println(avrOf(list,s -> (double)s.getAge()));
    }

}
