package day6;

public class Motorbike {
    private String model;
    private String color;
    private int inputYear;

    public Motorbike(String model, String color, int inputYear) {
        this.model = model;
        this.color = color;
        this.inputYear = inputYear;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return inputYear;
    }

    public void info() {
        System.out.print("Это мотоцикл");
    }

    public int yearDifference(int year) {
        if (inputYear > year)
            System.out.println("error");
        return year - inputYear;
    }
}
