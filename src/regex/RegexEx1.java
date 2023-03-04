package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {

    public static void main(String[] args) {

        String s = "Anna Ivanova, Russia, Lenina St., House 15A, +7-999-123-45-67, anna.ivanova@email.com, 123456.\n" +
                "John Smith, USA, Main Street, House 12, +1-555-123-45-67, john.smith@email.com, 90210.\n" +
                "Alexander Petrov, Ukraine, Kievskaya St., House 25, +380-67-123-45-67, alex.petrov@email.com, 61000.\n" +
                "Maria Garcia, Spain, Calle Mayor, House 7, +34-912-345-67-87, maria.garcia@email.com, 28013.\n" +
                "Ahmed Hassan, Egypt, Mohamed Ali Street, House 10, +20-100-123-45-67, ahmed.hassan@email.com, 12311.";


        Pattern word = Pattern.compile("\\w+");
        // состоит из 1 или двух цифр (слева и справа нет ни одной цифры или буквы)
        Pattern numbers = Pattern.compile("\\b\\d{1,2}[A-Z]?\\b"); // \\b - граница ()
        Pattern phoneNumber = Pattern.compile("\\+\\d{1,3}-\\d{2,3}-\\d{2,3}-\\d{2,3}-\\d{2,3}");
        Pattern email = Pattern.compile("[\\w \\.]{3,20}@\\w{3,6}\\.[a-z]{2,5}");

        Pattern pattern1 = Pattern.compile("\\A\\+\\d{1,2}\\b");



        Matcher matcher = numbers.matcher(s);
       // matcher = pattern1.matcher(s);
        while (matcher.find()) {
            String res = matcher.group();
            Pattern resPattern = Pattern.compile("\\d{1,2}");
            Matcher resMatcher = resPattern.matcher(res);
            resMatcher.find();
            System.out.println(resMatcher.group());
        }

    }
}
