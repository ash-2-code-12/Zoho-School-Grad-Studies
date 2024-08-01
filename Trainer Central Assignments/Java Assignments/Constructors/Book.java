// 1. Add a constructor to the Book class already created. Write a function to add books using constructors to an array of <Book> objects, and display all the books added.


import java.util.ArrayList;

public class Book {

    private String title;
    private String ISBN;
    private String author;
    private String genre;

    private static int booksCount = 0;

    public Book(String title, String ISBN, String author, String genre) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.genre = genre;
        booksCount++;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String isbn) {
        this.ISBN = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public static int getBooksCount() {
        return booksCount;
    }

    public void getDetails() {
        System.out.println("Details : \n Title : " + this.title + "\n ISBN : " + this.ISBN + "\n Author : " + this.author + "\n Genre : " + this.genre );
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Harry Potter", "1120399421", "JK Rowling", "Wizardry"));
        books.add(new Book("The Fault in our stars", "1123948202", "Charles Benjamin", "Love"));
        books.add(new Book("Java First Reference", "2949790293", "James Gosling", "Technology"));

        for (Book book : books) {
            book.getDetails();
        }

        System.out.println("Total number of books: " + Book.getBooksCount());
    }
}
