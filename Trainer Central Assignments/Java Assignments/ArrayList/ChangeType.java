// 4. Write a Java program that initializes an `ArrayList` of strings with the values {"apple", "banana", "cherry"}. 
// Convert the `ArrayList` to an array, print the array, then convert the array back to an `ArrayList` and print the `ArrayList`.

import java.util.ArrayList;
import java.util.Arrays;

public class ChangeType {
    
    public static void main(String[] args) {
        
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        String[] fruitsArray = fruits.toArray(new String[0]);

        System.out.println("As Array : " + Arrays.toString(fruitsArray));

        ArrayList<String> fruitsList = new ArrayList<>(Arrays.asList(fruitsArray));

        System.out.println("As List : " + fruitsList);


    }

}
