/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankone.unibank.Entity;

import java.time.ZonedDateTime;

/**
 *
 * @author Nurlan Jafarov
 */
public class Transaction implements Comparable<Transaction>{
    private String numberOfTransaction;
    private Account fromAccount;
    private Account toAccount;
    private ZonedDateTime dateOfTransaction;
    private String typeOfAccount;
    private String typeOfTransfer;
    private double ammount;

    public String getNumberOfTransaction() {
        return numberOfTransaction;
    }

    public void setNumberOfTransaction(String numberOfTransaction) {
        this.numberOfTransaction = numberOfTransaction;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Account fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public void setToAccount(Account toAccount) {
        this.toAccount = toAccount;
    }

    public ZonedDateTime getDateOfTransaction() {
        return dateOfTransaction;
    }

    public void setDateOfTransaction(ZonedDateTime dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }

    public String getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(String typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public String getTypeOfTransfer() {
        return typeOfTransfer;
    }

    public void setTypeOfTransfer(String typeOfTransfer) {
        this.typeOfTransfer = typeOfTransfer;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    @Override
    public int compareTo(Transaction o) {
        if(this.ammount<o.ammount)
        {
        return 1;
        }
        else
        {
        if(this.ammount<o.ammount)
        {
        return 0;
        }
        else{
          return -1;
        }
        }
        }
    
}
