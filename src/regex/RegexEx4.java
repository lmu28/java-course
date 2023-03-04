package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx4 {

    public static void main(String[] args) {

        //0-255
// [1-2]?[1-9]?[0-9]


        // [0-9] | [1-9][0-9] | 1[0-9][0-9] |2[0-4][0-9] | 25[0-5]
        //([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])


        Pattern ipv4 = Pattern.compile("(\\b([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\b\\.){3}\\b([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\b");


        String tests = "128.0.0.0\n" +
                "172.27.0.0\n" +
                "172.31.255.255\n" +
                "172.31.256.256\n" +
                "223.255.255.\n" +
                "300.168.0.1\n" +
                "192.256.0.1\n" +
                "203.0.113.1\n" +
                "172.16.0.1\n" +
                "255.256.255.0\n" +
                "172.32.0.1\n" +
                "100.64.0.1\n" +
                "10.0.0.1\n" +
                "223.255.255.255\n" +
                "192.168.0.1\n" +
                "128.0.0.01\n" +
                "100.64.0.1000\n" +
                "255.255.255.0\n" +
                "203.0.113.256\n" +
                "172.27.0.0.0";

        Matcher matcher = ipv4.matcher(tests);

        while (matcher.find()){
            System.out.println(matcher.group());
        }




    }
}