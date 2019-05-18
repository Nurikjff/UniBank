/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankone.unibank.Entity;

/**
 *
 * @author Nurlan Jafarov
 */
public class Account {
    private String numberOfAccount;
    private Double amountOfMoney;
    private String typeOfAccount;
    private Customers accountOfCustomer;
    private int transactionNumberForTransfer;

    public String getNumberOfAccount() {
        return numberOfAccount;
    }

    public void setNumberOfAccount(String numberOfAccount) {
        this.numberOfAccount = numberOfAccount;
    }

    public Double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(Double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public String getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(String typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public Customers getAccountOfCustomer() {
        return accountOfCustomer;
    }

    public void setAccountOfCustomer(Customers accountOfCustomer) {
        this.accountOfCustomer = accountOfCustomer;
    }

    public int getTransactionNumberForTransfer() {
        return transactionNumberForTransfer;
    }

    public void setTransactionNumberForTransfer(int transactionNumberForTransfer) {
        this.transactionNumberForTransfer = transactionNumberForTransfer;
    }
    
    
}
