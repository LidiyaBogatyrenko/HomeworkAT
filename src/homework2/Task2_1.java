package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_1 {
    /*
    Задача 1:
Ввести с консоли любое число от 1 до 12. В зависимости от введённого числа
вывести в консоль соответствующую пору года по номеру месяца. При решении
использовать switch.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}
