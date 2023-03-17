package day20;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Battlefield {
    private final ShipsFigure[][] field;
    private final ShipsFigure[][] monitor;
    public static boolean winner = true;

    public Battlefield(Player player) {
        this.field = new ShipsFigure[10][10];
        this.monitor = new ShipsFigure[10][10];

        playerField(field, monitor);
        countShipDeck(player);
    }

    public ShipsFigure[][] getField() {
        return field;
    }

    public ShipsFigure[][] getMonitor() {
        return monitor;
    }

    public void playerField(ShipsFigure[][] field, ShipsFigure[][] monitor) {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < field.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] = ShipsFigure.EMPTY);
            }
            System.out.println();
        }
        for (int i = 0; i < monitor.length; i++) {
            for (int j = 0; j < monitor.length; j++) {
                monitor[i][j] = ShipsFigure.EMPTY;
            }
        }
    }

    public void countShipDeck(Player player) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> deckCount = new LinkedHashMap<>();
        deckCount.put(4, 1);
        deckCount.put(3, 2);
        deckCount.put(2, 3);
        deckCount.put(1, 4);
        int deck;
        int count;
        String n = " раза";
        String letsArrange;
        String countDeck;
        for (Map.Entry<Integer, Integer> entry : deckCount.entrySet()) {
            int q = 5;
            deck = entry.getKey();
            count = entry.getValue();
            while (q > deck) {
                if (count == 1) {
                    letsArrange = " поставь ";
                    countDeck = " палубный корабль";
                } else {
                    letsArrange = " расставь ";
                    countDeck = " палубные корабли ";
                }
                if (count == 1) {
                    System.out.println(player.getName() + "," + letsArrange + deck + countDeck);
                } else {
                    System.out.println(player.getName() + "," + letsArrange + deck + countDeck + entry.getValue() + n);
                }

                System.out.println("введи OX координату, значение должно быть в диапазоне 0-9 ");
                int x = scanner.nextInt();
                while (x < 0 || x > 9) {
                    System.out.println("значение должно быть в диапазоне 0-9");
                    x = scanner.nextInt();
                }

                System.out.println("введи OY координату, значение должно быть в диапазоне 0-9 ");
                int y = scanner.nextInt();
                while (y < 0 || y > 9) {
                    System.out.println("значение должно быть в диапазоне 0-9");
                    y = scanner.nextInt();
                }

                System.out.println("выбери направление кораблей:\nГоризонтальное направление, цифра - 1\nВертикальное направление, цифра - 2");
                int direction = scanner.nextInt();

                if (!isAvailable(x, y, deck, direction, field)) {
                    System.out.println("не все правила игры соблюдены");
                    continue;
                }

                for (int i = 0; i < deck; i++) {
                    if (direction == 1) {
                        field[x][y + i] = ShipsFigure.SHIP;
                    } else {
                        field[x + i][y] = ShipsFigure.SHIP;
                    }
                }
                showField(field);
                count--;
                q--;
            }
        }
    }

    public boolean isAvailable(int x, int y, int deck, int direction, ShipsFigure[][] field) {

        Scanner scanner = new Scanner(System.in);
        while (direction < 1 || direction > 2){
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
            int xi = 0;
            int yi = 0;
            for (int i = 0; i < deck; i++) {
                if (direction == 1) {
                    yi = i;
                } else {
                    xi = i;
                }
                if (x + 1 + xi < field.length && x + 1 + xi >= 0) {
                    if (field[x + 1 + xi][y + yi] != ShipsFigure.EMPTY) {
                        return false;
                    }
                }
                if (x - 1 + xi < field.length && x - 1 + xi >= 0) {
                    if (field[x - 1 + xi][y + yi] != ShipsFigure.EMPTY) {
                        return false;
                    }
                }
                if (y + 1 + yi < field.length && y + 1 + yi >= 0) {
                    if (field[x + xi][y + 1 + yi] != ShipsFigure.EMPTY) {
                        return false;
                    }
                }
                if (y - 1 + yi < field.length && y - 1 + yi >= 0) {
                    if (field[x + xi][y - 1 + yi] != ShipsFigure.EMPTY) {
                        return false;
                    }
                }
                deck--;
            }
        }

        return true;
    }

    public void makeTurn(Player player, ShipsFigure[][] monitor, ShipsFigure[][] field) {
        showMonitor(monitor);
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println(player.getName() + ", твой ход\nвведи OX координату, значение должно быть в диапазоне 0-9");
            int x = scanner.nextInt();
            while (x < 0 || x > 9) {
                System.out.println("значение должно быть в диапазоне 0-9");
                x = scanner.nextInt();
            }
            System.out.println("введи OY координату, значение должно быть в диапазоне 0-9");
            int y = scanner.nextInt();
            while (y < 0 || y > 9) {
                System.out.println("значение должно быть в диапазоне 0-9");
                y = scanner.nextInt();
            }
            if (player.getCount() == 19) {
                System.out.println(player.getName() + ", победил!!!");
                winner = false;
                break;
            } else {
                if (field[x][y] == ShipsFigure.SHIP) {
                    System.out.println("Есть пробитие!");
                    monitor[x][y] = ShipsFigure.HIT;
                    player.countPlayer();
                    showMonitor(monitor);
                } else {
                    System.out.println("Мимо... Переход хода противнику");
                    monitor[x][y] = ShipsFigure.MISS;
                    showMonitor(monitor);
                    break;
                }
            }
        }
    }

    public void showMonitor(ShipsFigure[][] monitor) {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < monitor.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < monitor.length; j++) {
                System.out.print(monitor[i][j]);
            }
            System.out.println();
        }
    }

    public void showField(ShipsFigure[][] field) {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < field.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
