//2. Write a program to calculate Math operations with Math contents initialized in static block.
class Operations{
    public static void main(String[] args) {
        System.out.println("The Operands : " + MathOperations.operand1 +" and "+ MathOperations.operand2);
        System.out.println("The Difference : "+(MathOperations.operand1 + MathOperations.operand2));
        System.out.println("The Sum : "+ (MathOperations.operand1 - MathOperations.operand2));
        System.out.println("The Multiple : "+ (MathOperations.operand1 * MathOperations.operand2));
        System.out.println("The Quotient : "+ (MathOperations.operand1 / MathOperations.operand2));
        System.out.println("The Modulus : "+ (MathOperations.operand1 % MathOperations.operand2));
    }
}



class MathOperations {
    protected static int operand1, operand2;
    static{
        operand1 = 987;
        operand2 = 123;
    }
}
