package lambda_expression;

public class Student {
    private String name;
    private char sex;
    private int age;
    private double averageScore;

    private int course;

    public Student(String name, char sex, int age,int course ,double averageScore) {
        this.course = course;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.averageScore = averageScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", averageScore=" + averageScore +
                ", course=" + course +
                '}';
    }


}
