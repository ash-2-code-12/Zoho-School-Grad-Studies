// 3. **TreeSet Methods: first(), last(), higher(), and lower()**:
//    Write a Java program that creates a `TreeSet` of doubles
//  with the values {1.1, 2.2, 3.3, 4.4, 5.5}.
//  Use the `first()`, `last()`, `higher()`, and `lower()` methods to retrieve 
// and print the first element, last element, the smallest element 
// strictly greater than 3.3, and the largest element strictly less than 3.3.

package treeset;

import java.util.Arrays;
import java.util.TreeSet;

public class TSetMethods {
    
    public static void main(String[] args) {
        
        TreeSet<Double> dbls= new TreeSet<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));

        double firstElement = dbls.first();
        System.out.println("First element : " + firstElement);

        double lastElement = dbls.last();
        System.out.println("Last element : " + lastElement);

        double higherElement = dbls.higher(3.3);
        System.out.println("Element higher than 3.3 : " + higherElement);

        double lowerElement = dbls.lower(3.3);
        System.out.println("Element lower than 3.3 : " + lowerElement);

    }

}
