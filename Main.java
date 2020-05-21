package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     char[] newValue = valueIntake();
      checkValue(newValue);
    }

    public static char[] valueIntake() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to be checked: ");
        String value = sc.nextLine();
        value.toLowerCase();
        char[] ch = new char[value.length()];
        for (int i = 0; i < value.length() - 1; i++) {
            ch[i] = value.charAt(i);
        }
        return ch;
    }

        public static void checkValue(char[] Intake){
            for (int i = 0; i < Intake.length-1; i++ ){
                for (int j = i+1; j< Intake.length; j++ )
                    if ((Intake[i] == Intake[j]) && (i!= j)){
                        System.out.println(Intake[j] + " is a duplicate elements. ");
                    }



        }
    }
}
