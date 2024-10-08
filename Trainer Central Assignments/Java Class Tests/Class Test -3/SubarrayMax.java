// 1.Given an array and an integer K, find the maximum for each and every contiguous subarray of size K.
// Example-1 :
// Input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3
// Output: 3 3 4 5 5 5 6
// Explanation: Maximum of 1, 2, 3 is 3
// Maximum of 2, 3, 1 is 3
// Maximum of 3, 1, 4 is 4
// Maximum of 1, 4, 5 is 5
// Maximum of 4, 5, 2 is 5
// Maximum of 5, 2, 3 is 5
// Maximum of 2, 3, 6 is 6
// Example-2 :
// Input: arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}, K = 4
// Output: 10 10 10 15 15 90 90
// Explanation:
// Maximum of first 4 elements is 10, similarly for next 4 elements
// (i.e from index 1 to 4) is 10, So the sequence generated is 10 10 10 15 15 90 90

// import java.util.Scanner;

public class SubarrayMax{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the array size :");
        // int n = sc.nextInt();
        // int[] input = new int[n];
        // for(int i=0; i<n; i++){
        //     System.out.println("Enter array element: ");
        //     input[i] = sc.nextInt();

        // }
        // System.out.println("Enter the k value : ");
        // int k = sc.nextInt();
        // sc.close();
        // findResult(input, k);
        findResult(new int[]{8, 5, 10, 7, 9, 4, 15, 12, 90, 13}, 4);
    }

    public static void findResult(int[] input, int k){
        if (k <= 0 || input.length < k) {
            System.out.println("Invalid inputs");
            return;
        }
        int n = input.length;
        for (int i = 0; i <= n - k; i++) {
            int max = input[i];
            for (int j = i+1; j < i+k; j++) {
                if (input[j] > max) {
                    max = input[j];
                }
            }
            System.out.print(max + " ");
        }
    }
}
