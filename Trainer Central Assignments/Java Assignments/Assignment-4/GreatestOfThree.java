// 1. Take three numbers from the user and print the greatest number.

import java.util.Scanner;

public class GreatestOfThree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1 : ");
        
        int a = sc.nextInt();
        System.out.println("Enter num 2 : ");
        
        int b = sc.nextInt();
        System.out.println("Enter num 3 : ");
        
        int c = sc.nextInt();
        System. out. println("Current JVM version - " + System. getProperty("java.version"));

        System.out.println("THe Greatest of Three is :" +(a>b && a>c? a: b>c? b: c));
        
        sc.close();
    }
}
