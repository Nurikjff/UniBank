/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankone.unibank.Util.Impl;

import com.bankone.unibank.DBconfig.DBConfigration;
import com.bankone.unibank.Entity.Account;
import com.bankone.unibank.Entity.Customers;
import com.bankone.unibank.Entity.IbanForAccount;
import com.bankone.unibank.Entity.InterestOfAccount;
import com.bankone.unibank.Entity.Transaction;
import com.bankone.unibank.Util.Interface.CustomerInterUtil;
import com.bankone.unibank.Util.Interface.EmployerInterUtil;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nurlan Jafarov
 */
public class CustomerImplUtil implements CustomerInterUtil {
 EmployerInterUtil employerUtil;
    @Override
    public boolean LogInAccount(String login, String password) {
          for (Customers customers : getAllCustomersList()) {
            if(customers.getLogin().equalsIgnoreCase(login) && customers.getPassword().equals(password))
            {
                DBConfigration.setUser(customers);
                return true;
            }
        }
          return false;
    }

    @Override
    public boolean RequestForNewAccount(double AmountOfMoney, String typeOfAccount, Customers userCustomers) {
       if(userCustomers==null)
       {
         return false;
       }
       else
       {
         Account account=new Account();
         account.setAccountOfCustomer(userCustomers);
         account.setAmountOfMoney(AmountOfMoney);
         account.setNumberOfAccount(generateAccountNumberForCustomer(userCustomers));
         account.setTypeOfAccount(typeOfAccount);
         creataPercenageForAccount(account);
         createIbanNumberForAccount(account, userCustomers);
         return employerUtil.acceptAccount(account);
       }
              
       
      
    }
    public String generateAccountNumberForCustomer(Customers customers){
     String accountnumber=getAllAccountListByCustmer(customers).size()+"";
     String customernumbr=getAllCustomersList().size()+"";
     int sizeacount=accountnumber.length();
     int sizeCustemer=customernumbr.length();
        while (sizeacount<3) {
           accountnumber="0"+accountnumber;
           sizeacount=accountnumber.length();
            
        }
        while (sizeCustemer<5) {
           customernumbr="0"+customernumbr;
           sizeCustemer=customernumbr.length();
            
        }
        String numberOfaccount="23"+customernumbr+accountnumber;
        return numberOfaccount;
    }
    public boolean createIbanNumberForAccount(Account account,Customers customer)
    {
       if(account.getTypeOfAccount().equalsIgnoreCase("International"))
       {
           IbanForAccount ibanForAccount=new IbanForAccount();
           ibanForAccount.setNumberOfAccount(account.getNumberOfAccount());
           ibanForAccount.setNumberOfIban(customer.getFirstName().substring(0, 2)+account.getNumberOfAccount());
           return true;
       }
       return false;
    }
public boolean creataPercenageForAccount(Account account)
    {
       if(account.getTypeOfAccount().equalsIgnoreCase("Saving"))
       {
            InterestOfAccount interestOfAccount=new InterestOfAccount();
            interestOfAccount.setInterestRate(0.01);
            interestOfAccount.setNumberOfAccount(account.getNumberOfAccount());
           return true;
       }
       return false;
    }
    

    @Override
    public List<Transaction> getALlTransactionsbetweenDate(ZonedDateTime startTime, ZonedDateTime endTime) {
       List<Transaction>transactionListByDate=new ArrayList<>();
        for (Transaction transaction : getAllTransactions()) {
            if(transaction.getDateOfTransaction().isAfter(startTime) && transaction.getDateOfTransaction().isBefore(endTime))
            {
                  transactionListByDate.add(transaction);
            }
        }
        return transactionListByDate;
    }

    @Override
    public List<Transaction> getAllTransactionsPerAccount(Account account) {
 List<Transaction>transactionListByAccount=new ArrayList<>();
        for (Transaction transaction : getAllTransactions()) {
            if(transaction.getToAccount().getNumberOfAccount().equals(account.getNumberOfAccount()) &&
                    (transaction.getTypeOfTransfer().equalsIgnoreCase("Wire") || transaction.getTypeOfTransfer().equalsIgnoreCase("Regular")))
                
            {
                  transactionListByAccount.add(transaction);
            }
            else{
              if(transaction.getFromAccount().getNumberOfAccount().equals(account.getNumberOfAccount()) &&
                    transaction.getTypeOfTransfer().equalsIgnoreCase("Debit"))
                      {
                         transactionListByAccount.add(transaction);
                      }
            }
        }
        return transactionListByAccount;    }

    @Override
    public List<Customers> getAllCustomersList() {
            return DBConfigration.getCustomersList();
    }

    @Override
    public List<Account> getAllAccountList() {
      return DBConfigration.getAccountList();
    }

    @Override
    public List<Account> getAllAccountListByCustmer(Customers customer) {
        List<Account>listOfAccounts=new ArrayList<>();
          for (Account account : getAllAccountList()) {
            if(account.getAccountOfCustomer().equals(customer))
                listOfAccounts.add(account);
                
        }
     return  listOfAccounts;
    }

    @Override
    public List<Transaction> getAllTransactions() {
    return DBConfigration.getTransactionsList();
    }
    
}
