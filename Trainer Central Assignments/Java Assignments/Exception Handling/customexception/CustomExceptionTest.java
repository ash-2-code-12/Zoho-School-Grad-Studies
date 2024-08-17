public class CustomExceptionTest  {
    public static void main(String[] args) {
        try {
            checkNumber(-1);
        } catch (CustomException e) {
            System.out.println("Caught the custom exception: " + e.getMessage());
        }
    }

    public static void checkNumber(int number) throws CustomException {
        if (number < 0) {
            throw new CustomException("Number cannot be negative.");
        }
        System.out.println("Number is: " + number);
    }
}
