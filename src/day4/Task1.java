package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите длину массива: ");
        int n = scanner.nextInt();

        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("длина массива: " + arr.length);
        System.out.println();

        int count8 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 8) {
                count8++;
                System.out.println("Количество чисел больше 8: " + count8);
            }
        }
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count1++;
                System.out.println("Количество чисел равных 1: " + count1);
            }
        }
        int countChet = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] == 0)
                    continue;
                countChet++;
            }
        }
        System.out.println("Количество чётных чисел: " + countChet);

        int countNeChet = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (arr[i] == 0)
                    continue;
                countNeChet++;
            }
        }
        System.out.println("Количество нечётных чисел: " + countNeChet);

        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        System.out.println("Сумма всех элементов массива: " + res);
    }
}
