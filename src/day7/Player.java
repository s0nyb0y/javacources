package day7;

public class Player {
    private int stamina;

    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    public void run() {
        if (stamina == 0)
            return;
        stamina--;
        if (stamina == 0)
            countPlayers--;
    }

    public static void info() {
        String freePlace = "";
        if (countPlayers < 6) {
            switch (6 - countPlayers) {
                case 1:
                    freePlace = " свободное место";
                    break;
                case 2:
                case 3:
                    freePlace = " свободных места";
                    break;
                case 4:
                case 5:
                case 6:
                    freePlace = " свободных мест";
                    break;
            }
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + freePlace);
        } else {
            System.out.println("Нет свободных мест");
        }
    }
}
