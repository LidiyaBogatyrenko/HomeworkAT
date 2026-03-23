package homework3_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_6 {
    /*
    Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер массива (просто целое число).
После того, как размер массива задан, заполнить его одним из двух способов: используя Math.random(), или каждый элемент массива вводится пользователем вручную.
Попробовать оба варианта. После заполнения массива данными, решить для него следующие задачи:
Задача 6:
Проверить, является ли массив возрастающей последовательностью (каждое следующее число больше предыдущего).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите необходимую длину массива: ");
        int size = scanner.nextInt();

        Random random = new Random();
        int[] numbers = new int[size];

        System.out.println("Введите элементы массива");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Получившийся массив: " + Arrays.toString(numbers));

        boolean asc = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                asc = false;
                break;
            }
        }
            if (asc) {
                System.out.println("Массив возрастающий");
            } else {
                System.out.println("Массив не возрастающий");
            }
    }
}