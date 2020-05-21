package com.olamide.Apolis;

import java.util.Scanner;

public class Account {

    SavingsAccount savingsAccount;
    CurrentAccount currentAccount;
    SalariedAccount salariedAccount;
    int userChoice;
    boolean choice;
    private  int acctNo;

    public Account() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter account Number :");
        acctNo = sc.nextInt();

        System.out.println("Please choose Account type : ");


            do {

                System.out.println("1. Current Account");

                System.out.println("2. Savings Account");

                System.out.println("3. Salaried Account");

                userChoice = sc.nextInt();



                switch (userChoice){
                    case 1:
                        CurrentAccount cu = new CurrentAccount();
                    case  2:
                        SavingsAccount su = new SavingsAccount();
                        break;
                    case 3:
                        SalariedAccount sa = new SalariedAccount();
                        break;
                    default:
                        choice = false;
                        System.out.println("wrong choice");

                }
            } while  (choice);

        }

    }

