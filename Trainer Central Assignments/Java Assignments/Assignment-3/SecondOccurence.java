// 4. Write a program to find second occurrence of a given number in an array

import java.util.Scanner;

public class SecondOccurence {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        int i;
        for(i=0; i<n; i++){
            System.out.print("\nEnter array element : ");
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the number to find the second occurence : ");
        int inputEl = sc.nextInt();
        int count = 0;
        for(i=0; i<n; i++){
            if(nums[i] == inputEl){
                count++;
            }
            if(count==2)break;
        }
        System.out.println("The number" + inputEl + "appears for second time at index : "+ i);
        sc.close();
        
    }
}
