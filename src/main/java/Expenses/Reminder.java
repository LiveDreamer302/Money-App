package Expenses;
import java.util.Date;
public class Reminder {
    private String message;
    private String frequency;
    private Date nextPayment;

    public Reminder(String message, String frequency, Date nextPayment) {
        this.message = message;
        this.frequency = frequency;
        this.nextPayment = nextPayment;
    }

    public String getMessage() {
        return message;
    }

    public String getFrequency() {
        return frequency;
    }

    public Date getNextPayment() {
        return nextPayment;
    }
}
