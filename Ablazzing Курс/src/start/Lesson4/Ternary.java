package start.Lesson4;

public class Ternary {
    public static void main(String[] args) {
        int money = 100;
        int breadPrice = 60;
        int moneyAfterShopping = money - breadPrice;
        int childMoney = moneyAfterShopping >= 50 ? 10 : 5;
        moneyAfterShopping -= moneyAfterShopping >= 50 ? 10 : 5;
        System.out.println(childMoney);
        System.out.println(moneyAfterShopping);
    }
}
