
public class Main {
    public static void main(String[] args) {
        // LibraryDatabase and display initial books
        LibraryDatabase libraryDatabase = new LibraryDatabase();
        System.out.println("Initial Books in Library:");
        libraryDatabase.display();

        // Create a Librarian and verify
        Librarian librarian = new Librarian("Librarian", "librarian_user", "librarianpassword", "John Smith", "lib-001");
        librarian.verifyLibrarian();

        // Search for a book
        System.out.println("\nSearching for a book with ISBN 'ISBN-005':");
        librarian.searchBook(libraryDatabase, "ISBN-005");

        // Add a new book
        System.out.println("\nAdding a new book:");
        Book newBook = new Book("BookType", "book_user11", "bookpassword11", "Book Title 11", "Author 11", "ISBN-011", "Publication 11");
        libraryDatabase.add(newBook);
        libraryDatabase.display();

        // Update a book
        System.out.println("\nUpdating book with ISBN 'ISBN-005':");
        Book updatedBook = new Book("BookType", "updated_user", "updatedpassword", "Updated Book Title", "Updated Author", "ISBN-005", "Updated Publication");
        libraryDatabase.update("ISBN-005", updatedBook);
        libraryDatabase.display();

        // Delete a book
        System.out.println("\nDeleting book with ISBN 'ISBN-003':");
        libraryDatabase.delete("ISBN-003");
        libraryDatabase.display();
    }
}
