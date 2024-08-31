package linkedhashset;
// 3. **Convert LinkedHashSet to Array and Vice Versa**:
//    Write a Java program that creates a `LinkedHashSet` of strings with the values {"red", "green", "blue", "yellow"}. 
// Convert the set to an array and print the array. 
// Then, convert the array back to a `LinkedHashSet` and print the resulting set.

import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrayAndLHS {

    public static void main(String[] args) {
        
        LinkedHashSet<String> colors = new LinkedHashSet<>(Arrays.asList("red", "green", "blue", "yellow"));

        String[] colorsArray = colors.toArray(new String[0]);
        System.out.println("As Array : " + Arrays.toString(colorsArray));

        LinkedHashSet<String> colorsLHS = new LinkedHashSet<>(Arrays.asList(colorsArray));
        System.out.println("As LinkedHashSet : " + colorsLHS );
        
    }
    
}