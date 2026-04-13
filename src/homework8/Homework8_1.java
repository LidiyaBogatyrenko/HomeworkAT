package homework8;

import java.util.*;

public class Homework8_1 {
    /*
    Задача 1:
Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
Вывести результат на экран.
При решении использовать коллекции.
     */
    public static void main(String[] args) {

        System.out.println("Введите числа одной строкой через запятую и пробел:");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        String[] arrayValue = value.split(", ");

        Set<String> numbers = new LinkedHashSet<>();

        for (String v : arrayValue) {
            numbers.add(v);
        }

        System.out.println("Числа без дублей: ".concat(String.join(", ", numbers)));

        scanner.close();
    }
}