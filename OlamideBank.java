package com.olamide.Apolis;

import java.util.Scanner;

public class OlamideBank {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int userChoice;

        boolean quit = false;

        do {
            System.out.println("1. Open Account");

        System.out.println("2. Deposit money");

        System.out.println("3. Withdraw money");

        System.out.println("4. Transfer Balance");

        System.out.println("5. Check balance");

        System.out.print("Your choice, 0 to quit: ");

        userChoice = in.nextInt();

        switch (userChoice) {

            case 1:
            CustomerInfo cust = new CustomerInfo();

                break;

            case 2:
                System.out.println( "Enter your account Number: ");

                break;

            case 3:
                System.out.println( "Enter your account Number: ");

                // check balance

                break;


            case 4:
                System.out.println( "Enter your account Number: ");

                // check balance

                break;

            case 5:
                System.out.println( "Enter your account Number: ");

                // check balance

                break;

            case 0:

                quit = true;

                break;

            default:

                System.out.println("Wrong choice.");

                break;

        }

        System.out.println();

    } while (!quit);

            System.out.println("Bye!");
        }
    }
