/**
 * @author DanHarding
 */
public class Move {

    int endRow;
    int endCol;
    //boolean jumpsPiece;

    public Move(int endRow, int endCol) {
        this.endRow = endRow;
        this.endCol = endCol;
        //this.jumpsPiece = jumpsPiece;
    }

    public boolean pieceBeingJumped(Board b) {
        if (b.isAPieceHere(this.endRow, this.endCol)) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "(" + this.endRow + "," + this.endCol + ")";
    }
}
