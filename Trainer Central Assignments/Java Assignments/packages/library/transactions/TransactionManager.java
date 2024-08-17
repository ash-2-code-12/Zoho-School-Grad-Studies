package packages.library.transactions;

import packages.library.books.Book;
import packages.library.members.Member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionManager {
    private List<Transaction> transactions;

    public TransactionManager() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Book book, Member member) {
        Transaction transaction = new Transaction(book, member, new Date(), null);
        transactions.add(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return transactions;
    }
}