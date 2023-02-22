package bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {
    private double balance;
    private List<Transaction> transactions;

    public BankAccount() {
        balance = 0.0;
        transactions = new ArrayList<Transaction>();
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid deposit amount");
        }
        balance += amount;
        Transaction transaction = new Transaction(new Date(), amount, balance, "Deposit");
        transactions.add(transaction);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid withdrawal amount");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
        Transaction transaction = new Transaction(new Date(), amount, balance, "Withdrawal");
        transactions.add(transaction);
    }

    public void printStatement() {
        System.out.println("Date\t\t\tAmount\t\tBalance\t\tTransaction Type");
        for (Transaction transaction : transactions) {
            System.out.println(transaction.getDate() + "\t$" + transaction.getAmount() + "\t\t$"
                    + transaction.getBalance() + "\t\t" + transaction.getType());
        }
    }

    private class Transaction {
        private Date date;
        private double amount;
        private double balance;
        private String type;

        public Transaction(Date date, double amount, double balance, String type) {
            this.date = date;
            this.amount = amount;
            this.balance = balance;
            this.type = type;
        }

        public Date getDate() {
            return date;
        }

        public double getAmount() {
            return amount;
        }

        public double getBalance() {
            return balance;
        }

        public String getType() {
            return type;
        }
    }
}
