package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Maybach");
        car.setColor("Black");
        car.setYear(2022);
        System.out.println(car.getModel()+" "+car.getColor()+" "+car.getYear());
    }
}
class Car{
    private String model;
    private String color;
    private int year;

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
}
