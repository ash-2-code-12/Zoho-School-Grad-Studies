
public class Book extends LibraryMgmtSystem {
    private String title;
    private String author;
    private String ISBN;
    private String publication;
    private boolean reserved;
    private String feedback;

    public Book(String userType, String userName, String password, String title, String author, String ISBN, String publication) {
        super(userType, userName, password);
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publication = publication;
        this.reserved = false;
        this.feedback = "";
    }

    public void showDebt() {
        System.out.println("Showing debt for book: " + this.title);
        // Logic to show debt
    }

    public void reservationStatus() {
        System.out.println("Reservation status for book: " + this.title + " is " + (reserved ? "Reserved" : "Available"));
    }

    public void feedback(String feedback) {
        this.feedback = feedback;
        System.out.println("Feedback for book: " + this.title + " is " + this.feedback);
    }

    public void bookRequest() {
        System.out.println("Requesting book: " + this.title);
        // Logic to request the book
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Title: " + this.title + "\nAuthor: " + this.author + "\nISBN: " + this.ISBN + "\nPublication: " + this.publication);
    }

    public String getISBN() {
        return this.ISBN;
    }
}
