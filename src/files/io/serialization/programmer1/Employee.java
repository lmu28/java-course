package files.io.serialization.programmer1;

import java.io.Serializable;



// implements Serializable - для того,чтобы было возможно сериализировать
public class Employee implements Serializable {

    static final long serialVersionUID= 2; // версия нашего работника
    String name;

    String surname;
    //int age;


    String department;

    transient double salary; // Временный(при сериализации не будет передан)

    Car car;
//--------------v1
//    public Employee(String name, String department, int age, double salary, Car car) {
//        this.name = name;
//        this.department = department;
//        this.age = age;
//        this.salary = salary;
//        this.car = car;
//    }

//--------------v2
    public Employee(String name, String surname, String department, double salary, Car car) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.car = car;
    }


    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", department='" + department + '\'' +
//                //", age=" + age +
//                ", salary=" + salary +
//                ",car:" + car +
//                '}';
//    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", surname=" + surname +
                ", salary=" + salary +
                ",car:" + car +
                '}';
    }
}
