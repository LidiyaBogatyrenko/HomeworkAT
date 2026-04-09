package homework5_2;

public class Square extends Figure {
    double a;
    double b;

    public Square(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateTheArea() {
        double areaSquared = a * b;
        return areaSquared;
    }

    @Override
   public double calculateThePerimeter() {
        double perimeterSquared = 2 * (a + b);
        return perimeterSquared;
    }
}