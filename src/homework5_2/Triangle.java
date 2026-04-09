package homework5_2;

public class Triangle extends Figure {
    double a;
    double b;
    double c;
    double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double calculateTheArea() {
        double areaTriangle = a * h / 2;
        return areaTriangle;
    }

    @Override
    public double calculateThePerimeter() {
        double perimeterTriangle = a + b + c;
        return perimeterTriangle;
    }
}