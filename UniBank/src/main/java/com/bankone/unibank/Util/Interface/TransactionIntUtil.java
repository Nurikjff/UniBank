/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankone.unibank.Util.Interface;

import com.bankone.unibank.Entity.Account;

/**
 *
 * @author Nurlan Jafarov
 */
public interface TransactionIntUtil {
    public boolean regularDebit (Account senderAccount, Account recieverAccount, double amount);
    public boolean regularCredit (Account senderAccount, Account recieverAccount, double amount);
    public boolean internWire (Account senderAccount, Account recieverAccount, double amount);
}
