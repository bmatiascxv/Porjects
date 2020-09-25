package Account;

/*
Author: Benjamin Matias
Program: Chequeing.java
 */

public class Chequing extends Account {

    private double transaction_fee = 0;

    Chequing() {
        // super(int account_ID, String accountType, double balance) //
        super(0, "", 0);
    }

    // Two Parameter Constructor 
    Chequing(int account_ID, double balance) {
        super(account_ID, "Chequing", balance);
    }

    // Chequing withdraw method // 
    public void withdraw(double withdraw_amount) {

        if (withdraw_amount <= balance && withdraw_amount > 0) {
            balance -= (withdraw_amount + transaction_fee);
        } else if (withdraw_amount == 0) {
            balance -= 0;
        } else {
            throw new IllegalArgumentException("Transaction Failed.");
        }
    }

    // Outputs String 
    public String toString() {
        return "Account Information\n"
                + "----------------------\n"
                + "Account ID = " + account_ID
                + "\nAccount Balance = " + getBalance()
                + "\nAccount Type = $" + getAccountType()
                + "\n---------------------\n";
    }

}
