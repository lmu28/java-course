package generics.reverse_string;

import java.util.Scanner;

public class StringManipulation {
    private String sourceStr;
    private String reverseStr = null;

    public StringManipulation(String str){
        this.sourceStr = str;
    }

    public StringManipulation(Scanner scanner){
        System.out.println("input str: ");
        this.sourceStr = scanner.nextLine();
    }

    public String getSourceStr() {
        return sourceStr;
    }

    public String getReverseStr() {
        return reverseStr;
    }



    public static String reverseByChars(String str){
        char[] characters = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = characters.length-1; i >= 0; i--){
            stringBuilder.append(characters[i]);
        }
        return(stringBuilder.toString());


    }
    public void reverse(){
        String[] words = sourceStr.split("\\s");

        for(int i = 0; i < words.length; i++){
            words[i] = StringManipulation.reverseByChars(words[i]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = words.length-1; i >= 0; i--){
            stringBuilder.append(words[i]);
            stringBuilder.append(" ");
        }
        this.reverseStr = stringBuilder.toString().trim();

    }


}
