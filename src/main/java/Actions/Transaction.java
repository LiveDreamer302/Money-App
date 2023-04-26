package Actions;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private double amount;
    private LocalDate date;
    private String category;
    private String description;

    public Transaction(double amount, LocalDate date, String category, String description) {
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
}

