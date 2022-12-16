package generics.game;

public class Main {
    public static void main(String[] args) {

        Schoolar schoolar1 = new Schoolar("Ivan",10);
        Schoolar schoolar2 = new Schoolar("Valera",11);
        Schoolar schoolar3 = new Schoolar("Olya",15);
        Schoolar schoolar4 = new Schoolar("Stepan",17);
        Student student1 = new Student("Kolya",20);
        Student student2 = new Student("Lena",19);
        Employee employee1 = new Employee("Mitya",35);
        Employee employee3 = new Employee("Prtya",25);
        Employee employee2 = new Employee("Maria",70);
        Employee employee4 = new Employee("Kesha",66);

        Team<Schoolar> teamSchoolar1 = new Team<>("Lions");
        Team<Schoolar> teamSchoolar2 = new Team<>("Flowers");
        Team<Student> teamStudent1 = new Team<>("Fire");
        Team<Employee> teamEmployee1 = new Team<>("Winners");
        Team<Employee> teamEmployee2 = new Team<>("Pensionery");

        teamSchoolar1.addPlayer(schoolar1);
        teamSchoolar1.addPlayer(schoolar2);
        teamSchoolar2.addPlayer(schoolar3);
        teamSchoolar2.addPlayer(schoolar4);

        teamStudent1.addPlayer(student1);
        teamStudent1.addPlayer(student2);

        teamEmployee1.addPlayer(employee1);
        teamEmployee1.addPlayer(employee2);
        teamEmployee2.addPlayer(employee3);
        teamEmployee2.addPlayer(employee4);

//        System.out.println(teamStudent1);
//        System.out.println(teamSchoolar1);
//        System.out.println(teamSchoolar2);
//        System.out.println(teamEmployee1);
//        System.out.println(teamEmployee2);

        System.out.println();

        // teamSchoolar1.playWith(teamStudent1); // так нельзя тк школьники могут играть только со школьниками
        teamSchoolar1.playWith(teamSchoolar2);
        teamSchoolar1.playWith(teamSchoolar2);
        teamSchoolar1.playWith(teamSchoolar2);
        System.out.println("------------------------------------------------------------");
        teamEmployee1.playWith(teamEmployee2);
        teamEmployee1.playWith(teamEmployee2);
        teamEmployee1.playWith(teamEmployee2);


        /*
            Сделать Класс Play, где предусмотерть возможность играть

         */

    }
}
