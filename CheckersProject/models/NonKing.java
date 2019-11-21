import java.util.ArrayList;
import java.util.List;

/**
 * @author DanHarding
 */
public class NonKing extends Piece {

    public NonKing(int row, int col, boolean isBlack) {
        super(row, col, isBlack);
    }

    @Override
    public List<Move> listAllPossibleMoves(Board b) {
        List<Move> moves = new ArrayList<>();
        return moves;
    }

    public String toString() {
        return this.isBlack ? "bN" : "rN";
    }
}
