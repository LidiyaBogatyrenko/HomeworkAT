package homework1;

public class Homework1_4 {
    /*
    Задача 4:
В переменной n хранится вещественное число с ненулевой дробной частью.
Создайте программу, которая округляет число n до ближайшего целого и выводящую результат на экран.
     */
    public static void main(String[] args) {
        double n = 5.711235;
        int a = (int) (n + 0.5);
        System.out.println(a);
    }
}
