import java.util.Scanner;

public class ScoreAndGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the score : ");
		int score = sc.nextInt();
		System.out.print("Student Grade : ");
		if(score>=90) System.out.print("O");
		else if(score>=80)  System.out.print("A+");
		else if(score >=70) System.out.print("A");
		else if(score >=60) System.out.print("B");
		else if(score >=50) System.out.print("C");
		else if(score >=40) System.out.print("D");
		else  System.out.print("F");
    }
}
