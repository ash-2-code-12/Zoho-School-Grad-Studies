// 3. Given an array and a threshold value find the o/p Sample Input-1
// {5,8,10,13,6,2}
// threshold = 3 Sample Output-1 count = 17 
// Explanation:
// Number partscounts
// 5{3,2}2
// 8{3,3,2}3
// 10{3,3,3,1}4
// 13{3,3,3,3,1}5
// 6{3,3}2
// 2{2}1

// import java.util.Scanner;

public class ThresholdCounter {
    
    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter array size :");
        // int n= sc.nextInt();
        // int[] input = new int[n];
        // for(int i=0; i<n; i++){
        //     System.out.println("Enter array elements : ");
        //     input[i]=sc.nextInt();
        // }
        // System.out.println("Enter the threshold value :");
        // int t = sc.nextInt();
        // sc.close();
        int[] input = {5, 80, 10, 13, 6, 2};
        int t = 3;
        int total = countParts(input, t);
        System.out.println("count = " + total);
    }

    public static int countParts(int[] input, int t) {
        int totalCount = 0;

        for (int i = 0; i < input.length; i++) {
            int num = input[i];
            int count = num/t == 0 ? num/t : num/t +1;
            totalCount += count;
        }
        
        return totalCount;
    }
}


