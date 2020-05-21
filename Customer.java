package com.olamide.Apolis;

public class Customer {
    CustomerInfo customerInfo;
    Account account;

    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public Account getAccount() {
        return account;
    }

    }
