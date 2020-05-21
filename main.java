package com.olamide.TimBuchalka;
 class main {
     public static void main(String[] args) {
         RetailCustomer customer = new RetailCustomer();
         customer.setCustomerAddress("555 S. Park Victoria Dr, Milpitas CA.");
         customer.setCustomerEmail("oogun3@uis.edu");
         customer.setCustomerId(312546665);
         customer.setCustomerName("Olamide");
         customer.setCustomerNumber(123456);
         System.out.println(customer.getCustomerAddress() + "\n" + customer.getCustomerEmail() + "\n" + customer.getCustomerName() + "\n" + customer.getCustomerId()
  + "\n" +customer.getCustomerNumber());
     }
 }