// 2.Add two numbers in the given base without converting into base. Sample Input-1
// 123 13 4
// Sample Output-1 202
// Sample Input-2 1010 11001 2
// Sample Output-2 100011

// import java.util.Scanner;

public class BaselessAddition {
    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter num1 : ");
        // String num1 = sc.nextLine();
        // System.out.println("Enter num2 : ");
        // String num2 = sc.nextLine();
        // System.out.println("Enter the base : ");
        // String base = sc.nextLine();
        // sc.close();
        String num1 = "313";
        String num2 = "223";
        int base = 4;

        String result = num1.length()> num2.length()? getResult(num1, num2, base) : getResult(num2, num1, base);
        System.out.println(Integer.parseInt(result));
    }

    public static String getResult(String num1, String num2, int base){
        
        while(num1.length()>num2.length()){
            num2= '0'+num2;
        }

        String result = "";
        int carry =0; 
        for(int i=num1.length()-1; i>=0; i--){

            int d1 = num1.charAt(i) - '0';
            int d2 = num2.charAt(i) - '0';

            int sum = d1 + d2 + carry;
            carry = sum/base;
            int lastDigit = sum%base;
            result = lastDigit + result;
        }

        if(carry>0){
            result = carry + result;
        }

        return result;
    }

}
