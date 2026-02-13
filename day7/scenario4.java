package day7;
/*
Scenario:
You are tasked with developing a Bank Account Management System in Java. The system should allow users to create bank accounts, deposit money, withdraw money, transfer money between accounts, and display account details. Additionally, the system should handle exceptions such as insufficient funds and invalid transactions.
Requirements:
Create an Account class with the following attributes:
accountNumber (String)
accountHolderName (String)
balance (double)
The Account class should have the following methods:
deposit(double amount): Deposits money into the account.
withdraw(double amount): Withdraws money from the account (throws an exception if insufficient funds).
transfer(Account targetAccount, double amount): Transfers money to another account (throws an exception if insufficient funds or invalid account).
displayAccountDetails(): Displays the account details.
Create a Bank class that manages a collection of accounts. The Bank class should have the following methods:
createAccount(String accountNumber, String accountHolderName, double initialBalance): Creates a new account and adds it to the bank.
getAccount(String accountNumber): Finds and returns an account by its account number.
displayAllAccounts(): Displays all accounts in the bank.
Create a custom exception class InsufficientFundsException to handle insufficient funds scenarios.
Create a Main class to test the functionality of the Bank class.

Question:
Write the Java code to implement the above scenario. Your code should include the Account class, the Bank class, the InsufficientFundsException class, and the Main class. Ensure that the Main class demonstrates creating accounts, depositing, withdrawing, transferring money, and handling exceptions.


 */

import java.util.ArrayList;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    String accountNumber;
    String accountHolderName;
    double balance;

    Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance");
        }
        balance -= amount;
    }

    void transfer(Account targetAccount, double amount) throws InsufficientFundsException {
        if (targetAccount == null) {
            throw new IllegalArgumentException("Invalid target account");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance");
        }
        balance -= amount;
        targetAccount.balance += amount;
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

class Bank {
    ArrayList<Account> accounts;

    Bank() {
        accounts = new ArrayList<>();
    }

    void createAccount(String accountNumber, String accountHolderName, double initialBalance) {
        accounts.add(new Account(accountNumber, accountHolderName, initialBalance));
    }

    Account getAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.accountNumber.equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    void displayAllAccounts() {
        for (Account acc : accounts) {
            acc.displayAccountDetails();
        }
    }
}

public class scenario4 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.createAccount("A101", "Alice", 5000);
        bank.createAccount("A102", "Bob", 3000);

        Account a1 = bank.getAccount("A101");
        Account a2 = bank.getAccount("A102");

        a1.deposit(2000);

        try {
            a1.withdraw(1000);
            a1.transfer(a2, 4000);
            a2.withdraw(10000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        bank.displayAllAccounts();
    }
}

