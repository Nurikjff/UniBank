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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javafx.print.Collation;

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
       List<Transaction>listofTransactionPerDay=new ArrayList<>();
        for (Transaction transaction : getAllTransactions()) {
              if(transaction.getDateOfTransaction().equals(dayTime))
              {
                 listofTransactionPerDay.add(transaction);
              }
        }
        return listofTransactionPerDay;
    }

    @Override
    public List<Transaction> getAllTransactionsPerClient(Customers customer) {
      List<Transaction>listOfTransactionByClient=new ArrayList<>();
        for (Transaction transaction : getAllTransactions()) {
              if(transaction.getFromAccount().getAccountOfCustomer().equals(customer))
              {
                 listOfTransactionByClient.add(transaction);
              }
        }
        return listOfTransactionByClient;
    }

    @Override
    public List<Transaction> getAllTransactionsTypeOfTransaction(String typeOfTransfer) {
      List<Transaction>listOfTransactionForType=new ArrayList<>();
        for (Transaction transaction : getAllTransactions()) {
              if(transaction.getTypeOfTransfer().equals(typeOfTransfer))
              {
                 listOfTransactionForType.add(transaction);
              }
        }
        return listOfTransactionForType;
    }

    @Override
    public List<Transaction> getAllTransactions5NewsClient(ZonedDateTime time) {
       List<Transaction>listofTransactionPerDay=new ArrayList<>();
       List<Transaction>list=getAllTransactions();
        for (int i = 0; i < list.size()-2; i++) {
            if(list.get(i).getDateOfTransaction().isAfter(list.get(i+1).getDateOfTransaction()))
            {
               
            }
        }
        return listofTransactionPerDay;
    }

    @Override
    public List<Transaction> get10TransactionsPerHighestAmount(double amount) {
        List<Transaction>listOfTransactionsPerAmount=new ArrayList<>();
       List<Transaction>list=getAllTransactions();
        for (int i = 0; i <10; i++) {
           listOfTransactionsPerAmount.add(list.get(i));
        }
        return listOfTransactionsPerAmount;
    }
    
}
