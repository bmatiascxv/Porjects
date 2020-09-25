package Bank;

/*
Author: Benjamin Matias
Program: Savings.java
 */

public class Savings extends Account {

    private double overdraft, interest_rate = 0;

    Savings() {
      // Setting parent class values to empty values //
      super(0, "", 0);
    }

    Savings(final int account_ID, final double balance, final double overdraft) {
      // Initializing values for parent class //
      super(account_ID, "Savings", balance);
      this.overdraft = overdraft;
    }

    public double getOverdraft() {
      return overdraft;
    }

    public void setOverdraft(final double overdraft) {
      if (overdraft >= 0) {
        this.overdraft = overdraft;
      } else {
        throw new IllegalArgumentException("Invalid Overdraft Amount");
      }
    }

    public double getInterest_rate() {
      return interest_rate;
    }

    public void setInterest_rate(final double interest_rate) {
      if (interest_rate >= 0) {
        this.interest_rate = interest_rate;
      } else {
        throw new IllegalArgumentException("Invalid Interest Rate");
      }
    }

    public void addInterest() {
    }

    public void withdraw(final double withdraw_amount) {

        final double withdraw_limit = balance + overdraft;

        if (withdraw_amount <= withdraw_limit && withdraw_amount >= 0) {
            balance -= withdraw_amount;
        } else if (withdraw_amount > withdraw_limit) {
            throw new IllegalArgumentException("Transaction Failed, withdraw amount pass limit");
        } else {
            throw new IllegalArgumentException("Transaction Failed.");
        }
    }

    public String toString() {
        return "Account Information\n"
                + "--------------------------\n"
                + "Account ID = " + account_ID
                + "\nOverdraft=" + overdraft
                + "\nAccount Balance = $" + balance
                + "\nAccount Type = " + getAccountType()
                + "\n----------------------------\n";
    }

}
