package Zestawy2026.ZestawP11.commerce;

public class TestShop {
    public static void main(String[] args) {
        Shop sklep1 = Shop.getInstance(5000.0, 2000000.0, 15);
        Shop sklep2 = Shop.getInstance(10.0, 5.0, 2);

        System.out.println("shop1 = shop2: " + (sklep1 == sklep2));
        System.out.println(sklep1.getRevenue());
        System.out.println(sklep1.getExpenses());
        System.out.println(sklep1.getEmployeeCount());
    }
}
