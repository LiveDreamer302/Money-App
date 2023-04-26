package org.example;

import Actions.Expense;
import Actions.Income;
import Actions.Transaction;
import Actions.TransactionManager;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TransactionManager manager = new TransactionManager();

        // Add some transactions
        manager.addTransaction(new Expense(10.0, LocalDate.of(2023, 4, 25), "Food", "Lunch", "Credit Card", "Restaurant"));
        manager.addTransaction(new Expense(50.0, LocalDate.of(2023, 4, 24), "Groceries", "Weekly shopping", "Debit Card", "Supermarket"));
        manager.addTransaction(new Income(1000.0, LocalDate.of(2023, 4, 15), "Salary", "Monthly paycheck", "Employer"));

        // Print the total expenses and income for April 2023
        List<Transaction> aprilTransactions = manager.getTransactionsForMonth(2023, 4);

        double totalExpenses = manager.getTotalExpensesForMonth(2023, 4);
        double totalIncome = manager.getTotalIncomeForMonth(2023, 4);

        System.out.println("Transactions for April 2023:");
        for (Transaction transaction : aprilTransactions) {
            System.out.println(transaction.getAmount() + " " + transaction.getCategory() + " " + transaction.getDescription());
        }
        System.out.println("Total expenses for April 2023: " + totalExpenses);
        System.out.println("Total income for April 2023: " + totalIncome);
    }



}