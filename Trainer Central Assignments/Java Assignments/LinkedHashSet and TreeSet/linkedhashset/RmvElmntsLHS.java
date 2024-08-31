package linkedhashset;
// 2. **Remove Elements from LinkedHashSet**:
//    Write a Java program that creates a `LinkedHashSet` of characters with the values {'A', 'B', 'C', 'D', 'E'}. 
// Remove the character 'C' from the set. 
// Check if 'C' is still in the set and print the resulting set.

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RmvElmntsLHS {
    
    public static void main(String[] args) {
        
        LinkedHashSet<Character> set1 = new LinkedHashSet<>(Arrays.asList('A','B','C','D','E'));

        set1.remove('C');

        System.out.println("Is 'C' still present in the set : " + set1.contains('C'));

        System.out.println(set1);

    }

}
