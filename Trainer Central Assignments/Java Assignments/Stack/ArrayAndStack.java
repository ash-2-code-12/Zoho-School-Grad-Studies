// 4. Write a Java program that initializes a `Stack` of doubles with the values {1.1, 2.2, 3.3, 4.4, 5.5}. 
// Convert the stack to an array and print the array. 
// Then, create a new stack from the array and print the elements of the new stack.

import java.util.Arrays;
import java.util.Stack;

public class ArrayAndStack {
    
    public static void main(String[] args) {
        
        Stack<Double> dbls = new Stack<>();
        dbls.addAll(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));

        Double[] doublesArray = dbls.toArray(new Double[0]);
        System.out.println("Doubles Array : " + Arrays.toString(doublesArray));

        Stack<Double> doublesStack = new Stack<>();
        doublesStack.addAll(Arrays.asList(doublesArray));
        System.out.println("doubles Stack : " + doublesStack);

    }

}
