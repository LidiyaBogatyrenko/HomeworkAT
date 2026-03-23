package homework3_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_1 {
    /*
Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер массива (просто целое число).
После того, как размер массива задан, заполнить его одним из двух способов: используя Math.random(), или каждый элемент массива вводится пользователем вручную.
Попробовать оба варианта. После заполнения массива данными, решить для него следующие задачи:
Задача 1:
Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите необходимую длину массива:");
        int size = scanner.nextInt();

        Random random = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Сгенерированный массив: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println("В обратном порядке: " + Arrays.toString(numbers));
    }
}