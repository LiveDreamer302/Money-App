package Actions;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "transactions")
public class Income extends Transaction {
    @Column(name = "source")

    private String source;

    public Income(double amount, LocalDate date, String category, String description, String source) {
        super(amount, date, category, description);
        this.source = source;
    }

    public String getSource() {
        return source;
    }
}
