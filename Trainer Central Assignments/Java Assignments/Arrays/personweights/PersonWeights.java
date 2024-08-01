package personweights;
// 4. Initialize a jagged array with N rows with weights of N persons.
//  Each person can have different number of weights. 
//  Write 
//       a. A function to enter the weight of any user at any time. 
//       b. A function to calculate the minimum weight of the nth person.

import java.util.Arrays;
import java.util.Scanner;

public class PersonWeights {
    static Scanner sc = new Scanner(System.in);
    int[][] weightsBook ;
    int noOfRecords;
    boolean initialised = false;

    public PersonWeights(int n){
        this.noOfRecords = n;
        this.weightsBook = new int[n][];
    }

    public void enterNewWeight(){
        if(!initialised)return;
        System.out.println("\nAvailable id range: 0 to " + this.weightsBook.length);
        System.out.print("Enter the Id(index) of the person : ");
        int id = sc.nextInt();

        if(id<0 || id>=this.weightsBook.length){
            System.out.println("Invalid Id");
            return;
        }

        int[] newRecord = new int[this.weightsBook[id].length+1];
        for(int i=0; i<newRecord.length-1; i++){
            newRecord[i] = this.weightsBook[id][i];
        }
        System.out.print("Enter the new weight : ");
        newRecord[newRecord.length-1] = sc.nextInt();
        this.weightsBook[id] = newRecord;
        System.out.println("\n-------Updated-------\n");
        
    }

    public void findMinWeight(){
        if(!initialised)return;

        System.out.print("\nEnter the Id(index) of the person : ");
        int id = sc.nextInt();
        
        if(id<0 || id>=this.weightsBook.length){
            System.out.println("--------Invalid Id-------\n");
            return;
        }
        if(this.weightsBook[id].length==0){
            System.out.println("-----------No records found.---------\n");
            return;
        }

        int min = this.weightsBook[id][0];
        for(int i=0; i<this.weightsBook[id].length; i++){
            min = Math.min(min, this.weightsBook[id][i]);
        }
        System.out.println("\n-------The minimum weight of person " + id + " in records : " + min+"--------\n");

    }

    public void initialiseBook(){
        System.out.println("\nLets enter some weights");
        for(int i=0; i<this.noOfRecords; i++){
            System.out.print("\nEnter the no of weights for person "+i+" : ");
            int x = sc.nextInt();
            int[] personWeights = new int[x];
            for(int j=0; j<x; j++){
                System.out.print("Enter the weight : ");
                personWeights[j] = sc.nextInt();
            }
            this.weightsBook[i] = personWeights;
        }
        this.initialised = true;
        System.out.println("------The book has been initialised.------\n");
    }

    public void printRecords(){
        System.out.println("\nPersonId     Weights");
        for(int i=0; i<this.weightsBook.length; i++){
            System.out.println("   "+ i + "       " + Arrays.toString(this.weightsBook[i]));
        }
        System.out.println("\n------Record Ends------\n");
    }
}
