package sortingalgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SortableTest {
    public static void main(String[] args) {
        
        int[] arr = {91,34,15,7,96,32,22,33};
        Sortable sorter = null;
        Scanner sc = new Scanner(System.in);

        int choice;
        while(true){
            System.out.println("1) Bubble Sort\n2) Merge Sort\n3) QuickSort" +"\nEnter choice :");
            choice= sc.nextInt();
            if(choice<1 || choice >3){
                System.out.println("\nEnter correct value");
                continue;
            }
            break;
        } 
        sc.close();

        System.out.println("Before Sorting : \n" + Arrays.toString(arr));
        System.out.println("After Sorting :");
        switch (choice) {
            case 1:
                sorter = new BubbleSort();
                break;
            
            case 2:
                sorter = new MergeSort();
                break;
            case 3:
                sorter = new QuickSort();
                break;
            default:
                break;
        }
        sorter.sort(arr);
    }
}
