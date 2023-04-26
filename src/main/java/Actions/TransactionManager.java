package Actions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<Transaction> transactions;

    public TransactionManager() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getTransactionsForMonth(int year, int month) {
        List<Transaction> result = new ArrayList<>();
        for (Transaction transaction : transactions) {
            LocalDate date = transaction.getDate();
            if (date.getYear() == year && date.getMonthValue() == month) {
                result.add(transaction);
            }
        }
        return result;
    }

    public double getTotalExpensesForMonth(int year, int month) {
        double total = 0.0;
        for (Transaction transaction : transactions) {
            if (transaction instanceof Expense) {
                LocalDate date = transaction.getDate();
                if (date.getYear() == year && date.getMonthValue() == month) {
                    total += transaction.getAmount();
                }
            }
        }
        return total;
    }

    public double getTotalIncomeForMonth(int year, int month) {
        double total = 0.0;
        for (Transaction transaction : transactions) {
            if (transaction instanceof Income) {
                LocalDate date = transaction.getDate();
                if (date.getYear() == year && date.getMonthValue() == month) {
                    total += transaction.getAmount();
                }
            }
        }
        return total;
    }
}
