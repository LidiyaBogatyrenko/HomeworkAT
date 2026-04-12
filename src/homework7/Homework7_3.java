package homework7;

import java.util.Scanner;

public class Homework7_3 {
    /*
    Задача 3:
    Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше средней, а также их длину.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст №1:");
        String text1 = scanner.nextLine();

        System.out.println("Введите текст №2:");
        String text2 = scanner.nextLine();

        System.out.println("Введите текст №3:");
        String text3 = scanner.nextLine();

        double average = (text1.length() + text2.length() + text3.length()) / 3;

        System.out.println("Средняя длина строк: " + average);
        System.out.println("Строки меньше средней длины: ");

        if (text1.length() < average) {
            System.out.println("\"".concat(text1).concat("\"").concat(". Длина строки: ").concat(String.valueOf(text1.length())));
        }
        if (text2.length() < average) {
            System.out.println("\"".concat(text2).concat("\"").concat(". Длина строки: ").concat(String.valueOf(text2.length())));
        }
        if (text3.length() < average) {
            System.out.println("\"".concat(text3).concat("\"").concat(". Длина строки: ").concat(String.valueOf(text3.length())));
        }
        if (text1.length() >= average && text2.length() >= average && text3.length() >= average) {
            System.out.println("Отсутствуют строки длина, которых меньше средней длины.");
        }
        scanner.close();
    }
}