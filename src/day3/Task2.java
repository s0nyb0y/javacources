package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double res;
        System.out.print("введите первое число: ");
        double num = scanner.nextDouble();
        System.out.print("введите второе число: ");
        double num2 = scanner.nextDouble();
        if (num2 == 0)
            return;
        res = num / num2;
        System.out.println("Результат деления ваших чисел: " + res);

    }
}