
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User extends LibraryMgmtSystem {
    private String name;
    private String id;
    private Account account;
    private List<Book> books;

    public User(String userType, String userName, String password, String name, String id, boolean no_borrowed_books, boolean no_lost_books, boolean no_returned_books, boolean no_resolved_books) {
        super(userType, userName, password);
        this.name = name;
        this.id = id;
        this.account = new Account(no_borrowed_books, no_lost_books, no_returned_books, no_resolved_books);
        this.books = new ArrayList<>();
    }
    public User(String userType, String userName, String password, String name, String id) {
        super(userType, userName, password);
        this.name = name;
        this.id = id;
        this.account = new Account(false,false,false,false);
        this.books = new ArrayList<>();
    }

    public User() {
        super("defaultUserType", "defaultUserName", "defaultPassword");
        Scanner sc = new Scanner(System.in);
        this.name = setName(sc);
        this.id = setId(sc);
        System.out.println("Enter Account Details:");
        boolean no_borrowed_books = setBooleanField(sc, "No Borrowed Books");
        boolean no_lost_books = setBooleanField(sc, "No Lost Books");
        boolean no_returned_books = setBooleanField(sc, "No Returned Books");
        boolean no_resolved_books = setBooleanField(sc, "No Resolved Books");
        this.account = new Account(no_borrowed_books, no_lost_books, no_returned_books, no_resolved_books);
        this.books = new ArrayList<>();
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Name : " + this.name + "\nId : " + this.id);
        account.getAccountInfo();
        System.out.println("Books:");
        for (Book book : books) {
            book.getInfo();
        }
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public static String setName(Scanner sc) {
        System.out.println("Enter Name of user : ");
        return sc.nextLine();
    }

    public static String setId(Scanner sc) {
        System.out.println("Enter Id of user : ");
        return sc.nextLine();
    }

    public static boolean setBooleanField(Scanner sc, String fieldName) {
        System.out.println("Enter " + fieldName + " (true/false): ");
        return Boolean.parseBoolean(sc.nextLine());
    }
}
