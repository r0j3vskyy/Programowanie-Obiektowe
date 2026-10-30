package Zestawy2026.ZestawP11.commerce;

public class Shop {
    private double revenue;
    private double expenses;
    private int employeeCount;

    private static Shop instance;

    private Shop(double revenue, double expenses, int employeeCount){
        this.revenue = revenue;
        this.expenses = expenses;
        this.employeeCount = employeeCount;
    }

    public static Shop getInstance(double revenue, double expenses, int employeeCount){
        if (instance == null) {
            instance = new Shop(revenue, expenses, employeeCount);
        }
        return instance;
    }
    public double getRevenue() {return revenue;}
    public double getExpenses() {return expenses;}
    public int getEmployeeCount() {return employeeCount;}
}
