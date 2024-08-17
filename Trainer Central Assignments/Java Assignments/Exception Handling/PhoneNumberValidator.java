// 3. Create a program to get phone number from the user and throw InputMismatchException if the user enters non-number input

import java.util.Scanner;
import java.util.InputMismatchException;

public class PhoneNumberValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter your phone number: ");
        
        try {
            // Read user input as an integer
            long phoneNumber = scanner.nextLong();
            
            // If input is successfully read as a long, it is a valid number
            System.out.println("Phone number entered: " + phoneNumber);
        } catch (InputMismatchException e) {
            // Handle the case where the input is not a valid number
            System.out.println("InputMismatchException: Invalid phone number format.");
        } finally {
            // Clear the invalid input if InputMismatchException occurs
            scanner.nextLine(); // Consume the invalid input
            scanner.close();
        }
    }
}
