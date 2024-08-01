// 3. Write a program to generate the matrix with integers in spiral order. Get size N from the user and generate an NxN spiral matrix.

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix(N) : ");
        int n = sc.nextInt();
        sc.close();

        int[][] spiralMatrix = generateSpiralMatrix(n);

        printMatrix(spiralMatrix);
        
    }

    public static int[][] generateSpiralMatrix(int n){
        
        int[][] spiralMatrix = new int[n][n];
        int val = 1;
        int top = 0, bottom = n-1, left = 0, right = n-1;

        while (val <= n*n) {
            //fill top row
            for(int i=left; i<=right && val<=n*n; i++){
                spiralMatrix[top][i] = val++;
            }
            top++;  //update to point below row

            //fill right col
            for(int i=top; i<=bottom && val<=n*n; i++){
                spiralMatrix[i][right] = val++;
            }
            right--;  //update right to point inner col

            //fill bottom row
            for(int i=right; i>=left && val<=n*n; i--){
                spiralMatrix[bottom][i] = val++;
            }
            bottom--;  //update bottom to point above row

            //fill left row
            for(int i=bottom; i>=top && val<=n*n; i--){
                spiralMatrix[i][left] = val++;
            }
            left++;  //update left to point inner col

        }

        return spiralMatrix;
    }

    public static void printMatrix(int[][] matrix){
        
        // System.out.println("[");
        // for(int i=0; i<matrix.length; i++){
        //     System.out.println("  "+Arrays.toString(matrix[i]));
        // }
        // System.out.println("]");

        String format = "%" + String.valueOf(matrix.length * matrix.length).length() + "d ";

        for(int[] row : matrix){
            for(int value : row){
                System.out.printf(format, value);
            }
            System.out.println();
        }
        

    }

}
