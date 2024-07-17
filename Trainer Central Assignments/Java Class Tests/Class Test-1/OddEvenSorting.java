import java.util.Arrays;
import java.util.Scanner;

public class OddEvenSorting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // System.out.println("Array Size :");
        // int n = sc.nextInt();
        // int[] nums = new int[n];
        // //get input array
        
        // for(int i=0; i<n; i++){
        //     System.out.println("Enter number in array");
        //     nums[i] = sc.nextInt();
        // }
        int[] nums ={12, 3,45,-2,-77,30,12,3};
        int n =nums.length;

        //sort odd numbers in decreasing order using selection sort
        for(int i=0; i<n; i+=2){
            int max = nums[i];
            int index = i;
            for(int j=i; j<n; j+=2){
                if(nums[j] > max){
                    max = nums[j];
                    index = j;
                }
            }
            if(index != i){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }
        //sort even numbers in increasing order using selection sort
        for(int i=1; i<n; i+=2){
            int min = nums[i];
            int index = i;
            for(int j=i; j<n; j+=2){
                if(nums[j] < min){
                    min = nums[j];
                    index = j;
                }
            }
            if(index != i){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }

        System.out.println(Arrays.toString(nums));


    }
}
