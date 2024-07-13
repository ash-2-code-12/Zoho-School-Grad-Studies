// 4. Write a Java program that gets a number from the user and displays the name of the weekday. Use enum.

import java.util.Scanner;

public class WeekdayFinder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weekday's number: ");
        byte weekdayNo = sc.nextByte();
        if(weekdayNo<1 || weekdayNo>7){
            sc.close();
            System.out.println("Not a valid number. Enter a number from 1 to 7");
            return;
        }
        WeekDay weekdayName = WeekDay.values()[weekdayNo-1];
        System.out.println("\nThe weekday coresponding to the given weekday number is: "+ weekdayName);
        sc.close();
    }
}
enum WeekDay{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
}