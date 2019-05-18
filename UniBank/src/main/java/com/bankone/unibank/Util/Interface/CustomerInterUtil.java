/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankone.unibank.Util.Interface;

import com.bankone.unibank.Entity.Account;
import com.bankone.unibank.Entity.Customers;
import com.bankone.unibank.Entity.Transaction;
import java.time.ZonedDateTime;
import java.util.List;

/**
 *
 * @author Nurlan Jafarov
 */
public interface CustomerInterUtil {
    public boolean LogInAccount(String login, String password);
    public boolean RequestForNewAccount(String NumberOfAccount, double AmountOfMoney, String typeOfAccount, Customers amountOfCustomers, int transactionNumberForTransfer);
    public boolean OpenNewAccount(Account account);
     public List<Transaction>getALlTransactionsbetweenDate(ZonedDateTime startTime,ZonedDateTime endTime);
    public List<Transaction>getAllTransactionsPerAccount(Account account);
}
