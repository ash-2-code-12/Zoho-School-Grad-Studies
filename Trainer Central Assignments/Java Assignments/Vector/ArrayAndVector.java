// 3. Write a Java program that initializes a `Vector` of strings with the values {"red", "green", "blue", "yellow"}. 
// Convert the vector to an array, print the array, then convert the array back to a vector and print the resulting vector.

import java.util.Arrays;
import java.util.Vector;

public class ArrayAndVector {
    
    public static void main(String[] args) {
        
        Vector<String> colors = new Vector<>(Arrays.asList("red", "green", "blue", "yellow"));

        String[] colorsArray = colors.toArray(new String[0]);
        System.out.println("Colours Array : " + Arrays.toString(colorsArray));

        Vector<String> colorsVector = new Vector<>(Arrays.asList(colorsArray));
        System.out.println("Colours Vector : " + colorsVector);

    }

}
