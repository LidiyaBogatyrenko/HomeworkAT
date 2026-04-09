package homework5_2;

public class Main {
    /*
    Задача 2:
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра (используя абстрактный класс/методы).
Создать массив из 5 разных фигур.
Вывести на экран сумму периметра всех фигур в массиве.
     */
    public static void main(String[] args) {
        Figure[] figure = new Figure[5];
        figure[0] = new Square(4, 5);
        figure[1] = new Triangle(9, 9, 9, 8);
        figure[2] = new Circle(5);
        figure[3] = new Square(10, 5);
        figure[4] = new Circle(4);

        double sumPerimeter = 0;
        for (Figure figures : figure) {
            sumPerimeter += figures.calculateThePerimeter();
       }
        System.out.println("Сумма периметров всех фигур в массиве = " + sumPerimeter);
    }
}