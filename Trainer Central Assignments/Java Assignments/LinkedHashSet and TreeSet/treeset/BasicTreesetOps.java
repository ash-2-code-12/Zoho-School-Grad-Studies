// 1. **Basic TreeSet Operations**:
// Write a Java program that creates a `TreeSet` of integers. 
// Add the numbers 50, 30, 20, 10, and 40 to the set. 
// Print all elements in the set and observe the order.

package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class BasicTreesetOps {

    public static void main(String[] args) {
        
        TreeSet<Integer> tSet = new TreeSet<>();

        tSet.add(50);
        tSet.add(30);
        tSet.add(20);
        tSet.add(10);
        tSet.add(40);

        Iterator<Integer> itr = tSet.iterator();

        while(itr.hasNext()){
            int a = itr.next();
            System.out.println(a);
        }


    }
    
}