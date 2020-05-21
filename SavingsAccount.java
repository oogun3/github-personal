package com.olamide.Apolis;

public class SavingsAccount {
    private  double balance;


    public SavingsAccount() {


        balance = 0;
    }

    public SavingsAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        if ((balance == 0) && (amount < 2000.00)) {
            System.out.println("Initial deposit should be at least $2000");
        } else {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (balance - amount < 200.00){
          double  withdrawAmt = balance - 200;
            System.out.println("you can only withdraw " + withdrawAmt);
        } else {
            balance = balance - amount;
        }
    }

    public void transfer(double amount)
    {
        balance =  balance - amount;
    }
    public double getBalance() {
        return balance;
    }
}
