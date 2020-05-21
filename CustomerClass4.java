package com.olamide.TimBuchalka;

public class CustomerClass4 {
private int customerId;
private String customerName;
private String customerAddress;
private String customerEmail;
private int customerNumber;

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public CustomerClass4() {

    }
}

class RetailCustomer extends CustomerClass4 {


    @Override
    public void setCustomerId(int customerId) {
        super.setCustomerId(customerId);
    }

    @Override
    public void setCustomerName(String customerName) {
        super.setCustomerName(customerName);
    }

    @Override
    public void setCustomerAddress(String customerAddress) {
        super.setCustomerAddress(customerAddress);
    }

    @Override
    public void setCustomerEmail(String customerEmail) {
        super.setCustomerEmail(customerEmail);
    }

    @Override
    public void setCustomerNumber(int customerNumber) {
        super.setCustomerNumber(customerNumber);
    }

    @Override
    public int getCustomerId() {
        return super.getCustomerId();
    }

    @Override
    public String getCustomerName() {
        return super.getCustomerName();
    }

    @Override
    public String getCustomerAddress() {
        return super.getCustomerAddress();
    }

    @Override
    public String getCustomerEmail() {
        return super.getCustomerEmail();
    }

    @Override
    public int getCustomerNumber() {
        return super.getCustomerNumber();
    }

    public RetailCustomer() {
        super();
    }
}