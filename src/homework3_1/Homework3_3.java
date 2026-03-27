package homework3_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_3 {
    /*
    Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер массива (просто целое число).
После того, как размер массива задан, заполнить его одним из двух способов: используя Math.random(), или каждый элемент массива вводится пользователем вручную.
Попробовать оба варианта. После заполнения массива данными, решить для него следующие задачи:
Задача 3:
Найти индексы минимального и максимального элементов и вывести в консоль.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите необходимую длину массива: ");
        int size = scanner.nextInt();

        Random random = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Сгенерированный массив: " + Arrays.toString(numbers));

        int min_index = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[min_index]) {
                min_index = i;
            }
        }
        System.out.println("Индекс минимального значения: " + min_index);

        int max_index = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[max_index]) {
                max_index = i;
            }
        }
        System.out.println("Индекс максимального значения: " + max_index);
    }
}