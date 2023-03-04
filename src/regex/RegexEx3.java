package regex;

import java.util.regex.Matcher;

public class RegexEx3 {

    public static void main(String[] args) {

        String s = "Anna Ivanova, Russia, Lenina St., House 15, +7-999-123-45-67, anna.ivanova@email.com, 123456.\n" +
                "John Smith, USA, Main Street, House 12, +1-555-123-45-67, john.smith@email.com, 90210.\n" +
                "Alexander Petrov, Ukraine, Kievskaya St., House 25, +380-67-123-45-67, alex.petrov@email.com, 61000.\n" +
                "Maria Garcia, Spain, Calle Mayor, House 7, +34-912-345-67-87, maria.garcia@email.com, 28013.\n" +
                "Ahmed Hassan, Egypt, Mohamed Ali Street, House 10, +20-100-123-45-67, ahmed.hassan@email.com, 12311.";

        String s2 = "annaivanova@email.com";

        boolean result = s2.matches("[\\w \\.]{3,20}@\\w{3,6}\\.[a-z]{2,5}");
        System.out.println(result);

        String[] emails  = s.split("[\\w \\.]{3,20}@\\w{3,6}\\.[a-z]{2,5}");

        //работа для каждой строки в отдельности, а не для всего текста целиком
        for (String str : emails){
            System.out.println(" --- " + str);
        }


    }
}
