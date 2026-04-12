package homework7;

import java.util.Scanner;

public class Homework7_2 {
    /*
    Задача 2:
Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
возрастания значений их длины.
     */
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст №1:");
            String text1 = scanner.nextLine();

            System.out.println("Введите текст №2:");
            String text2 = scanner.nextLine();

            System.out.println("Введите текст №3:");
            String text3 = scanner.nextLine();

            String minText = text1;
            String maxText = text2;
            String midText = text3;

            if (text1.length() < text2.length()) {
                minText = text1;
                maxText = text2;
            } else {
                minText = text2;
                maxText = text1;
            }

            if (text3.length() < minText.length()) {
                minText = text3;
            } else if (text3.length() > maxText.length()) {
                maxText = text3;
            }

            if (text1.length() != minText.length() && text1.length() != maxText.length()) {
                midText = text1;
            } else if (text2.length() != minText.length() && text2.length() != maxText.length()) {
                midText = text2;
            } else if (text3.length() != minText.length() && text3.length() != maxText.length()) {
                midText = text3;
            }
        System.out.println("Строки по возрастанию кол-ва символов: ".concat(minText).concat(", ").concat(midText).concat(", ".concat(maxText)));
        scanner.close();
    }
}