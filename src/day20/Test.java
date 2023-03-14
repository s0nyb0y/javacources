package day20;

public class Test {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.userName();
        Player player2 = new Player();
        player2.userName();

        Battlefield battlefield1 = new Battlefield(player1);
        Battlefield battlefield2 = new Battlefield(player2);
        while (true) {
            Battlefield.makeTurn(player1, battlefield1.getMonitor(), battlefield2.getField());
            if (!Battlefield.winner) {
                return;
            }
            Battlefield.makeTurn(player2, battlefield2.getMonitor(), battlefield1.getField());
            if (!Battlefield.winner) {
                return;
            }
        }
    }
}
