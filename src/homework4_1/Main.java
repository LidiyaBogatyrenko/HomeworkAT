package homework4_1;

import java.util.Scanner;

public class Main {
    /*
        Задача 1:
    Создать класс CreditCard c полями номер счета, текущая сумма на счету.
    Добавьте метод, который позволяет начислять сумму на кредитную карточку.
    Добавьте метод, который позволяет снимать с карточки некоторую сумму.
    Добавьте метод, который выводит текущую информацию о карточке.
    Напишите программу, которая создает три объекта класса CreditCard, у которых заданы номер счета и начальная сумма.
    Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
         */
    public static void main(String[] args) {
        CreditCard masterCard = new CreditCard("5106 2110 1025 5079", 12405);

        CreditCard visa = new CreditCard("4000 1234 5678 9010", 21500);

        CreditCard mir = new CreditCard("2200 7702 1272 7079", 7300);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму пополнения MasterCard: ");
        int creditMC = scanner.nextInt();
        masterCard.credit(creditMC);
        System.out.println("Успешное пополнение баланса MasterCard +" + creditMC + "р.");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите сумму пополнения VISA: ");
        int creditVisa = scanner1.nextInt();
        visa.credit(creditVisa);
        System.out.println("Успешное пополнение баланса VISA +" + creditVisa + "р.");

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите сумму снятия с карты МИР");
        int debitMir = scanner2.nextInt();
        mir.debit(debitMir);
        System.out.println("Успешное снятие средств с карты МИР -" + debitMir + "р.");

        masterCard.getInfo();
        visa.getInfo();
        mir.getInfo();
    }
}