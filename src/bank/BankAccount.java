package bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private List<Transaction> transactions;

    public BankAccount() {
        balance = 0;
        transactions = new ArrayList<Transaction>();
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction(LocalDate.now(), "Deposit", amount, balance));
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction(LocalDate.now(), "Withdrawal", -amount, balance));
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void printStatement() {
        System.out.println("Date\t\tType\tAmount\tBalance");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public List<Transaction> getTransactionHistory() {
        return transactions;
    }

    public double getBalance() {
        return balance;
    }
}
