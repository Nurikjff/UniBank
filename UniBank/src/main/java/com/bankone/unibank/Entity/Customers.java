/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankone.unibank.Entity;

import java.util.Date;

/**
 *
 * @author Nurlan Jafarov
 */
public class Customers {
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Date dateOfJoinBank;
    private int transactionNumberForIntTransfer;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfJoinBank() {
        return dateOfJoinBank;
    }

    public void setDateOfJoinBank(Date dateOfJoinBank) {
        this.dateOfJoinBank = dateOfJoinBank;
    }

    public int getTransactionNumberForIntTransfer() {
        return transactionNumberForIntTransfer;
    }

    public void setTransactionNumberForIntTransfer(int transactionNumberForIntTransfer) {
        this.transactionNumberForIntTransfer = transactionNumberForIntTransfer;
    }
    
}
