// 6. Write a program to find the sum of even numbers only in a given array. Use continue.
import java.util.Scanner;

public class SumEvenIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        int i;
        for(i=0; i<n; i++){
            System.out.print("\nEnter array element : ");
            nums[i] = sc.nextInt();
        }
        sc.close();
        int sum = 0;
        for(i=0; i<n; i++){
            if(i%2!=1) continue;
            sum+=i;
        }
        System.out.println("The sum of numbers in the even indexes : "+sum);
        
    }
}
