// 1. Design a library management system using packages. 
// Create packages such as library.books , library.members , and library.transactions . 
// Implement classes within these packages to represent books, members, and transactions. 
// Demonstrate the usage of packages to organize the code logically.

package packages.library.books;

public class Book {
    private String title;
    private String isbn;
    private Author author;

    public Book(String title, String isbn, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    // Getters and setters
    public String getTitle() { return title; }
    public String getIsbn() { return isbn; }
    public Author getAuthor() { return author; }
}
