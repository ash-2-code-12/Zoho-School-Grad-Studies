// 1. Create a program to count vowels in a given string using string functions


import java.util.Scanner;

public class VowelsCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputString = sc.nextLine();

        System.out.println(countVowels(inputString));
        sc.close();
    }

    public static int countVowels(String inputString){
        
        String vowels = "aeiouAEIOU";
        int count = 0;

        for(int i=0; i<inputString.length(); i++){
            if(vowels.indexOf(inputString.charAt(i)) != -1){
                count++;
            }
        }
        return count;
    }

}