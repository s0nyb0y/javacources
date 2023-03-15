package day20;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Battlefield {
    private final ShipFigure[][] field;
    private final ShipFigure[][] monitor;
    public static boolean winner = true;

    public ShipFigure[][] getField() {
        return field;
    }

    public ShipFigure[][] getMonitor() {
        return monitor;
    }

    public Battlefield(Player player) {
        this.field = new ShipFigure[10][10];
        this.monitor = new ShipFigure[10][10];

        Map<Integer, Integer> ships = new LinkedHashMap<>();

        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < field.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] = ShipFigure.EMPTY);
            }
            System.out.println();
        }

        for (int i = 0; i < monitor.length; i++) {
            for (int j = 0; j < monitor.length; j++) {
                monitor[i][j] = ShipFigure.EMPTY;
            }
        }

        ships.put(4, 1);
        ships.put(3, 2);
        ships.put(2, 3);
        ships.put(1, 4);

        int deck;
        for (Map.Entry<Integer, Integer> ship : ships.entrySet()) {
            int q = 5;
            deck = ship.getKey();

            while (q > deck) {
                Scanner scanner = new Scanner(System.in);
                System.out.println(player.getName() + ", давай поставим " + deck + " палубный корабль");

                System.out.println("введи OX координату, значения должны быть в диапазоне 0-9: ");

                int x = scanner.nextInt();
                while (x < 0 || x > 9) {
                    System.out.println("значения должны быть в диапазоне 0-9");
                    x = scanner.nextInt();
                }

                System.out.println("введи OY координату, значения должны быть в диапазоне 0-9: ");
                int y = scanner.nextInt();
                while (y < 0 || y > 9) {
                    System.out.println("значения должны быть в диапазоне 0-9");
                    y = scanner.nextInt();
                }

                System.out.println("выбери направление корабля: \nГоризонтальное направление, цифра - 1\nВертикальное направление, цифра - 2");
                int direction = scanner.nextInt();

                if (!isAvailable(x, y, deck, direction, field)) {
                    System.out.println("не все условия игры выполнены");
                    continue;
                }

                for (int i = 0; i < deck; i++) {
                    if (direction == 1) {
                        field[x][y + i] = ShipFigure.SHIP;
                    } else {
                        field[x + i][y] = ShipFigure.SHIP;
                    }
                }
                showField(field);
                q--;

            }
        }
    }

    public static void showField(ShipFigure[][] field) {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < field.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    public boolean isAvailable(int x, int y, int deck, int direction, ShipFigure[][] field) {
        while (direction < 1 || direction > 2) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("не корректное значение\nГоризонтальное направление, цифра - 1\nВертикальное направление, цифра - 2");
            direction = scanner.nextInt();
        }

        if (direction == 1) {
            if (y + deck > field.length) {
                return false;
            }
        }
        if (direction == 2) {
            if (x + deck > field.length) {
                return false;
            }
        }

        while (deck != 0) {
            for (int i = 0; i < deck; i++) {
                int xi = 0;
                int yi = 0;
                if (direction == 1) {
                    yi = i;
                } else {
                    xi = i;
                }
                if (x + 1 + xi < field.length && x + 1 + xi >= 0) {
                    if (field[x + 1 + xi][y + yi] != ShipFigure.EMPTY) {
                        return false;
                    }
                }
                if (x - 1 + xi < field.length && x - 1 + xi >= 0) {
                    if (field[x - 1 + xi][y + yi] != ShipFigure.EMPTY) {
                        return false;
                    }
                }
                if (y + 1 + yi < field.length && y + 1 + yi >= 0) {
                    if (field[x + xi][y + 1 + yi] != ShipFigure.EMPTY) {
                        return false;
                    }
                }
                if (y - 1 + yi < field.length && y - 1 + yi >= 0) {
                    if (field[x + xi][y - 1 + yi] != ShipFigure.EMPTY) {
                        return false;
                    }
                }
            }
            deck--;
        }

        return true;
    }

    public static void makeTurn(Player player, ShipFigure[][] monitor, ShipFigure[][] battlefield) {
        showMonitor(monitor);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(player.getName() + ", твой ход: ");
            System.out.println("введи OX координату, значения должны быть в диапазоне 0-9: ");
            int x = scanner.nextInt();
            while (x < 0 || x > 9) {
                System.out.println("значения должны быть в диапазоне 0-9");
                x = scanner.nextInt();
            }

            System.out.println("введи OY координату, значения должны быть в диапазоне 0-9: ");
            int y = scanner.nextInt();
            while (y < 0 || y > 9) {
                System.out.println("значения должны быть в диапазоне 0-9");
                y = scanner.nextInt();
            }
            if (player.getCount() == 19) {
                System.out.println(player.getName() + ", победил!!!");
                winner = false;
                break;

            } else {
                if (battlefield[x][y] == ShipFigure.SHIP) {
                    System.out.println("Есть пробитие!");
                    monitor[x][y] = ShipFigure.HIT;
                    player.count();
                    showMonitor(monitor);

                } else {
                    System.out.println("Мимо... Переход хода, противнику ");
                    monitor[x][y] = ShipFigure.MISS;
                    showMonitor(monitor);
                    break;
                }
            }
        }
    }

    public static void showMonitor(ShipFigure[][] monitor) {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < monitor.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < monitor.length; j++) {
                System.out.print(monitor[i][j]);
            }
            System.out.println();
        }
    }
}
