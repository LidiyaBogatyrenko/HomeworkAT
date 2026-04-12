package homework7;

import java.util.Arrays;
import java.util.Scanner;

public class Homework7_4 {
    /*
    Задача 4:
    Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
    Если таких слов несколько, найти первое из них.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст №1:");
        String text1 = scanner.nextLine();

        System.out.println("Введите текст №2:");
        String text2 = scanner.nextLine();

        System.out.println("Введите текст №3:");
        String text3 = scanner.nextLine();

        String[] arrayLines = {text1, text2, text3};
        String uniqWord = null;
        boolean hasUniqWord = false;

        System.out.println(Arrays.toString(arrayLines));

        for (String line : arrayLines) {
            String[] words = line.split(" ");
            for (String word : words) {
                if (hasUniq(word)) {
                    uniqWord = word;
                    hasUniqWord = true;
                    break;
                }
            }
            if (hasUniqWord) {
                break;
            }
        }
        if (hasUniqWord) {
            System.out.println("Слово состоящее из разных символов: ".concat(uniqWord));
        } else {
            System.out.println("Отсутствует слово с различными символами.");
        }
        scanner.close();
    }

    private static boolean hasUniq(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j))
                    return false;
            }
        }
        return true;
    }
}