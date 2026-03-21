package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2_5 {
    /*
Задача *:
Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
Для ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог ввести некорректные данные.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int summa = 0;
            if ((number > 0) && (number % 1 == 0)) {
                for (int i = 1; i <= number; i++) {
                    summa += i;
                }
                System.out.println("Сумма всех чисел от 1 до введённого числа = " + summa);
            } else {
                System.out.println("Ошибка: Вы ввели неположительное число.");
            }
        } else {
            System.out.println("Ошибка: Вы ввели нецелое число");
        }
    }
}
