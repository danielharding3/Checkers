import java.util.List;

/**
 * @author DanHarding
 */

public abstract class Piece {

    int row;
    int col;
    boolean isBlack;

    public Piece(int row, int col, boolean isBlack) {
        this.row = row;
        this.col = col;
        this.isBlack = isBlack;
    }

    public abstract List<Move> listAllPossibleMoves(Board b);
}
