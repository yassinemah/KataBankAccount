package test.bank;

import bank.BankAccount;
import java.util.List;
import bank.Transaction;

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println("Initial balance: " + account.getBalance());

        // Test deposit method
        account.deposit(100);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Test withdrawal method
        account.withdraw(50);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Test statement printing
        account.printStatement();

        // Test transaction history
        List<Transaction> history = account.getTransactionHistory();
        System.out.println("Transaction history:");
        for (Transaction transaction : history) {
            System.out.println(transaction);
        }
    }
}
