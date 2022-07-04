package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        File fileOut = new File("file1.txt");
        Random random = new Random();
        PrintWriter pw1 = new PrintWriter(fileOut);
        for (int i = 0; i < 1000; i++) {
            pw1.println(random.nextInt(100) + 1);
        }
        pw1.close();

        File file = new File("file1.txt");
        File fileOut2 = new File("file2.txt");
        PrintWriter pw2 = new PrintWriter(fileOut2);
        Scanner scanner = new Scanner(file);
        int sum = 0;
        int counter = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            counter++;

            if (counter == 20) {
                pw2.print(sum / 20.0 + " ");
                counter = 0;
                sum = 0;
            }
        }
        pw2.close();
        printResult(fileOut2);
    }

    public static void printResult(File file) {
        try {
            double res = 0;
            Scanner scanner2 = new Scanner(file);
            String line = scanner2.nextLine();
            String[] num = line.split(" ");
            for (String number:num) {
                res+=Double.parseDouble(number);
            }
            System.out.println((int) res);
            scanner2.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}