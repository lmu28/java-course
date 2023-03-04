package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx2 {

    public static void main(String[] args) {


        String s1 = "A5BAD +WABABABABbbAB+ABAE / WABAB2ABAABCGABCH";


/**
 * \D - неЦифра
 * \w - буква,цифра или _
 * \W - не(\w)
 * \S - не пробел
 *
 * \A - Выражение в начале строки
 * \Z - выражение в конце строки
 * \b - граница слова или числа
 * \B - граница не слова и не числа
 *
 *
 */
        Pattern pattern1 = Pattern.compile("\\D"); // шаблон
        Pattern pattern2 = Pattern.compile("W(AB){2,}"); //W, а потом как минимум 2 повторения AB




        Matcher matcher = pattern2.matcher(s1); // сверяем шаблон с исходной строкой

        while(matcher.find()){ // ищем все совпадения
            System.out.println("Position: " + matcher.start() + " " + matcher.group());
        }

    }
}
