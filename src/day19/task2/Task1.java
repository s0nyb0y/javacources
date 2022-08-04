package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("resources\\taxi_cars.txt"));
            Map<Integer, Point> taxi = new HashMap<>();
            while (scanner.hasNext()) {
                String stringNum = scanner.nextLine();
                String[] number = stringNum.split(" ");
                int id = Integer.parseInt(number[0]);
                int x = Integer.parseInt(number[1]);
                int y = Integer.parseInt(number[2]);
                taxi.put(id, new Point(x, y));
            }
            scanner.close();
            searchTaxi(taxi);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void searchTaxi(Map<Integer, Point> map) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Для определения ваших координат, введите два положительных числа, числа в диапазоне от 0 - 99: ");
        int x1 = scanner1.nextInt();
        int y1 = scanner1.nextInt();
        while (x1 < 0 || y1 < 0) {
            System.out.println("введите положительные два числа: ");
            x1 = scanner1.nextInt();
            y1 = scanner1.nextInt();
        }

        System.out.println("Введите вторую группу чисел, числа должны быть больше первой группы: ");
        int x2 = scanner1.nextInt();
        int y2 = scanner1.nextInt();
        while ((x2 < 0 || y2 < 0) || (x2 <= x1 || y2 <= y1)) {
            System.out.println("введите положительные и/или числа больше первой группы: ");
            x2 = scanner1.nextInt();
            y2 = scanner1.nextInt();
        }

        int countTaxi = 0;
        for (int i = 1; i < map.size(); i++) {
            if (map.get(i).getX() > x1 && map.get(i).getX() < x2 && map.get(i).getY() > y1 && map.get(i).getY() < y2) {
                for (Map.Entry<Integer, Point> entry : map.entrySet()) {
                    if (entry.getKey().equals(i)) {
                        System.out.println("Номер машин по близости: " + i);
                        countTaxi++;
                    }
                }
            }
        }
        System.out.println("Общие количество машин доступных в этом районе: " + countTaxi);

    }
}
