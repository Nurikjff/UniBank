/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankone.unibank.Util.Impl;

import com.bankone.unibank.Entity.Account;
import com.bankone.unibank.Entity.Customers;
import com.bankone.unibank.Util.Interface.EmployerInterUtil;

/**
 *
 * @author Nurlan Jafarov
 */
public class EmployerImplUtil implements EmployerInterUtil{

    @Override
    public boolean acceptAccount(Account account) {
          if(account.getAccountOfCustomer() != null && account.getAmountOfMoney()>=0 && account.getTypeOfAccount()!=null)
          {
            return true;
          }
          else {
            return false;
          }
          
    }

    @Override
    public boolean lookPersonalDataOfEachClient(Customers customers) {
         if(customers != null)
         {
           return true;
         }
         else
         {
           return false;
         }
    }
    
    
    
}
