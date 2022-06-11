package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введи цифру a: ");
        int a = scanner.nextInt();
        System.out.print("введи цифру b: ");
        int b = scanner.nextInt();
        int i = a + 1;
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        while (i < b) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
