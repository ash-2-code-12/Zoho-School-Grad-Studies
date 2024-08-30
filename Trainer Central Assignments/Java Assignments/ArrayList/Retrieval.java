// 1. Write a Java program that creates an `ArrayList` of strings. 
// Add five different fruits to the list, then retrieve and print the third fruit in the list.

import java.util.ArrayList;

public class Retrieval {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Kiwi");
        fruits.add("Lychee");
        fruits.add("Orange");

        String chosen = fruits.get(2);

        System.out.println(chosen);
    }
}