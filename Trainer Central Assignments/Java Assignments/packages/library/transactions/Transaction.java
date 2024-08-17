package packages.library.transactions;

import java.util.Date;
import packages.library.books.Book;
import packages.library.members.Member;

public class Transaction {
    private Book book;
    private Member member;
    private Date borrowDate;
    private Date returnDate;

    public Transaction(Book book, Member member, Date borrowDate, Date returnDate) {
        this.book = book;
        this.member = member;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    // Getters and setters
    public Book getBook() { return book; }
    public Member getMember() { return member; }
    public Date getBorrowDate() { return borrowDate; }
    public Date getReturnDate() { return returnDate; }
}
