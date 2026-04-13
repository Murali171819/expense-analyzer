package com.expense.expenseanalyzer.repository;

import com.expense.expenseanalyzer.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}