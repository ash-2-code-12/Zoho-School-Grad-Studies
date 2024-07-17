import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Table : ");
		int numX = sc.nextInt();
        System.out.println("Multiplication Table of : " + numX);
		for (int i = 1; i <= 12; i++) {
			System.out.println(numX +" X "+ i +" = "+ (i*numX));
		}
        sc.close();
    }
}
