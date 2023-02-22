package bank;

import bank.BankAccount;

// Main.java

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Make a deposit
        account.deposit(1000.0);

        // Make a withdrawal
        account.withdraw(500.0);

        // Print the statement
        account.printStatement();
    }
}
