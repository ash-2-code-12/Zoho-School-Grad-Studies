
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LibraryDatabase {
    private List<Book> books;

    public LibraryDatabase() {
        books = new ArrayList<>();
        // Initialize with 10 books
        for (int i = 1; i <= 10; i++) {
            books.add(new Book("BookType", "book_user" + i, "bookpassword" + i, "Book Title " + i, "Author " + i, "ISBN-00" + i, "Publication " + i));
        }
    }

    public void add(Book book) {
        books.add(book);
    }

    public void delete(String ISBN) {
        books.removeIf(book -> book.getISBN().equals(ISBN));
    }

    public void update(String ISBN, Book updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getISBN().equals(ISBN)) {
                books.set(i, updatedBook);
                break;
            }
        }
    }

    public void display() {
        for (Book book : books) {
            book.getInfo();
        }
    }

    public Book search(String ISBN) {
        Optional<Book> book = books.stream().filter(b -> b.getISBN().equals(ISBN)).findFirst();
        return book.orElse(null);
    }
}
