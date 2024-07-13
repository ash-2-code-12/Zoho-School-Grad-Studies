// 3. Get two numbers from user and perform bitwise AND< OR, XOR, left and right shift operations on them.

import java.util.Scanner;

public class BitwiseLogicalOperations {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();
        runBitWiseOperators(num1, num2, sc);
        System.out.println("-------------Exit-------------");
        sc.close();
    }

    public static void runBitWiseOperators(int num1, int num2, Scanner sc){
        //Bitwise AND
        int andResult = num1 & num2;
        System.out.println("Bitwise AND : "+num1+" & "+num2+" = "+ andResult);

        //Bitwise OR
        int orResult = num1 | num2;
        System.out.println("Bitwise OR : "+num1+" | "+num2+" = "+ orResult);

        //Bitwise XOR
        int xorResult = num1 ^ num2;
        System.out.println("Bitwise XOR : "+num1+" ^ "+num2+" = "+xorResult);

        //Bitwise NOT
        int notResult1 = ~num1;
        int notResult2 = ~num2;
        System.out.println("Bitwise NOT : ~"+num1+" = "+notResult1);
        System.out.println("Bitwise NOT : ~"+num2+" = "+notResult2);
        
        //Bitwise Left Shift
        System.out.print("Enter the no. of bits to shift left : ");
        int lBits = sc.nextInt();
        int leftShiftResult = lBits << num1;
        System.out.println("Left Shift : "+ lBits +" << "+num1+ " = "+leftShiftResult);

        //Bitwise Right Shift
        System.out.print("Enter the no. of bits to shift right : ");
        int rBits = sc.nextInt();
        int rightShiftResult = rBits >> num1;
        System.out.println("Right Shift : "+ rBits +" >> "+num1+ " = "+rightShiftResult);

        //Unsigned Right Shift
        System.out.print("Enter the no. of bits to shift unsigned right : ");
        int urBits = sc.nextInt();
        int unsignedRightShiftResult = urBits >> num1;
        System.out.println("Unsigned Right Shift : "+ urBits +" >> "+num1+ " = "+unsignedRightShiftResult);

        System.out.println("-------------Exit-------------");
        
    }

}
