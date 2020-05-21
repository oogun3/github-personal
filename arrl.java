package com.olamide.Apolis;

import java.util.ArrayList;
import java.util.Collections;

public class arrl {

    private String arrlname;
    private int rollno;
    private int arrlage;

    public arrl(int rollno, String arrlname, int arrlage) {
        this.rollno = rollno;
        this.arrlname = arrlname;
        this.arrlage = arrlage;
    }

    public String getarrlname() {
        return arrlname;
    }

    public void setarrlname(String arrlname) {
        this.arrlname = arrlname;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getarrlage() {
        return arrlage;
    }

    public void setarrlage(int arrlage) {
        this.arrlage = arrlage;
    }

    public static void main(String args[]) {
        ArrayList<arrl> arraylist = new ArrayList<arrl>();
        arraylist.add(new arrl(223, "Chaitanya", 26));
        arraylist.add(new arrl(245, "Rahul", 24));
        arraylist.add(new arrl(209, "Ajeet", 32));

        Collections.sort(arraylist);

        for (arrl str : arraylist) {
            System.out.println(str);
        }
    }
}
