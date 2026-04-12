package homework7;

import java.util.Scanner;

public class Homework7_1 {
    /*
    Задача 1:
Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
Вывести найденные строки и их длину.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст №1:");
        String text1 = scanner.nextLine();

        System.out.println("Введите текст №2:");
        String text2 = scanner.nextLine();

        System.out.println("Введите текст №3:");
        String text3 = scanner.nextLine();

        String minText;
        String maxText;
        if (text1.length() < text2.length()) {
            minText = text1;
            maxText = text2;
        } else {
            minText = text2;
            maxText = text1;
        }

        if  (maxText.length() > text3.length()) {
            minText = text3;
        } else if (maxText.length() < text3.length()) {
            maxText = text3;
        }

        System.out.println("Самая короткая строка: " + minText + " Длинна строки: " + minText.length());
        System.out.println("Самая длинная строка: " + maxText + "Длинна строки: " + maxText.length());
        scanner.close();
    }
}