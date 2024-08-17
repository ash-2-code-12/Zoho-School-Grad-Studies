// 1. Design a library management system using packages. 
// Create packages such as library.books , library.members , and library.transactions . 
// Implement classes within these packages to represent books, members, and transactions. 
// Demonstrate the usage of packages to organize the code logically.
// Structure:
// library/
// ├── books/
// │   ├── Book.java
// │   └── Author.java
// ├── members/
// │   ├── Member.java
// │   └── Membership.java
// └── transactions/
//     ├── Transaction.java
//     └── TransactionManager.java

package packages.library;

import packages.library.books.Book;
import packages.library.books.Author;
import packages.library.members.Member;
import packages.library.members.Membership;
import packages.library.transactions.TransactionManager;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling", "Famous for Harry Potter series");
        Book book = new Book("Harry Potter", "123456789", author);

        Membership membership = new Membership("Premium", 100.0);
        Member member = new Member("John Doe", "M001", membership);

        TransactionManager transactionManager = new TransactionManager();
        transactionManager.addTransaction(book, member);

        System.out.println("Transactions: " + transactionManager.getAllTransactions().size());
    }
}
