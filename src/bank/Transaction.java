package bank;

import java.time.LocalDate;

public class Transaction {
    private LocalDate date;
    private String description;
    private double amount;
    private double balance;

    public Transaction(LocalDate date, String description, double amount, double balance) {
        this.date = date;
        this.description = description;
        this.amount = amount;
        this.balance = balance;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %.2f - %.2f", date, description, amount, balance);
    }
}
