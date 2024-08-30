// 3. Write a Java program that creates a `LinkedList` of integers. 
// Add the numbers 1 to 10 to the list. Then, remove the third element (index 2) and the last element from the list. 
// Print the resulting list.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class SecondAndLast {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        int index =0;
        ListIterator<Integer> itr = nums.listIterator();

        while(itr.hasNext()){
            itr.next();
            if(index == 2 || index == nums.size()){
                itr.remove();
            }
            index++;
        }
        System.out.println(nums);

    }

}
