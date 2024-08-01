
public class Account {
    private boolean no_borrowed_books;
    private boolean no_lost_books;
    private boolean no_returned_books;
    private boolean no_resolved_books;
    private float fine;

    public Account(boolean no_borrowed_books, boolean no_lost_books, boolean no_returned_books, boolean no_resolved_books) {
        this.no_borrowed_books = no_borrowed_books;
        this.no_lost_books = no_lost_books;
        this.no_returned_books = no_returned_books;
        this.no_resolved_books = no_resolved_books;
        this.fine = calculateFine();
    }
    
    public float calculateFine() {
        float fine = 0;
        if (no_borrowed_books) fine += 100;
        if (no_lost_books) fine += 500;
        if (no_returned_books) fine += 100;
        if (no_resolved_books) fine += 100;
        return fine;
    }

    public void getAccountInfo() {
        System.out.println("Account Details:");
        System.out.println("Fine Borrowed Books: " + (no_borrowed_books? 0 :200));
        System.out.println("Fine Lost Books: " + (no_lost_books?  0: 500));
        System.out.println("Fine Returned Books: " + (no_returned_books? 0 :100));
        System.out.println("Fine Resolved Books: " + (no_resolved_books? 0 :100));
        System.out.println("Fine: " + this.fine);
    }
}
