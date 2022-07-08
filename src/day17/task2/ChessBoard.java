package day17.task2;

public class ChessBoard {
    ChessPiece[][] chessBord;

    public ChessBoard(ChessPiece[][] chessBord) {
        this.chessBord = chessBord;
        for (int i = 0; i < chessBord.length; i++) {
            for (int j = 0; j < chessBord.length; j++) {
                chessBord[i][j] = ChessPiece.EMPTY;
            }
        }
        chessBord[0][0] = ChessPiece.ROOK_BLACK;
        chessBord[0][5] = ChessPiece.ROOK_BLACK;
        chessBord[0][6] = ChessPiece.KING_BLACK;
        chessBord[1][1] = ChessPiece.ROOK_WHITE;
        chessBord[1][4] = ChessPiece.PAWN_BLACK;
        chessBord[1][5] = ChessPiece.PAWN_BLACK;
        chessBord[1][7] = ChessPiece.PAWN_BLACK;
        chessBord[2][0] = ChessPiece.PAWN_BLACK;
        chessBord[2][2] = ChessPiece.KNIGHT_BLACK;
        chessBord[2][6] = ChessPiece.PAWN_BLACK;
        chessBord[3][0] = ChessPiece.QUEEN_BLACK;
        chessBord[3][3] = ChessPiece.BISHOP_WHITE;
        chessBord[4][3] = ChessPiece.BISHOP_BLACK;
        chessBord[4][4] = ChessPiece.PAWN_WHITE;
        chessBord[5][4] = ChessPiece.BISHOP_WHITE;
        chessBord[5][5] = ChessPiece.PAWN_WHITE;
        chessBord[6][0] = ChessPiece.PAWN_WHITE;
        chessBord[6][3] = ChessPiece.QUEEN_WHITE;
        chessBord[6][5] = ChessPiece.PAWN_WHITE;
        chessBord[6][7] = ChessPiece.PAWN_WHITE;
        chessBord[7][5] = ChessPiece.ROOK_WHITE;
        chessBord[7][6] = ChessPiece.KING_WHITE;
    }

    public void print() {
        for (int i = 0; i < chessBord.length; i++) {
            for (int j = 0; j < chessBord.length; j++) {
                System.out.print(chessBord[i][j]);
            }
            System.out.println();
        }
    }
}
