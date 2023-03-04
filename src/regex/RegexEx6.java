package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx6 {

    public static void main(String[] args) {
        String s = "12345678123456781234567\n" +
                "86430678123456785649638\n" +
                "64928475123456785984736";

        //Pattern pattern = Pattern.compile("\\d{23}");
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})", Pattern.DOTALL);// 7 групп (от 1...7)
        Matcher matcher = pattern.matcher(s);

        //  String s2 = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");//группы
        // System.out.println(s2);
        while (matcher.find()) {
            System.out.println(matcher.group(7)); // смотрим только 7 группу
        }


    }
}
