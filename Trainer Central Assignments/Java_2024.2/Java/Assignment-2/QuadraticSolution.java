import java.util.Scanner;

public class QuadraticSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value as Prompted : \n value of a : ");
        int a = sc.nextInt();
        System.out.print("\n value of b : ");
        int b = sc.nextInt();
        System.out.print("\n value of c : ");
        int c = sc.nextInt();

        QuadraticSolution newSolution = new QuadraticSolution();
        newSolution.printQuadraticSolution(a, b, c);
        sc.close();
    }

    public void printQuadraticSolution(int a, int b, int c) {
        double determinant = b * b - 4.0 * a * c;

        if (determinant > 0) {
            double root1, root2;
            root1 = (-b + Math.sqrt(determinant)) / (2.0 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2.0 * a);
            System.out.println("Two real different roots : x = " + root1 + " ; x = " + root2);
        } else if (determinant == 0) {
            double root = -b / (2.0 * a);
            System.out.println("Real and same roots : x = " + root);
        } else {
            double imaginaryPart = Math.sqrt(-determinant) / (2.0 * a);
            double realPart = -b / (2.0 * a);
            System.out.println("Two imaginary solutions : x = " + realPart + " + i" + imaginaryPart);
        }
    }
}
