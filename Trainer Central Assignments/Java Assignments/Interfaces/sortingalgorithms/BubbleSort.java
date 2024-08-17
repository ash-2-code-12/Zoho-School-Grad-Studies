package sortingalgorithms;

import java.util.Arrays;

public class BubbleSort implements Sortable{

    @Override
    public void sort(int[] nums) {
        for(int i=nums.length-1; i>=1; i--){
            boolean swapped = false;
            for(int j=0; j<=i-1; j++){
                if(nums[j]>nums[j+1]){
                    swapped =true;
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    
    
}
