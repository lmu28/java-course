package collections.hash_set;

public final class Employee implements Comparable<Employee> {


    private final String name;
    private final int age;

    public Employee(String name, int salary) {
        this.name = name;
        this.age = salary;
    }

    public Employee(String name) {
        this.name = name;
        this.age = 10000;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void test(){
        System.out.println("!!!!");
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee emp) {
        if (this.age > emp.getAge()) {
            return 1;
        }
        if (this.age < emp.getAge()) {
            return -1;
        }

        return 0;
    }

    @Override
    public int hashCode() {
       int result = name != null ? name.hashCode() : 0;
       result = 31 * result + age;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        Employee emp = (Employee) o;
        return (this.name == emp.name);
    }
}



