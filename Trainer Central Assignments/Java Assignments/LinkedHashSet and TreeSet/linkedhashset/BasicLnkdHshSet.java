package linkedhashset;
// 1. **Basic LinkedHashSet Operations**:
//    Write a Java program that creates a `LinkedHashSet` of integers. 
// Add the numbers 5, 10, 15, 20, and 25 to the set. Attempt to add the number 15 again. 
// Print all elements in the set and observe the order and duplicates.

import java.util.Arrays;
import java.util.LinkedHashSet;

public class BasicLnkdHshSet {

    public static void main(String[] args) {
        
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();

        set1.addAll(Arrays.asList(5,10,15,20,25));

        System.out.println("Attempting to add 15 again : " + set1.add(15));

        System.out.println(set1);
    }
    
}