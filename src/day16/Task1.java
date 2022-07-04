package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\a7906\\IdeaProjects\\javacources\\test.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String digits = scanner.nextLine();
            String[] arrayNumbers = digits.split(" ");
            double sum = 0;
            double res = 0;
            for (String number : arrayNumbers) {
                res = (sum += Integer.parseInt(number)) / arrayNumbers.length;
            }

            System.out.println(res);
            Formatter formatter = new Formatter();
            formatter.format("%.3f",res);
            System.out.println(formatter);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
