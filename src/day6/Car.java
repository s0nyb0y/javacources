package day6;

public class Car {
    private String model;
    private String color;
    private int inputYear;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.inputYear = year;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return color;
    }

    public int getInputYear() {
        return inputYear;
    }

    public void info() {
        System.out.print("Это автомобиль");
    }

    public int yearDifference(int year) {
        return year - inputYear;
    }
}
