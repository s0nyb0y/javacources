package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\a7906\\IdeaProjects\\javacources\\resources\\shoes.csv");
        File fileOut = new File("C:\\Users\\a7906\\IdeaProjects\\javacources\\missing_shoes.txt");

        try {
            Scanner scanner = new Scanner(file);
            PrintWriter pw = new PrintWriter(fileOut);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] shoes = line.split(";");
                if (Integer.parseInt(shoes[2]) == 0) {
                    pw.println(shoes[0] + "," + shoes[1] + "," + shoes[2]);
                }
                if (shoes.length != 3) {
                    throw new IllegalAccessException("Некорректный входной файл");
                }
            }
            pw.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
