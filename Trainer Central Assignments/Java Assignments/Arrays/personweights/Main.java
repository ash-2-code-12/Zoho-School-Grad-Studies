package personweights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of persons : ");
        int n =sc.nextInt();
        
        PersonWeights book1 = new PersonWeights(n);
        book1.initialiseBook();

        if(book1.initialised){
            runEngine(book1, sc);
        }
        
    }

    public static void runEngine(PersonWeights book, Scanner sc){
        outerloop:
        while(true){
            System.out.println("\n   1) Enter new weight for a person .\n   2) Find minimum weight.\n   3) Print Records.\n   4) Exit");
            System.out.println("Enter option :");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    book.enterNewWeight();
                    break;
                case 2:
                    book.findMinWeight();
                    break;
                case 3:
                    book.printRecords();
                    break;
                case 4:
                    break outerloop;
                default:
                    System.out.println("--------Choose a valid option.---------");
                    break;
            }
        }
        System.out.println("--------End--------");
    }
}
