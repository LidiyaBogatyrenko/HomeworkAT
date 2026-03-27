package homework3_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_2 {
    /*
    Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер массива (просто целое число).
После того, как размер массива задан, заполнить его одним из двух способов: используя Math.random(), или каждый элемент массива вводится пользователем вручную.
Попробовать оба варианта. После заполнения массива данными, решить для него следующие задачи:
Задача 2:
Найти минимальный - максимальный элементы и вывести в консоль.
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

        int min = numbers[0];
        for (int i = 1; i <numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Минимальное число: " + min);

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Максимально число: " + max);
    }
}