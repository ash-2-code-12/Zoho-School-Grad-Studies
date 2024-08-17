package sortingalgorithms;

import java.util.Arrays;

public class QuickSort implements Sortable {

    @Override
    public void sort(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int start, int end){

        if(start<end){
            int partition = placeAtPosition(nums, start, end);
            quickSort(nums, start, partition-1);
            quickSort(nums, partition+1, end);
        }

    }
    
    public static int placeAtPosition(int[] nums, int start, int end){
        int pivot = nums[start];
        int i = start;
        int j = end;    // equal to handle duplicate pivot values
        while(i<j){     // ↑
            while(nums[i] <= pivot && i<=end-1)i++;     //find index of the element from left greater than pivot

            while(nums[j] > pivot && j>= start+1) j--;  //find index of the eleme from right lesser than pivot

            if(i<j) swap(nums, i, j); //swap the values at the positions found
            
        }
        swap(nums, start, j);       // is the postion at which the pivot has to be placed and will contain a lesser value than pivot
        
        return j;   //pivot placed index will be the partition index

    }

    public static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}
// public static void main(String[] args) {
//     Sortable a = new QuickSort();
//     a.sort(new int[]{124, 2, 5, 8125, 7, 3, 664, 24, 7, 3});
// }