package regex;

/**
 *  %[flags][width][.precision]datatype_specifier
 *  flags:
 *      - Выравнять по левому краю
 *      0 добавление нулей перед числом
 *      , разделитель разрядов числа (3,14)
 *  width - минимальное кол-во символов для нашего текста
 *  .precision - точность для дробных чисел
 *
 *  datatype_specifier:
 *      b boolean
 *      c character
 *      s String
 *      d целое число
 *      f десятичное число
 *
 *
 *
 */


public class PrintfEx {

    static void employeeInfo(Employee employee){
        System.out.printf("%03d \t %-5s  \t %,.1f \n",employee.id,employee.name,employee.salary*1.05);
    }

    public static void main(String[] args) {


        Employee employee1 = new Employee(10,"Oleg",750.23);
        Employee employee2 = new Employee(1,"Ivan",1000.0);
        Employee employee3 = new Employee(745,"Katya",1500.5);
        employeeInfo(employee1);
        employeeInfo(employee2);
        employeeInfo(employee3);

        String newString = String.format("%03d \t %-5s  \t %,.1f \n",6,"Max",5000.0);
        System.out.println(newString);

    }
}


class Employee{

    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
