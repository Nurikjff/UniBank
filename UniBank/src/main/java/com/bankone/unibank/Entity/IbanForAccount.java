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
public class IbanForAccount {
    private String numberOfAccount;
    private String numberOfIban;

    public String getNumberOfAccount() {
        return numberOfAccount;
    }

    public void setNumberOfAccount(String numberOfAccount) {
        this.numberOfAccount = numberOfAccount;
    }

    public String getNumberOfIban() {
        return numberOfIban;
    }

    public void setNumberOfIban(String numberOfIban) {
        this.numberOfIban = numberOfIban;
    }
    
}
