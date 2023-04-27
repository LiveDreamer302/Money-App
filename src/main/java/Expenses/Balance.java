package Expenses;
import java.util.Date;
import java.util.List;
public class Balance {
    private Date startDate;
    private Date endDate;
    private List<Category> categories;

    public Balance(Date startDate, Date endDate, List<Category> categories) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.categories = categories;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public void addCategory(Category category) {
        categories.add(category);
    }
}