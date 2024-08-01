package birdwatcher;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BirdWatcher bW1 = new BirdWatcher(new int[]{ 2, 5, 0, 7, 4, 1 });
        
        System.out.println("Last Week : "+ Arrays.toString(bW1.getLastWeek()));

        System.out.println("Today value : " + bW1.getToday());

        bW1.incrementTodaysCount();

        System.out.println("Is the there a Day without birds : " + bW1.hasDayWithoutBirds());

        System.out.println("Enter no. of days to count birds : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("The count for first " + n + " days : " + bW1.getCountForFirstDays(n));

        System.out.println("The number of busy days : " + bW1.getBusyDays() + "\n------------------------END---------------------------");

    }

}
