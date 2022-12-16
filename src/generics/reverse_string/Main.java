package generics.reverse_string;

public class Main {
    public static void main(String[] args) {

        StringManipulation str1 = new StringManipulation("Hello world!");
        StringManipulation str2 = new StringManipulation("Hello world! I am Max.");
        StringManipulation str3 = new StringManipulation(".xaM ma I !dlrow olleH");
        str1.reverse();
        System.out.println(str1.getReverseStr());

        str2.reverse();
        System.out.println(str2.getReverseStr());

        str3.reverse();
        System.out.println(str3.getReverseStr());

    }
}
