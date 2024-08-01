
import java.util.Scanner;

public class Librarian extends LibraryMgmtSystem {
    private String name;
    private String id;

    public Librarian(String userType, String userName, String password, String name, String id) {
        super(userType, userName, password);
        this.name = name;
        this.id = id;
    }

    public Librarian() {
        super("defaultUserType", "defaultUserName", "defaultPassword");
        Scanner sc = new Scanner(System.in);
        this.name = setName(sc);
        this.id = setId(sc);
    }

    public void verifyLibrarian() {
        System.out.println("Librarian verified: " + this.name + " with ID: " + this.id);
    }

    public void searchBook(LibraryDatabase libraryDatabase, String ISBN) {
        Book book = libraryDatabase.search(ISBN);
        if (book != null) {
            book.getInfo();
        } else {
            System.out.println("Book with ISBN " + ISBN + " not found.");
        }
    }

    public static String setName(Scanner sc) {
        System.out.println("Enter Name of Librarian: ");
        return sc.nextLine();
    }

    public static String setId(Scanner sc) {
        System.out.println("Enter ID of Librarian: ");
        return sc.nextLine();
    }
}
