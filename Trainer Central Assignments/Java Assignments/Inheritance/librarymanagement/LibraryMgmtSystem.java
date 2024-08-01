
import java.util.Scanner;

public class LibraryMgmtSystem {
    protected String userType;
    protected String userName;
    protected String password;
    protected boolean loggedIn;

    public LibraryMgmtSystem(String userType, String userName, String password) {
        this.userType = userType;
        this.userName = userName;
        this.password = password;
        this.loggedIn = false;
    }

    public void login() {
        if (loggedIn) {
            System.out.println("Already logged in.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username :");
        String uName = sc.nextLine();
        System.out.println("Enter the password : ");
        String pass = sc.nextLine();
        sc.close();
        if (uName.equals(this.userName) && pass.equals(this.password)) {
            System.out.println("Login successful");
            this.loggedIn = true;
        } else {
            System.out.println("Wrong credentials. Login failed.");
        }
    }

    public static LibraryMgmtSystem register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose UserType : 1.Student 2.Staff");
        int userType = sc.nextInt();
        sc.nextLine(); // Consume newline
        if (userType > 2 || userType < 1) {
            sc.close();
            throw new IllegalArgumentException("Wrong choice");
        }
        System.out.println("Enter UserName : ");
        String userName = sc.nextLine();
        System.out.println("Enter Password : ");
        String password = sc.nextLine();
        sc.close();
        if (userType == 1) {
            return new LibraryMgmtSystem("Student", userName, password);
        } else {
            return new LibraryMgmtSystem("Staff", userName, password);
        }
    }

    public void logout() {
        if (!loggedIn) {
            System.out.println("Not logged in");
            return;
        }
        this.loggedIn = false;
        System.out.println("Logged out successfully");
    }

    public void getInfo() {
        System.out.println("Details : \nUserType : " + this.userType + "\nUserName : " + this.userName);
    }
}
