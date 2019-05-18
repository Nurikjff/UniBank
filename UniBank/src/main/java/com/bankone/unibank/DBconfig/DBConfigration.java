/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankone.unibank.DBconfig;

import com.bankone.unibank.Entity.*;

import java.util.List;

/**
 *
 * @author Nurlan Jafarov
 */
public class DBConfigration {
     private static List<Account>accountList;
     private static List<Customers>customersList;
     private static List<Transaction>transactionsList;
     private static List<IbanForAccount>ibanForAccountsList;
     private static List<InterestOfAccount>interestOfAccountsList;
     private static Customers user;

    public static List<Account> getAccountList() {
        return accountList;
    }

    public static List<Customers> getCustomersList() {
        return customersList;
    }

    public static List<Transaction> getTransactionsList() {
        return transactionsList;
    }

    public static List<IbanForAccount> getIbanForAccountsList() {
        return ibanForAccountsList;
    }

    public static List<InterestOfAccount> getInterestOfAccountsList() {
        return interestOfAccountsList;
    }

    public static Customers getUser() {
        return user;
    }

    public static void setUser(Customers user) {
        DBConfigration.user = user;
    }
    public static void addAccount(Account account)
    {
        accountList.add(account);
    }
    public static void addCustomers(Customers customers)
    {
        customersList.add(customers);
    }
   public static void addTransaction(Transaction transaction)
    {
        transactionsList.add(transaction);
    } 
   public static void addIbanForAccount(IbanForAccount ibanForAccount)
    {
        ibanForAccountsList.add(ibanForAccount);
    }
   public static void addInterestOfAccount(InterestOfAccount interestOfAccount)
    {
        interestOfAccountsList.add(interestOfAccount);
    }
}
