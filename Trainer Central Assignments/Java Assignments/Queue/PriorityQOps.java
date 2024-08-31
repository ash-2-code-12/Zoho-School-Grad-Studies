// 2. **PriorityQueue Operations**:
// Write a Java program that creates a `PriorityQueue` of integers. 
// Add the numbers 5, 1, 3, 2, and 4 to the queue. 
// Print the head of the queue using the `peek` method, 
// then remove the head and print the entire queue to show the new order.

import java.util.PriorityQueue;

public class PriorityQOps {
    
    public static void main(String[] args) {
        
        PriorityQueue<Integer> nums = new PriorityQueue<>();

        nums.add(5);
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(4);

        System.out.println("Head of the queue (using peek) : " + nums.peek());

        nums.poll();

        System.out.println("After removing head : " + nums);

    }

}
