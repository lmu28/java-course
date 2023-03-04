package streams;

import lambda_expression.Student;
import lambda_expression.StudentInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx2 {
    /**
     * filter(Predicate p)
     * sorted()
     *
     */

    public static void main(String[] args) {
        //получение студентов из раздела с lambda expression
        List<Student> students = new ArrayList<>();
        StudentInfo info = new StudentInfo();
        info.addStudents((ArrayList<Student>) students);
        System.out.println(students);
        System.out.println("--------------------------------------------------");
        students.stream().filter(s -> s.getAge() >= 20 && s.getSex() == 'f').forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        Stream<Student> stream = Stream.of(students.get(0),students.get(1));
        stream.filter(s -> s.getCourse() == 3).forEach(System.out::println);

        System.out.println(students);
        System.out.println("----------------------------------------------------");
        students.stream().sorted((st1,st2)->{return st1.getCourse() - st2.getCourse();}).forEach(System.out::println);

        Stream<Character> stream1 = Stream.of('a','d','2','Q');
        Stream<Character> stream2 = Stream.of('z','x','c','v','7');
        Stream.concat(stream1,stream2).forEach(e -> System.out.print(e));
        System.out.println("\n----------------------------------------------------");
        Map<Integer,List<Student>> map1 = students.stream().collect(Collectors.groupingBy(e -> e.getCourse()));
        Map<Boolean,List<Student>> map2 = students.stream().collect(Collectors.partitioningBy(e->
                e.getAverageScore() > 8.0));
        System.out.println(map1);
        System.out.println();
        System.out.println(map2);





    }
}
