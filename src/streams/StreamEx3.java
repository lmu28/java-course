package streams;

import java.util.ArrayList;
import java.util.List;
import lambda_expression.Student;
import lambda_expression.StudentInfo;

public class StreamEx3 {
    /**
     * flatMap()
     *
     */
    public static void main(String[] args) {

        List<StudentsGroup> studentsGroupList = new ArrayList<>();
        studentsGroupList.add(new StudentsGroup("A"));
        studentsGroupList.add(new StudentsGroup("B"));
        StudentInfo info = new StudentInfo();
        info.addStudents((ArrayList<Student>) studentsGroupList.get(0).getStudents());
        info.addStudents((ArrayList<Student>) studentsGroupList.get(1).getStudents());

        studentsGroupList.stream().map(g -> g.name = "QQQ").forEach(g -> System.out.println(g));


        studentsGroupList.get(0).getStudents().stream().map(s -> s.getAge()).forEach(System.out::println);

       // studentsGroupList.stream().flatMap(g -> g.getStudents().stream().map();





    }


    static class StudentsGroup{
        String name;
        List<Student> students;

        public StudentsGroup(String name) {
            this.name = name;
            students = new ArrayList<>();
        }

       public void addStudent(Student student){
            students.add(student);
       }

        public List<Student> getStudents() {
            return students;
        }
    }
}
