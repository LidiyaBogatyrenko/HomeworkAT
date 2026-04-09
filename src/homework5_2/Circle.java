package homework5_2;

public class Circle extends Figure {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateTheArea() {
        double areaCircle = r * r * Math.PI;
        return areaCircle;
    }

    @Override
    public double calculateThePerimeter() {
        double perimeterCircle = 2 * r * Math.PI;
        return perimeterCircle;
    }
}