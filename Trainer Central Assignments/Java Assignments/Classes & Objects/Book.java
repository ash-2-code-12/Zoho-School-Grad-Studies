// 1. Create Book DTO class with attributes like title, ISBN etc. Create appropriate instance variables, static variables and methods with appropriate access modifiers.

public class Book{

    private String title;
    private String ISBN;
    private String author;
    private String genre;

    private static int booksCount = 0;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String isbn) {
        this.ISBN = isbn;
        Book.booksCount++;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBooksCount(){
        return booksCount;
    }

    public void getDetails(){
        System.out.println("Details : \n Title : " + this.title + "\n ISBN : " + this.ISBN + "\n Author : " + this.author + "\n Genre : " + this.genre );
    }

}