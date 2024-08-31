// 1. **Iterate Through a Queue**:
// Create a Java program that initializes a `Queue` of strings 
// with the values {"apple", "banana", "cherry", "date"}. 
// Use an iterator to print each element in the queue.
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterateQueue {
    
    public static void main(String[] args) {
        
        Queue<String> fruits = new LinkedList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");

        Iterator<String> itr = fruits.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
    }

}
