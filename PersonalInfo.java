package com.olamide.Apolis;

import java.util.Scanner;
public class PersonalInfo {
    private int age;
    private String fullname;
    private String address;
    private String email;
    private long phoneNumber;
    Scanner sc = new Scanner(System.in);

    public PersonalInfo() {

        do {
            System.out.println("Enter age of customer :");
            age = sc.nextInt();
        } while (!isValid(age));

        System.out.println("Enter customer address: ");
        address = sc.nextLine();
        sc.nextLine();

        System.out.println("Enter customer email: ");
        email = sc.nextLine();

        System.out.println("Enter customer phone number: ");
        phoneNumber = sc.nextLong();
    }

    boolean isValid(int age) {
        if (age < 18) {
            System.out.println("Age is Invalid, age must be greater than 18");
            return false;
        } else return true;
    }
}
