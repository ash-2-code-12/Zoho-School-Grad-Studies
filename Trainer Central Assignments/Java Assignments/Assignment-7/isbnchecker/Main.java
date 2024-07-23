package isbnchecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Isbn Number : ");
        String isbnNumber = sc.nextLine(); //3-598-21508-8  3-598-21508-9  3-598-21507-X  ABCDEFG3-598-21507-XQWERTYUI  359821507X 
        sc.close();

        IsbnNumber isbnObject = new IsbnNumber(isbnNumber);
        isbnObject.checkValidity();
    }
}
