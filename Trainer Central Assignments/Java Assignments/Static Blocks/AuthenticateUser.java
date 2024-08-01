// 1. Write a java program to mimic login of a person (Get username and password from the user and authenticate).
// The username and password should be hardcoded in a static block.
import java.util.HashMap;
import java.util.Scanner;

public class AuthenticateUser {

    private static HashMap<String, String> loginDataBase = new HashMap<>();

    static {
        loginDataBase.put("@ash_win.s_", "asdfgh@1123");
        loginDataBase.put("@harish_chand112", "@india0133");
        loginDataBase.put("@tarun_tej_12", "Password@876");
    }

    public static String authenticateLogin(String userName, String password) {
        if (loginDataBase.containsKey(userName)) {
            if (loginDataBase.get(userName).equals(password)) {
                return "----LOGIN SUCCESSFUL----";
            }
            return "--Password Invalid--";
        }
        return "--No User Found. Sign up--";
    }

    public static void createNewUser(Scanner sc){
        System.out.print("Enter username: ");
        String userName = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        loginDataBase.put(userName,password);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String userName = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        System.out.println(authenticateLogin(userName, password));
        // createNewUser(sc);
        // System.out.println(loginDataBase.containsKey("ash"));
        // System.out.println(authenticateLogin("ash", "123"));
        sc.close();
    }
}
