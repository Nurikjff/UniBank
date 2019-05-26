/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankone.unibank.Util.Impl;

import com.bankone.unibank.Entity.Account;
import com.bankone.unibank.Util.Interface.TransactionIntUtil;

/**
 *
 * @author Nurlan Jafarov
 */
public class TransactionImplUtil implements TransactionIntUtil {

    @Override
    public boolean regularDebit(Account senderAccount, Account recieverAccount, double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean regularCredit(Account senderAccount, Account recieverAccount, double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean internWire(Account senderAccount, Account recieverAccount, double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
