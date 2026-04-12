package homework7;

import java.util.Scanner;

public class Homework7_5 {
    /*
    Задача 5:
    Вывести на консоль новую строку, которой задублирована каждая буква из начальной строки.
    Например, "Hello" -> "HHeelllloo"
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
             char currentLetter = word.charAt(i);
             sb.append(currentLetter).append(currentLetter);
        }
        System.out.println(sb);
        scanner.close();
    }
}