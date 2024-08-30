// 2. Create a Java program that initializes a `LinkedList` of strings with the values {"one", "two", "three", "four", "five"}.
// Use a `ListIterator` to iterate through the list and replace every occurrence of the word "three" with "THREE". Print the modified list.


import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class THREEthree {
    
    public static void main(String[] args) {
        
        LinkedList<String> numStrings = new LinkedList<>(Arrays.asList("one", "two", "three", "four", "five"));

        ListIterator<String> itr = numStrings.listIterator();

        while(itr.hasNext()){
            String curr = itr.next();
            if(curr.equals("three")){
                itr.set("THREE");
            }
        }

        System.out.println(numStrings);

        
    }

}
