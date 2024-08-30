// 4. Write a Java program that creates a `LinkedList` of characters with the values {'A', 'B', 'C', 'D', 'E'}. 
// Write a method to reverse the linked list and print the reversed list.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseList {
    
    public static void main(String[] args) {
        
        LinkedList<Character> chars = new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));

        System.out.println("Before Reversing : " + chars);
        reverseList(chars);
        System.out.println("After Reversing : " + chars);

    }

    private static void reverseList(LinkedList<Character> chars){

        LinkedList<Character> reversed = new LinkedList<>();

        ListIterator<Character> itr = chars.listIterator(chars.size());
        while(itr.hasPrevious()){
            reversed.add(itr.previous());
        }
        chars.clear();
        chars.addAll(reversed);

    }

}
