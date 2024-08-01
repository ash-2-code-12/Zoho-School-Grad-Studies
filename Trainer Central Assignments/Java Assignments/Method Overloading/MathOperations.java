// 1. Create a Java class MathOperations with methods for basic mathematical operations such as add() , subtract() , multiply() , and divide() .
//  Implement method overloading to allow these operations for integers, doubles, and optionally, other types.

public class MathOperations {
    public static void main(String[] args) {
        add(5, 3);
        add(5.5, 3.3);
        add((short)5, (short)3);
        add((byte)5, (byte)3);
        add(5.5f, 3.3f);
        System.out.println("____________________________________");
        subtract(5, 3);
        subtract(5.5, 3.3);
        subtract((short)5, (short)3);
        subtract((byte)5, (byte)3);
        subtract(5.5f, 3.3f);
        System.out.println("____________________________________");
        multiply(5, 3);
        multiply(5.5, 3.3);
        multiply((short)5, (short)3);
        multiply((byte)5, (byte)3);
        multiply(5.5f, 3.3f);
        System.out.println("____________________________________");
        
        divide(5, 3);
        divide(5.5, 3.3);
        divide((short)5, (short)3);
        divide((byte)5, (byte)3);
        divide(5.5f, 3.3f);
        System.out.println("____________________________________");
    }

    static void add(int a, int b) {
        System.out.println("The sum of " + a + " and " + b + " as integers is: " + (a + b));
    }

    static void add(double a, double b) {
        System.out.println("The sum of " + a + " and " + b + " as doubles is: " + (a + b));
    }

    static void add(float a, float b) {
        System.out.println("The sum of " + a + " and " + b + " as floats is: " + (a + b));
    }

    static void add(short a, short b) {
        System.out.println("The sum of " + a + " and " + b + " as shorts is: " + (a + b));
    }

    static void add(byte a, byte b) {
        System.out.println("The sum of " + a + " and " + b + " as bytes is: " + (a + b));
    }

    static void subtract(int a, int b) {
        System.out.println("The difference of " + a + " and " + b + " as integers is: " + (a - b));
    }

    static void subtract(double a, double b) {
        System.out.println("The difference of " + a + " and " + b + " as doubles is: " + (a - b));
    }

    static void subtract(float a, float b) {
        System.out.println("The difference of " + a + " and " + b + " as floats is: " + (a - b));
    }

    static void subtract(short a, short b) {
        System.out.println("The difference of " + a + " and " + b + " as shorts is: " + (a - b));
    }

    static void subtract(byte a, byte b) {
        System.out.println("The difference of " + a + " and " + b + " as bytes is: " + (a - b));
    }

    static void multiply(int a, int b) {
        System.out.println("The product of " + a + " and " + b + " as integers is: " + (a * b));
    }

    static void multiply(double a, double b) {
        System.out.println("The product of " + a + " and " + b + " as doubles is: " + (a * b));
    }

    static void multiply(float a, float b) {
        System.out.println("The product of " + a + " and " + b + " as floats is: " + (a * b));
    }

    static void multiply(short a, short b) {
        System.out.println("The product of " + a + " and " + b + " as shorts is: " + (a * b));
    }

    static void multiply(byte a, byte b) {
        System.out.println("The product of " + a + " and " + b + " as bytes is: " + (a * b));
    }

    static void divide(int a, int b) {
        if (b != 0) {
            System.out.println("The quotient of " + a + " and " + b + " as integers is: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    static void divide(double a, double b) {
        if (b != 0) {
            System.out.println("The quotient of " + a + " and " + b + " as doubles is: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    static void divide(float a, float b) {
        if (b != 0) {
            System.out.println("The quotient of " + a + " and " + b + " as floats is: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    static void divide(short a, short b) {
        if (b != 0) {
            System.out.println("The quotient of " + a + " and " + b + " as shorts is: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    static void divide(byte a, byte b) {
        if (b != 0) {
            System.out.println("The quotient of " + a + " and " + b + " as bytes is: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
