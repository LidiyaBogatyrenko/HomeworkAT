package homework6;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework6 {
    /*
    Задача 1:
Создать класс с как минимум 4 разными методами,
в каждом методе добавить проверку на исключительные ситуации, используя:
1. try- catch
2. try-catch, где catch будет несколько
3. try -catch, с использованием multi - catch
4. try-catch-finally
Продемонстрировать обработку исключительных ситуаций на примерах
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = 0;
            int b = 5;
            System.out.println(b / a);
        } catch (ArithmeticException ex1) {
            System.out.println("Арифметическая ошибка. Делить на ноль нельзя");
        }
        System.out.println("Программа продолжила работать 1.");

        try {
            int[] numbers = {5, 7, 9, 2};
            System.out.println();
            System.out.println("Введите номер элемента массива, который хотите вывести на экран: ");
            System.out.println(numbers[scanner.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Выход за пределы массива.");
            // InputMismatchException - если ввести тип не int
        } catch (InputMismatchException ex3) {
            System.out.println("Ошибка. Необходимо ввести целое число.");
            scanner.nextLine();
        }
        System.out.println("Программа продолжила работать 2.");

        try {
            System.out.println();
            System.out.println("Сколько элементов должно быть в массиве?");
            int[] numbers = new int[scanner.nextInt()];
            System.out.println(Arrays.toString(numbers));
            // NegativeArraySizeException - если ввести отрицательное число
        } catch (InputMismatchException | NegativeArraySizeException ex4) {
            System.out.println("Ошибка, дружок. Введите целое число");
            scanner.nextLine();
        }
        System.out.println("Программа продолжила работать 3.");

        try {
            System.out.println();
            System.out.println("Введите ваш возраст");
            int age = scanner.nextInt();
            System.out.println("Вы ввели возраст: " + age);
        } catch (InputMismatchException ex5) {
            System.out.println("Ошибка. Ну и что ты ввёл?");
        } finally {
            System.out.println("Finally выполнен");
        }
        System.out.println("Программа продолжила работать 4.");

        scanner.close();
    }
}