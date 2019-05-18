/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankone.unibank.Util.Impl;

import com.bankone.unibank.DBconfig.DBConfigration;
import com.bankone.unibank.Entity.Customers;
import com.bankone.unibank.Entity.Transaction;
import com.bankone.unibank.Util.Interface.DirectorOfBankInterUtil;
import java.time.ZonedDateTime;
import java.util.List;

/**
 *
 * @author Nurlan Jafarov
 */
public class DirectorOfBankImplUtil implements DirectorOfBankInterUtil{

    @Override
    public List<Transaction> getAllTransactions() {
       return DBConfigration.getTransactionsList();
    }

    @Override
    public List<Transaction> getALlTransactionsPerDay(ZonedDateTime dayTime) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Transaction> getAllTransactionsPerClient(Customers customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Transaction> getAllTransactionsTypeOfTransaction(String typeOfTransfer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Transaction> getAllTransactions5NewsClient(ZonedDateTime time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Transaction> get10TransactionsPerHighestAmount(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
