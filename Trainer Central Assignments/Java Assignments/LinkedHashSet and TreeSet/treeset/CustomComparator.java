package treeset;
// 2. **TreeSet with Custom Comparator**:
//    Write a Java program that creates a `TreeSet` of strings with a custom comparator
//  that orders strings by their length. 
// Add the strings {"banana", "apple", "cherry", "date"} to the set. 
// Print the elements to verify the custom ordering.

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class CustomComparator {
    
    public static void main(String[] args) {
        
        TreeSet<String> fruits = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                
                return s1.length()>=s2.length()  ? 1: -1;

            }
        });

        fruits.addAll(Arrays.asList("banana", "apple", "cherry", "date"));

        Iterator<String> itr = fruits.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }

}
