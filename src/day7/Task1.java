package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing",2015,145,28,0);
        Airplane airplane1 = new Airplane("Airbus",2018,150,27,0);

        Airplane.compareAirplanes(airplane,airplane1);
    }
}
