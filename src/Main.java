public class Main {
    public static void main(String[] args) {
        int a = 100; // баланс у клиента 80 рублей
        int b = 1500; // Сумма пополнения на баланс
        int c; // Сумма бонуса

        if (b < 1000) {c = 0;}
        else {c = b / 100;}

        int d = a + b + c; // Итоговый баланс клиента

        System.out.println(d);
    }
}