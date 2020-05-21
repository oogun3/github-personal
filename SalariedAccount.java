package com.olamide.Apolis;

public class SalariedAccount {

    private  double balance;
    private double interest;

    public SalariedAccount() {
        balance = 0;
    }

    public SalariedAccount(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }
    public void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Your current balance is " + balance);
    }

    public void withdraw(double amount)
    {
        balance = balance - amount;
        System.out.println("Withdrawal of " + amount + "made. Balance is " + balance);
    }

    public double getBalance() {
        return balance;
    }
}
