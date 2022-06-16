package day9.task2;

public class Triangle extends Figure {
    private double length1;
    private double length2;
    private double length3;

    public Triangle(String color) {
        super(color);
    }

    public Triangle(double length1, double length2, double length3,String color) {
        super(color);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    @Override
    public double area() {
        double halfP = (length1+length2+length3)/2;
        return Math.sqrt(halfP*(halfP-length1)*(halfP-length2)*(halfP-length3));
    }

    @Override
    public double perimeter() {
        return p = length1 + length2 + length3;
    }
}
