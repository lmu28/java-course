package lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentInfo {

    public void addStudents(ArrayList<Student> list){
        Student student1 = new Student("Ivan",'m',20,3,7.7);
        Student student2 = new Student("Maria",'f',16,1,8.8);
        Student student3 = new Student("Sveta",'f',20,2,5.6);
        Student student4 = new Student("Olya",'f',17,1,9.0);
        Student student5 = new Student("Petr",'m',23,6,10);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

    }
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        List<Student> list = new ArrayList<>();
        studentInfo.addStudents((ArrayList<Student>) list);
        studentInfo.printStudentOverGrade((ArrayList<Student>)list,8);
        System.out.println();

        studentInfo.testStudents((ArrayList<Student>)list,new StudentChecks(){ // вывод всех студенток девушек с первого курса, больше не нужно создавать кучу классов/методов для проверки
            @Override
            public boolean check(Student s) {
                return (s.getSex() == 'f' && s.getCourse() == 1);
            }
        });
        System.out.println();



/**
 * !используя лямбда выражения!
 * фильтрация. Пишем только то, что необходимо писать, все лишнее не нужно;
 * то,что принимается в методе -> тело метода;
 * Функциональное программирование,которое появилось в java 8
 * использование lambda expr возможно только с функциональными интерфейсами(всего 1 абстрактный метод)
 * в LE мы можем использовать переменные, объявленные ранее, которые final или effectively final
 */
        studentInfo.testStudents((ArrayList<Student>) list, s -> {return s.getSex() == 'm';});
        System.out.println();

        /**
         * самый короткий способ написания
         * можно не писать return ...; Но только если не ставим {}
         * s-> ... можно писать слева s(без скобок), когда у нас в методе интерфейса всего 1 параметр
         * s -> statement возможно только когда у нас 1 statement, иначе нужно писать полностью {...}
         */
        studentInfo.testStudents((ArrayList<Student>) list, s -> s.getAge() > 15 && s.getCourse() == 3); //
        System.out.println();
        StudentChecks sc = s -> s.getCourse() > 1; // можно записывыть и так

        Collections.sort(list,(s1,s2)->s1.getCourse()-s2.getCourse());// сортировка по курсу
        System.out.println(list);



    }

    public void printStudentOverGrade(ArrayList<Student> list,double grade){
        for(Student s:list){
            if (s.getAverageScore() > grade){
                System.out.println(s);
            }
        }

    }

    void testStudents(ArrayList<Student> list, StudentChecks studentChecks){
        for (Student s:list){
            if (studentChecks.check(s)){
                System.out.println(s);
            }
        }

    }
}
