package com.bank.service;

import com.bank.model.BankAccount;
import com.bank.dto.TransactionDTO;

import java.math.BigDecimal;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BankingService {

    private BankAccount account;

    public BankingService() {
        this.account = new BankAccount();
    }

    public BigDecimal checkBalance() {
        return account.getBalance();
    }

    public void deposit(TransactionDTO transaction) {
        account.deposit(transaction.getAmount());
    }

    public void withdraw(TransactionDTO transaction) {
        account.withdraw(transaction.getAmount());
    }

    public void createAccount(String accountNumber) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be null or empty");
        }
        account.setAccountNumber(accountNumber);
        account.setBalance(BigDecimal.ZERO);
    }
}