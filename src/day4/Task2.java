package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        int max = 0;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        int min = 10000;
        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println("Наименьший элемент массива: " + min);

        int count10 = 0;
        for (int element : arr) {
            if (element % 10 == 0)
                count10++;
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count10);

        int res = 0;
        for (int element : arr) {
            if (element % 10 == 0)
                res += element;
        }
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + res);
    }
}
