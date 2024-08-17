// 4. Create multiple classes to imitate a bank structure with proper Exception Handling.
//  For eg., if the user tries to withdraw more than the balance, throw "InsufficientBalanceException" (created customly)

package bank;

public class BankTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);

        try {
            account.deposit(50.0);
            account.withdraw(200.0); // This will throw InsufficientBalanceException
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Remaining Balance: " + account.getBalance());
    }
}
