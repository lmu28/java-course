package lambda_expression.InterfaceConsumer;

import lambda_expression.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class InterfaceConsumer {
    /**
     * потребляет объекты и что-то с ними делает, когда вызывается его метод - accept();
     * используется методом forEach() в коллекциях
     */

    public static void changeStudent(Student student, Consumer<Student> consumer){
        consumer.accept(student);

    }

    public static void main(String[] args) {
        Student student = new Student("Ivan",'m',20,3,7.7);
        System.out.println(student);
        changeStudent(student,student1 -> student1.setName("Oleg"));

        System.out.println(student);
    }

}
