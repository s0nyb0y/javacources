package day9.task2;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(double width,double height,String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return a = width * height;
    }

    @Override
    public double perimeter() {
        return p = 2 * (width + height);
    }
}
