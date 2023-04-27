package Expenses;
import java.util.Date;
public class Reminder {
    private String message;
    private String frequency;
    private Date nextPayement;

    public Reminder(String message, String frequency, Date nextPayement) {
        this.message = message;
        this.frequency = frequency;
        this.nextPayement = nextPayement;
    }

    public String getMessage() {
        return message;
    }

    public String getFrequency() {
        return frequency;
    }

    public Date getNextPayement() {
        return nextPayement;
    }
}
