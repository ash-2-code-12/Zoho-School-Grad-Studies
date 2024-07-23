// 3. Write a program to reverse the words in a sentence.


import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence to be reversed :");
        String originalStr = sc.nextLine();
        System.out.println(reverseWords(originalStr));
        sc.close();
    }

    public static String reverseWords(String originalStr){
        String[] words = originalStr.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i=words.length-1; i>=0; i--){
            result.append(words[i]);
            if(i>0){
                result.append(" ");
            }
        }
        return result.toString();
    }
}
