package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing",2010,150,28,0);
        airplane.fillUp(150);
        airplane.info();
        Airplane airplane1 = new Airplane("Airbus",2018,145,27,0);
        airplane1.setYear(2015);
        airplane1.setLength(145);
        airplane1.fillUp(250);
        airplane1.fillUp(120);
        airplane1.info();
    }
}
