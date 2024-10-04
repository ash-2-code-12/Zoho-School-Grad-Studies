// 6.Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
// Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
// Example 1:
// Input: arr = [1,0,2,3,0,4,5,0]
// Output: [1,0,0,2,3,0,0,4]
// Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
// Example 2:
// Input: arr = [1,2,3] Output: [1,2,3]
// Explanation: After calling your function, the input array is modified to: [1,2,3]
// Constraints:
// 1 <= arr.length <= 10^4
// 0 <= arr[i] <= 9

import java.util.Arrays;

public class DuplicateZeros {
    
    public static void main(String[] args) {
        int[] nums1 = {1,0,2,3,0,4};
        getResult(nums1);
        System.out.println(Arrays.toString(nums1));
        rightShift(nums1, 2, 2);
    }

    public static void getResult(int[] nums){

        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==0){
                int curr = nums[i+1];
                nums[i+1]=0;
                rightShift(nums, curr, i+1);
                i++;
            }
        }

    }
    
    public static void rightShift(int[] nums, int curr, int index){
        // System.out.println(Arrays.toString(nums));
        for(int i=index+1; i<nums.length; i++){
            int temp = nums[i];
            nums[i] = curr;
            curr = temp;
        }
        // System.out.println(Arrays.toString(nums));
        

    }

}
