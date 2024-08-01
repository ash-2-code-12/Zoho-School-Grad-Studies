// 2. Write a program to find transpose of a matrix


import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranpose {
    public static void main(String[] args) {
        
        // int[][] matrix = getMatrix();

        int[][] matrix = {{1,2}, {3,4}, {5,6}, {7,8}};

        System.out.println("The original matrix :");
        printMatrix(matrix);

        int[][] result = transpose(matrix);
        System.out.println("The transpose : ");
        printMatrix(result);
        
    }

    public static int[][] transpose(int[][] matrix){
        int[][] result = new int[matrix[0].length][matrix.length];

        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                result[i][j] = matrix[j][i];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix){
        
        System.out.println("[");
        for(int i=0; i<matrix.length; i++){
            System.out.println("  "+Arrays.toString(matrix[i]));
        }
        System.out.println("]");

    }

    public static int[][] getMatrix(){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows count : ");
        int r = sc.nextInt();

        System.out.println("\nEnter the cols count : ");
        int c = sc.nextInt();
        
        int[][] matrix = new int[r][c];
        System.out.print("\nLets fill the matrix : ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.println("Value at ("+i+", "+j+") : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        return matrix;

    }
}
