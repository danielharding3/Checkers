import java.util.ArrayList;
import java.util.List;

/**
 * @author DanHarding
 */
public class NonKing extends Piece {

    boolean noMoves;

    public NonKing(int row, int col, boolean isBlack) {
        super(row, col, isBlack);
    }

    @Override
    public List<Move> listAllPossibleMoves(Board b) {
        //boolean jumpsPiece;
        //boolean emptySlot;
        List<Move> moves = new ArrayList<>();
        Move m1 = null;
        Move m2 = null;
        if (this.isBlack) {
            if (b.isInBounds(this.row + 1, this.col - 1))
                m1 = new Move(this.row + 1, this.col - 1);
            if (b.isInBounds(this.row + 1, this.col + 1))
                m2 = new Move(this.row + 1, this.col + 1);
        } else {
            if (b.isInBounds(this.row - 1, this.col + 1))
                m1 = new Move(this.row - 1, this.col + 1);
            if (b.isInBounds(this.row - 1, this.col - 1 ))
                m2 = new Move(this.row - 1, this.col - 1);
        }

        if (m1.pieceBeingJumped(b) && !m2.pieceBeingJumped(b)) {
            moves.add(m1);
        } else if (!m1.pieceBeingJumped(b) && m2.pieceBeingJumped(b)) {
            moves.add(m2);
        } else {
            if (m1 != null) moves.add(m1);
            if (m2 != null) moves.add(m2);
        }

        if (moves.isEmpty()) noMoves = true;
        return moves;
    }


    @Override
    public String toString() {
        return this.isBlack ? "bN" : "rN";
    }
}
