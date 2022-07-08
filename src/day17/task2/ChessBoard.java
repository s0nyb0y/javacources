package day17.task2;

public class ChessBoard {
    ChessPiece[][] chessBord;

    public ChessBoard(ChessPiece[][] chessBord) {
        this.chessBord = chessBord;
    }

    public void print() {
        for (int i = 0; i < chessBord.length; i++) {
            for (int j = 0; j < chessBord.length; j++) {
                System.out.print(chessBord[i][j].getFigures());
            }
            System.out.println();
        }
    }
}
