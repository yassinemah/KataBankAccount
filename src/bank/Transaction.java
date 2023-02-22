package bank;

import java.time.LocalDate;

public class Transaction {
    private LocalDate date;
    private String type;
    private double amount;
    private double balance;

    public Transaction(LocalDate date, String type, double amount, double balance) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.balance = balance;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("%s\t%s\t%.2f\t%.2f", date, type, amount, balance);
    }
}
