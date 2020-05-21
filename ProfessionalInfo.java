package com.olamide.Apolis;

import java.util.Scanner;

public class ProfessionalInfo {
    private String salaried;
    private String retired;
    private String businessman;
    int userChoice;
    boolean choice;


    public ProfessionalInfo() {
        Scanner sc = new Scanner(System.in);

       do {


            System.out.println("1. Salaried");

            System.out.println("2. Retired");

            System.out.println("3. Businessman");

           System.out.println("Please select one : ");

           userChoice = sc.nextInt();



            switch (userChoice){
                case 1:
                    break;
                case  2:
                    break;
                case 3:
                    break;
                default:
                    choice = false;
                    System.out.println("wrong choice");

            }
        } while  (choice);

    }

}
