package Actions;

import java.time.LocalDate;

public class Income extends Transaction {
    private String source;

    public Income(double amount, LocalDate date, String category, String description, String source) {
        super(amount, date, category, description);
        this.source = source;
    }

    public String getSource() {
        return source;
    }
}
