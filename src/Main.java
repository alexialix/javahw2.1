public class Main {
    public static void main(String[] args) {

        // Переменные
        int initialBalance = 100;  // Начальная сумма на счету
        int topUpAmount = 4328;    // Сумма пополнения

        // Рассчёт бонусов
        int bonus = 0;
        if (topUpAmount > 1000) {
            bonus = topUpAmount / 100;
        }

        // Итоговая сумма на счёте
        int finalBalance = initialBalance + topUpAmount + bonus;

        // Вывод результата
        System.out.println("Итоговая сумма на счёте: " + finalBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonus);

    }
}