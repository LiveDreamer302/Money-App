package Actions;

import java.time.LocalDate;

public class Expense extends Transaction {
    private String paymentMethod;
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
