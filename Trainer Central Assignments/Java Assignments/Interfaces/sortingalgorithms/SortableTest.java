package sortingalgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SortableTest {
    public static void main(String[] args) {
        
        int[] arr = {91,34,15,7,96,32,22,33};
        Sortable sorter ;
        Scanner sc = new Scanner(System.in);

        int choice;
        while(true){
            System.out.println("1) Bubble Sort\n 2) Merge Sort \n 3)QuickSort" + "\nEnter choice :");
            choice= sc.nextInt();
            if(choice<1 || choice >3){
                System.out.println("\nEnter correct value");
                continue;
            }
            break;
        } 
        sc.close();

        System.out.println("Before Sorting : " + Arrays.toString(arr));
        switch (choice) {
            case 1:
                sorter = new BubbleSort();
                sorter.sort(arr);
                break;
            
            case 2:
                sorter = new MergeSort();
                sorter.sort(arr);
                break;
            case 3:
                sorter = new QuickSort();
                sorter.sort(arr);
                break;
            default:
                break;
        }
    }
}
