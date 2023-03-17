package day20;

public class Test {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        Battlefield battlefield1 = new Battlefield(player1);
        Battlefield battlefield2 = new Battlefield(player2);

        while (true) {
            battlefield1.makeTurn(player1, battlefield1.getMonitor(), battlefield2.getField());
            if (!Battlefield.winner) {
                break;
            }
            battlefield2.makeTurn(player2, battlefield2.getMonitor(), battlefield1.getField());
            if (!Battlefield.winner) {
                break;
            }
        }
    }
}
