import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();
        sc.close();
        getResult(number);

    }

    public static void getResult(int number){

        int count=0, digit=1;
        int curr = number%10;
        long ans = 0;

        while(number>0){

            if(curr == number%10){
                count++;
            }
            else{
                ans += (count * powTen(digit)) + (curr * powTen(digit-1));
                curr = number%10;
                count = 1;
                digit+=2;
            }

            if(number/10>0){
                number=number/10;
            }
            else{
                ans = ans + (count * powTen(digit)) + (curr * powTen(digit-1));
                break;
            }
        }
        System.out.println(ans);

    }

    public static int powTen(int x){
        if(x==0)return 1;
        return 10*powTen(x-1);
    }
}
