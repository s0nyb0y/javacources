package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder num = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            num.append(i+" ");
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.:" + (stopTime - startTime));
    }
}
class String1{
    long startTime = System.currentTimeMillis();
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String num = " ";
        for (int i = 0; i <= 20000; i++) {
            num+=i+" ";
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.:" + (stopTime - startTime));
    }
}
