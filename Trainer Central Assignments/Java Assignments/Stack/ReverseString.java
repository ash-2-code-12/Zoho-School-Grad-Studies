// 2. Write a Java program that uses a `Stack` to reverse a string. 
// For example, given the input string "hello", the program should output "olleh".

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input String : ");
        String input = sc.next();
        sc.close();

        Stack<Character> originalStack = new Stack<>();

        for(int i=0; i<input.length(); i++){
            originalStack.push(input.charAt(i));
        }

        StringBuilder reversedString = new StringBuilder();

        while(!originalStack.isEmpty()){
            reversedString.append(originalStack.pop());
        }
        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversedString.toString());

    }

}
