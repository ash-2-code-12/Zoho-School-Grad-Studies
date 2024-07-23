// 5. Write a program to capitalize the first letter of each words in a sentence.


import java.util.Scanner;

public class Capitalise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to capitalise : ");
        String inputStr = sc.nextLine();
        sc.close();
        System.out.println("Capitalied String : "+ capitalizeWords(inputStr));

    }

    public static String capitalizeWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        char[] chars = sentence.toCharArray();
        boolean capitalizeNext = true;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isWhitespace(chars[i])) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                chars[i] = Character.toUpperCase(chars[i]);
                capitalizeNext = false;
            } else {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }

        return new String(chars);
    }
}
