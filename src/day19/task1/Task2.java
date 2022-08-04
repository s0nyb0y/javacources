package day19.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        try {
            Scanner scanner = new Scanner(new File("resources\\dushi.txt"));
            scanner.useDelimiter("[.,:;()?!<>\"\\s–]+");
            while (scanner.hasNext()) {
                String words = scanner.next().toLowerCase();
                if (map.containsKey(words)) {
                    map.put(words, map.get(words) + 1);
                } else {
                    map.put(words, 1);
                }
            }
            for (int i = 0; i < 100; i++) {
                int count = 0;
                String word = null;
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    if (entry.getValue() > count) {
                        count = entry.getValue();
                        word = entry.getKey();
                    }
                }
                System.out.println("Количество повторений: " + count + " слова - " + word);
                map.remove(word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
