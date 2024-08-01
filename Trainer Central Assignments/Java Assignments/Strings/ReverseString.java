// 2. Write a program to reverse the characters of a string.


import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String inputString = sc.nextLine();
        sc.close();
        
        System.out.println(reverseStr(inputString));

    }
    public static String reverseStr(String inputString){
        StringBuilder reverse = new StringBuilder();
        for(int i=inputString.length()-1; i>=0; i--){
            reverse.append(inputString.charAt(i));
        }
        return reverse.toString();
    } 
}
