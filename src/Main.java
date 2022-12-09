public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int replenishment = 1500;
        int bonus = 0;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        }
        int endBalance = currentBalance + replenishment + bonus;

        System.out.println(endBalance + " количество бонусных рублей: " + bonus);
    }
}
