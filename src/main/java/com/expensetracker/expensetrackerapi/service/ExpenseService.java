package com.expensetracker.expensetrackerapi.service;

import com.expensetracker.expensetrackerapi.entity.Expense;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.Date;
import java.util.List;

public interface ExpenseService {
    Page<Expense> getAllExpenses(Pageable page);

    Expense getExpenseById(long id);

    void deleteExpenseById(Long id);

    Expense saveExpenseDetails(Expense expense);

    Expense updateExpenseDetails(Long id, Expense expense);

    List<Expense> readByCategory(String category,Pageable page);

    List<Expense> readByName(String keyword,Pageable page);

    List<Expense> readByDate(Date startDate, Date ensDate, Pageable page);
}
