// 4. Write a program to validate email address (contains @ and proper domain format). Note: Don't use regular expressions


import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email id : ");
        String emailId = sc.nextLine();
        sc.close();
        if(validate(emailId)){
            System.out.println("Valid email Id");
        }
        else{
            System.out.println("Invalid Email Id");
        }
    }

    public static boolean validate(String email){
        if (email.isEmpty() || email==null){
            return false;
        }
        //@ position
        int atPosition = email.indexOf("@");
        if (atPosition < 1 || atPosition >= email.length() - 3) {
            return false;
        }

        // Check for presence of '.' after '@'
        int dotPosition = email.indexOf('.', atPosition);
        if (dotPosition < atPosition + 2 || dotPosition >= email.length() - 1) {
            return false;
        }

        // Check for valid characters before '@'
        for (int i = 0; i < atPosition; i++) {
            if (!isValidEmailChar(email.charAt(i))) {
                return false;
            }
        }

        // Check for valid characters after '@' and before the last '.'
        for (int i = atPosition + 1; i < dotPosition; i++) {
            if (!isValidDomainChar(email.charAt(i))) {
                return false;
            }
        }

        // Check for valid characters after the last '.'
        for (int i = dotPosition + 1; i < email.length(); i++) {
            if (!isValidDomainChar(email.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    private static boolean isValidEmailChar(char c) {
        return Character.isLetterOrDigit(c) || c == '.' || c == '_' || c == '-' || c == '+';
    }

    private static boolean isValidDomainChar(char c) {
        return Character.isLetterOrDigit(c) || c == '-';
    }
}
