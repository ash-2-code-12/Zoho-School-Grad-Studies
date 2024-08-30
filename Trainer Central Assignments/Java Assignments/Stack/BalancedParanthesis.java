// 3. Create a Java program that checks if a string containing parentheses is balanced using a `Stack`. 
// For example, the input "(())" is balanced, but the input "(()" is not.

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the paranthesis string :");
        String input = sc.nextLine();
        sc.close();

        System.out.println("The given input has : " + (checkValid(input) == 1? "Balanced Paranthesis" : "Unbalanced Paranthesis"));


    }

    private static int checkValid(String input){
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == '('){
                stk.push(input.charAt(i));
            }
            else if(input.charAt(i) == ')'){
                if(stk.isEmpty()) return -1;
                stk.pop();
            }
            else{
                return -1;
            }
        }
        return stk.isEmpty()? 1: -1;
    }

}
