// 1. Create a program that rotates the elements of an array to the right by a specified number of positions. Get the array and the rotation count from the user


import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

    public static void rotateArray(int[] myArray, int positions){ // takes O(n) time ~ {O(n/2) *3} and O(1) space.
        //rotate the whole array:                                 //                       ↑ reverse()'s time *3
        reverse(myArray, 0, myArray.length-1);
        //rotate the first shifted half
        reverse(myArray, 0, positions-1);
        //rote the other half of the array
        reverse(myArray, positions, myArray.length-1);
    }

    public static void reverse(int[] myArray, int start, int end){ // takes O(n/2) time
        while(start<end){
            int temp = myArray[start];
            myArray[start] = myArray[end];
            myArray[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateWithSpace(int[] arr, int k) { // Takes O(n) space and time
        
        int[] result = new int[arr.length];

        int n=arr.length;
        for(int i=0; i<n; i++){
            result[i] = arr[(i+n-k) % n];
        }
        for(int i=0; i<n; i++){
            arr[i] = result[i];
        }
                
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int[] myArray = new int[n];
        System.out.println("Enter array elements :");
        for(int i=0; i<n; i++){
            myArray[i] = sc.nextInt();
        }
        System.out.print("Enter the positions to rotate : ");
        int positions= sc.nextInt();
        sc.close();
        
        System.out.println("\nThe original array : " + Arrays.toString(myArray));
        if(positions%n != 0)rotateArray(myArray, positions%n);
        // if(positions%n != 0)rotateWithSpace(myArray, positions%n);     // easy to understand code but takes O(n) space.
        System.out.println("The rotated array : " + Arrays.toString(myArray));

    }
}