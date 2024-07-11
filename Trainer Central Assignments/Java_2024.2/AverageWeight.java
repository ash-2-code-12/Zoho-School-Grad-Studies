// 5. Write a program that calculates the average weight of 10 people. 
// Use descriptive and meaningful variable names following Java naming conventions. 
// Use proper datatypes for the variables.

import java.util.Scanner;

public class AverageWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Weights as Prompted:");

        float totalWeight = 0.0F;
        int i =1;
        
        while(i<=10){
            System.out.print("\nEnter weight : ");
            totalWeight+=sc.nextFloat();
            i++;
        }
        
        System.out.println("The Average Weight is : "+ totalWeight/10);
        sc.close();
    }
}
