import java.util.ArrayList;
import java.util.List;

/**
 * @author DanHarding
 */
public class King extends Piece {

    public King(int row, int col, boolean isBlack) {
        super(row, col, isBlack);
    }

    @Override
    public List<Move> listAllPossibleMoves(Board b) {
        List<Move> moves = new ArrayList<>();
        return moves;
    }

    @Override
    public String toString() {
        return this.isBlack ? "bK" : "rK";
    }
}
