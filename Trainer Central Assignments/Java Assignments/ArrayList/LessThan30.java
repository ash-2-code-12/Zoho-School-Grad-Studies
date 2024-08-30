// 2. Create a Java program that initializes an `ArrayList` of integers with the values {10, 20, 30, 40, 50}. 
// Use an iterator to iterate through the list and remove all elements greater than 30. Print the modified list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class LessThan30 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,20,30,40,50));

        Iterator<Integer> itr = numbers.iterator();
        
        while(itr.hasNext()){
            int num = itr.next();
            if(num > 30){
                itr.remove();
            }
        }

        System.out.println(numbers);

    }
}
