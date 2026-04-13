package com.expense.expenseanalyzer.service;

import com.expense.expenseanalyzer.model.Transaction;
import com.expense.expenseanalyzer.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repo;

    public Transaction addTransaction(Transaction transaction) {
        return repo.save(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return repo.findAll();
    }
}