// 3. Write a Java program that creates an `ArrayList` of characters. 
// Add ten different characters to the list. 
// Write a method that takes a character as an argument and returns the index of the character in the list. 
// If the character is not found, return -1.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FindCharacter {
    
    public static void main(String[] args) {
        
        ArrayList<Character> chars = new ArrayList<>();

        chars.add('a');
        chars.add('s');
        chars.add('d');
        chars.add('f');
        chars.add('g');
        chars.add('h');
        chars.add('j');
        chars.add('k');
        chars.add('l');
        chars.add('q');

        Iterator<Character> itr = chars.iterator();

        Scanner sc = new Scanner(System.in);
        char arg = sc.next().charAt(0);
        sc.close();
        
        int index = 0;
        while(itr.hasNext()){
            if(itr.next() == arg){
                break;
            }
            index++;
        }
        if(index==chars.size()){
            System.out.println(-1);
        }
        else{
            System.out.println(index);
        }

    }

}
