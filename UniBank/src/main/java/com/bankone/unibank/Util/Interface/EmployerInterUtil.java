/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankone.unibank.Util.Interface;

import com.bankone.unibank.Entity.Account;
import com.bankone.unibank.Entity.Customers;

/**
 *
 * @author Nurlan Jafarov
 */
public interface EmployerInterUtil {
    public  boolean acceptAccount(Account account);
    public  boolean lookPersonalDataOfEachClient(Customers customers);
}
