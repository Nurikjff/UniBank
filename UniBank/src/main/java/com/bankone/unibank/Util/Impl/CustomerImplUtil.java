/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankone.unibank.Util.Impl;

import com.bankone.unibank.Entity.Account;
import com.bankone.unibank.Entity.Customers;
import com.bankone.unibank.Entity.Transaction;
import com.bankone.unibank.Util.Interface.CustomerInterUtil;
import com.bankone.unibank.Util.Interface.EmployerInterUtil;
import java.time.ZonedDateTime;
import java.util.List;

/**
 *
 * @author Nurlan Jafarov
 */
public class CustomerImplUtil implements CustomerInterUtil {

    @Override
    public boolean LogInAccount(String login, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean RequestForNewAccount(String NumberOfAccount, double AmountOfMoney, String typeOfAccount, Customers amountOfCustomers, int transactionNumberForTransfer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean OpenNewAccount(Account account) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Transaction> getALlTransactionsbetweenDate(ZonedDateTime startTime, ZonedDateTime endTime) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Transaction> getAllTransactionsPerAccount(Account account) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
