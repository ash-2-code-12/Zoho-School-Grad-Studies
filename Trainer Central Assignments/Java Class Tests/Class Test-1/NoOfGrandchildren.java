import java.util.Arrays;
import java.util.Scanner;

public class NoOfGrandchildren{
    public static void main(String[] args) {
        
        String[][] family = getInput2DArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String grandpa = sc.nextLine();
        int totalGrandsons = 0;
        //Get the children of gradpa --> fathers 
        for(String[] pair : family){
            if(pair[1].equals(grandpa)){
                totalGrandsons += getNoOfChildren(family, pair[0]);
            }
        }
        // calculate no of children of fathers --> grandsons of grandpa
        System.out.println(totalGrandsons);
        sc.close();

    }
    public static String[][] getInput2DArray(){
        String[][] family = {
            {"Udhiran", "Sendhan"},
            {"Udhiran", "Sendhan"},
            {"Udhiran", "Sendhan"},
            {"Paari", "Karikalan"},
            {"Udhiran", "Sendhan"},
            {"Sendhan", "Arulmozhi"},
            {"Karikalan", "Sendhan"}
        };
        return family;
    }
    public static int getNoOfChildren(String[][] family, String father){
        int sonsCount =0;
        for(String[] pair : family){
            if(father.equals(pair[1])){
                sonsCount++;
            }
        }
        return sonsCount;

    }
}