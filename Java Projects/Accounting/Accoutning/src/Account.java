package Account;

/*
Author: Benjamin Matias
Program: Account.java
 */

public abstract class Account {

    public int account_ID;
    public double balance;
    private String accountType;

    Account() {
        account_ID = 0;
        balance = 0;
        accountType = "";
    }

    // Three Parameter 
    public Account(int account_ID, String accountType, double balance) {
        this.account_ID = account_ID;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Getter and Setter for Account ID //
    public int getAccount_ID() {
        return account_ID;
    }

    public void setAccount_ID(int account_ID) {
        this.account_ID = account_ID;
    }

    // Getter and Setter for Balance //
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            throw new IllegalArgumentException("Invalid Balance Amount");
        }
    }

    // Getter and Setter for Account Type //
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    // Deposit Method 
    public void deposit(double deposit_amount) {
        if (deposit_amount >= 0) {
            balance += deposit_amount;
        } else {
            throw new IllegalArgumentException("Transaction Failed, invalid deposit amount.");
        }
    }

    // Abstract method called Withdraw //
    public abstract void withdraw(double withdraw_amount);

}
