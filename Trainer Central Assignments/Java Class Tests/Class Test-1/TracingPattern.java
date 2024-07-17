import java.util.Arrays;
import java.util.Scanner;

public class TracingPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows count :");
        int rows = sc.nextInt();
        System.out.println("Enter cols count :");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        matrix[0][cols - 1] = 1;
        int curVal = 2;
        downTrace(0, cols - 1, curVal, matrix, rows, cols);
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
        sc.close();
    }

    public static void downTrace(int i, int j, int curVal, int[][] matrix, int rows, int cols) {
        int currI = i + 1;
        int currJ = j;
        if (currI < rows) {
            matrix[currI][currJ] = curVal++;
            if (currI == rows - 1 && currJ == 0) {
                return;
            } else if (j == cols - 1) {
                upleftTrace(currI, currJ, curVal, matrix, rows, cols);
            } else {
                downrightTrace(currI, currJ, curVal, matrix, rows, cols);
            }
        }
    }

    public static void upleftTrace(int i, int j, int curVal, int[][] matrix, int rows, int cols) {
        int currI = i - 1;
        int currJ = j - 1;
        while (currI >= 0 && currJ >= 0) {
            matrix[currI][currJ] = curVal++;
            currI = currI - 1;
            currJ = currJ - 1;
        }
        if (currI < 0) {
            leftTrace(currI + 1, currJ + 1, curVal, matrix, rows, cols);
        } else {
            downTrace(currI + 1, currJ + 1, curVal, matrix, rows, cols);
        }
    }

    public static void downrightTrace(int i, int j, int curVal, int[][] matrix, int rows, int cols) {
        int currI = i + 1;
        int currJ = j + 1;
        while (currI < rows && currJ < cols) {
            matrix[currI][currJ] = curVal++;
            currI = currI + 1;
            currJ = currJ + 1;
        }
        if (currI >= rows) {
            leftTrace(currI - 1, currJ - 1, curVal, matrix, rows, cols);
        } else {
            downTrace(currI - 1, currJ - 1, curVal, matrix, rows, cols);
        }
    }

    public static void leftTrace(int i, int j, int curVal, int[][] matrix, int rows, int cols) {
        int currI = i;
        int currJ = j - 1;
        if (currJ >= 0) {
            matrix[currI][currJ] = curVal++;
            if (currI == rows - 1 && currJ == 0) {
                return;
            } else if (currI == 0) {
                downrightTrace(currI, currJ, curVal, matrix, rows, cols);
            } else if (currI == rows - 1) {
                upleftTrace(currI, currJ, curVal, matrix, rows, cols);
            }
        }
    }
}
