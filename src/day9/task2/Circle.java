package day9.task2;

public class Circle extends Figure {
    private int radius;

    public Circle(String color) {
        super(color);
    }

    public Circle(int radius,String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return a = (Math.PI * Math.pow(radius,2));
    }

    @Override
    public double perimeter() {
        return p = (2*Math.PI*radius);
    }
}
