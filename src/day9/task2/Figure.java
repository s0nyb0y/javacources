package day9.task2;

public abstract class  Figure {
    protected String color;
    protected double a;
    protected double p;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public abstract double area();
    public abstract double perimeter();
}
