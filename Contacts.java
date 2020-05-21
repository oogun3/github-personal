package com.olamide.Apolis;


import java.util.ArrayList;

class MobilePhone{
    ArrayList<Contacts> mobilephone = new ArrayList<>();

    public void addPhoneNumber(Contacts contacts){
        mobilephone.add(contacts);
    }
    public  void updateContact(String name, String newname){

    }
}

public  class Contacts{
    public  int phoneNumber;
   public  String name;

    public Contacts(int phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

}
