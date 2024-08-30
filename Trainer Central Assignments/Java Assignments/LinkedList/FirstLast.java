// 1. Write a Java program that creates a `LinkedList` of integers. 
// Add the numbers 5, 10, 15, 20, and 25 to the list. 
// Retrieve and print the first and last elements in the list.

import java.util.LinkedList;

public class FirstLast {

    public static void main(String[] args) {
        
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        System.out.println("First element --> " + numbers.get(0) + "\nLast element --> " + numbers.get(numbers.size()-1));


    }
    
}