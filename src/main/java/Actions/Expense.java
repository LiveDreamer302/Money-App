package Actions;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "transactions")

public class Expense extends Transaction {
    @Column(name = "paymentMethod")

    private String paymentMethod;
    @Column(name = "payee")

    private String payee;

    public Expense(double amount, LocalDate date, String category, String description, String paymentMethod, String payee) {
        super(amount, date, category, description);
        this.paymentMethod = paymentMethod;
        this.payee = payee;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPayee() {
        return payee;
    }
}
