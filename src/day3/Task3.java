package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double res;
        for (int i = 0; i < 5; i++) {
            System.out.print("введите число: ");
            double num = scanner.nextDouble();
            System.out.print("введи первое число: ");
            int num2 = scanner.nextInt();
            if (num2 == 0) {
                System.out.println("Деление на ноль");
                continue;
            }
            res = num / num2;
            System.out.println(res);
        }
    }
}

