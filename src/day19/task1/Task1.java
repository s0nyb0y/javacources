package day19.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите слово: ");
        Scanner scanner1 = new Scanner(System.in);
        String word = scanner1.nextLine();
        List<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("resources\\dushi.txt"));
            scanner.useDelimiter("[.,:;()?!><\"\\s–]+");
            while (scanner.hasNext()) {
                list.add(scanner.next());
            }
            int count = 0;
            for (String i : list) {
                if (i.equals(word))
                    count++;
            }
            scanner.close();
            if (count == 0){
                System.out.println("Такое слово в поэме не встречается");
            }else {
                System.out.println("Количество повторений этого слова в поэме: " + count);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}