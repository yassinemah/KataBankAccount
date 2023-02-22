package test.bank;

import bank.Transaction;
import java.time.LocalDate;

public class TransactionTest {

    public static void main(String[] args) {

        testConstructorAndGetters();
        testToString();
    }

    public static void testConstructorAndGetters() {
        LocalDate date = LocalDate.now();
        String type = "Deposit";
        double amount = 100.0;
        double balance = 200.0;

        Transaction transaction = new Transaction(date, type, amount, balance);

        if (!transaction.getDate().equals(date)) {
            System.out.println("Error: Transaction date does not match expected value");
        }
        if (!transaction.getType().equals(type)) {
            System.out.println("Error: Transaction type does not match expected value");
        }
        if (transaction.getAmount() != amount) {
            System.out.println("Error: Transaction amount does not match expected value");
        }
        if (transaction.getBalance() != balance) {
            System.out.println("Error: Transaction balance does not match expected value");
        }
    }

    public static void testToString() {
        LocalDate date = LocalDate.now();
        String type = "Deposit";
        double amount = 100.0;
        double balance = 200.0;

        Transaction transaction = new Transaction(date, type, amount, balance);

        String expectedString = "Date: " + date.toString() + ", Type: " + type + ", Amount: "
                + Double.toString(amount) + ", Balance: " + Double.toString(balance);

        if (!transaction.toString().equals(expectedString)) {
            System.out.println("Error: Transaction toString does not match expected value");
        }
    }
}
