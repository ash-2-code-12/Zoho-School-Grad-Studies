import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int total = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {

            int value = getVal(s.charAt(i));
            if(value==0 || (i<length -1 && getVal(s.charAt(i+1))==-1)){
                return -1;
            }

            if (i < length - 1 && value < getVal(s.charAt(i + 1))) {
                char first = s.charAt(i);
                char sec = s.charAt(i+1);

                if((first=='I' && (sec=='V' || sec=='X')) || (first=='X' && (sec=='L'||sec=='C')) || (first=='C' && (sec=='D' || sec=='M') ) ){
                    total -= value;
                }
                else{
                    return -2;
                }
                    
            } else {
                total += value;
            }

        }

        return total;
    }

    private static int getVal(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }

    public static void main(String[] args) {
        // System.out.println("Enter the input string : ");
        // Scanner sc = new Scanner(System.in);
        // String input = sc.nextLine();
        // sc.close();
        String input = "XVX";
        int result = romanToInt(input);
        if(result==-2){
            System.out.println("invalid sequence");
        }
        else{
            System.out.println(result==-1? "Invalid characters": input+" in integer form : "+ result);
        }
             
    }
}
