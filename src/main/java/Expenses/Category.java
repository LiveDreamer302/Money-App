package Expenses;

public class Category {
    private String name;
    private String description;
    private double balanceAmount;

    public Category(String name, String description, double balanceAmount) {
        this.name = name;
        this.description = description;
        this.balanceAmount = balanceAmount;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }
}
