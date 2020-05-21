package com.olamide.Apolis;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CurrentAccount {
    private double balance;
    private  int acctNo;
    Scanner sc = new Scanner(System.in);


    public CurrentAccount()
    {


    }

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if ((balance == 0) && (amount < 10000)) {
            System.out.println("Initial deposit must be more than 10000");
        } else {
            balance = balance + amount;
        }
    }

        public void withdraw ( double amount){
            if (balance - amount < 10000) {
                System.out.println("you can only withdraw " + (balance - 10000));
            } else {
                balance = balance - amount;
            }
        }


        public double getBalance() {
            return balance;
        }
    }

