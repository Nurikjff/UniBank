/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankone.unibank.Util.Interface;

import com.bankone.unibank.Entity.Customers;
import com.bankone.unibank.Entity.Transaction;
import java.time.ZonedDateTime;
import java.util.List;

/**
 *
 * @author Nurlan Jafarov
 */
public interface DirectorOfBankInterUtil {
    public List<Transaction>getAllTransactions();
    public List<Transaction>getALlTransactionsPerDay(ZonedDateTime dayTime);
    public List<Transaction>getAllTransactionsPerClient(Customers customer);
    public List<Transaction>getAllTransactionsTypeOfTransaction(String typeOfTransfer);
    public List<Transaction>getAllTransactions5NewsClient(ZonedDateTime time);
    public List<Transaction>get10TransactionsPerHighestAmount(double amount);
    
}
