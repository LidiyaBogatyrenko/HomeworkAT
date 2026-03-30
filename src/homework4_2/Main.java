package homework4_2;

import java.util.Scanner;

public class Main {
    /*
  Задача 2:
Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100.
Сделать метод для добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение - успешность выполнения операции.
При снятии денег, функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
     */
    public static void main(String[] args) {
        Atm atm = new Atm(3, 2, 1);

        Scanner scanner20 = new Scanner(System.in);
        System.out.println("Внесите купюры номиналом 20");
        int addBanknote20 = scanner20.nextInt();

        Scanner scanner50 = new Scanner(System.in);
        System.out.println("Внесите купюры номиналом 50");
        int addBanknote50 = scanner50.nextInt();

        Scanner scanner100 = new Scanner(System.in);
        System.out.println("Внесите купюры номиналом 100");
        int addBanknote100 = scanner100.nextInt();

        atm.addBanknotes(addBanknote20, addBanknote50, addBanknote100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму для снятия наличных");
        int amount = scanner.nextInt();

        atm.giveMoney(amount);
    }
}