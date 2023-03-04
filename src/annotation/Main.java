package annotation;

import java.lang.annotation.*;

public class Main {

    public static void main(String[] args) {

        Class xiomiClass = Xiomi.class;
        Annotation annotation = xiomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation;

        System.out.println(sm1.OS() + " " + sm1.yearOfProduction());



    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{

    String OS() default "Android";
    int yearOfProduction() default 2020;

}

@SmartPhone(OS = "Android",yearOfProduction = 2023)
class Xiomi{
    String model;
}
@SmartPhone(OS = "IOS",yearOfProduction = 2023)
class Iphone{
    String model;
    double price;
}
