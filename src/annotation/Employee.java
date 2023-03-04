package annotation;

public final class Employee implements Comparable<Employee> {


    private final String name;
    private final int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name) {
        this.name = name;
        this.salary = 10000;
    }
    @MyAnnotation
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee emp) {
        if (this.salary > emp.getSalary()) {
            return 1;
        }
        if (this.salary < emp.getSalary()) {
            return -1;
        }

        return 0;
    }

    @Override
    public int hashCode() {
       int result = name != null ? name.hashCode() : 0;
       result = 31 * result + salary;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        Employee emp = (Employee) o;
        return (this.name == emp.name);
    }
}



