package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\a7906\\Desktop\\Test\\project.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[]stringNumbers = line.split(" ");
        int counter = 0;
        int[]numbers = new int[3];
        for (String number:stringNumbers) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
