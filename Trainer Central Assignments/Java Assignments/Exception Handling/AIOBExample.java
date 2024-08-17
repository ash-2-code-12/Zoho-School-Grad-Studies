// 5. Write program to demonstrate ArrayIndexOutOfBoundsException

public class AIOBExample {
    public static void main(String[] args) {
        // Create an array with 3 elements
        int[] numbers = {1, 2, 3};

        try {
            // Attempt to access an element at index 5, which does not exist
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception and print an error message
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}
