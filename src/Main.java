public class Main {
    public static void main(String[] args) {
        int currentMoney = 100;
        int sumAdded = 3100;
        int bonus;

        if (sumAdded >= 1000) {
            bonus = sumAdded / 100;
        } else {
            bonus = 0;
        }
        int finalSum = (currentMoney + sumAdded + bonus);

        System.out.println("Сумма на текущем счету равна " + finalSum);
        System.out.println("Бонусных рублей: " + bonus);
    }
}
