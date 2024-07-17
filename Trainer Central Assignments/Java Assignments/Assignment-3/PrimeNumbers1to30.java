// 5. Write a program to print prime numbers between 1 to 30
public class PrimeNumbers1to30{
    public static void main(String[] args) {
        System.out.println("The prime numbers from 1 to 30 are : ");
        for(int i=1; i<=30; i++){
            if(checkPrime(i)){
                System.out.print(i+" ");
            }
        }

    }
    public static boolean checkPrime(int n){
        if( n==1 )return false;
        else if(n==2)return true;
        for(int i = 2; i<=n/2; i++){
            if((n % i)==0){
                return false;
            }
        }
        return true;
    }
}
