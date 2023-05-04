package Actions;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "transactions")

public class Transaction {

    @Column(name = "amount")

    private double amount;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "category")

    private String category;
    @Column(name = "description")

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

