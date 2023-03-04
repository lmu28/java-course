package regex;

public class RegexEx5 {

    public static void main(String[] args) {
        String s = "Hi!    How    is     it       going with you?";
        System.out.println(s);
        s = s.replace("you","java");
        System.out.println(s);
        s = s.replaceAll("\\s{2,}"," ");
        System.out.println(s);
        s = s.replaceAll("\\bi\\w+",":)");
        System.out.println(s);


    }
}
