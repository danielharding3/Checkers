/**
 * @author DanHarding
 */
public class Board {
    Piece[][] grid;

    public Board() {
        this.grid = new Piece[8][8];

        //Black pieces
        this.grid[0][1] = new NonKing(0, 1, true);
        this.grid[0][3] = new NonKing(0, 3, true);
        this.grid[0][5] = new NonKing(0, 5, true);
        this.grid[0][7] = new NonKing(0, 7, true);

        this.grid[1][0] = new NonKing(1, 0, true);
        this.grid[1][2] = new NonKing(1, 2, true);
        this.grid[1][4] = new NonKing(1, 4, true);
        this.grid[1][6] = new NonKing(1, 6, true);

        this.grid[2][1] = new NonKing(2, 1, true);
        this.grid[2][3] = new NonKing(2, 3, true);
        this.grid[2][5] = new NonKing(2, 5, true);
        this.grid[2][7] = new NonKing(2, 7, true);

        //Red pieces
        this.grid[7][0] = new NonKing(7, 0, false);
        this.grid[7][2] = new NonKing(7, 2, false);
        this.grid[7][4] = new NonKing(7, 4, false);
        this.grid[7][6] = new NonKing(7, 6, false);

        this.grid[6][1] = new NonKing(6, 1, false);
        this.grid[6][3] = new NonKing(6, 3, false);
        this.grid[6][5] = new NonKing(6, 5, false);
        this.grid[6][7] = new NonKing(6, 7, false);

        this.grid[5][0] = new NonKing(5, 0, false);
        this.grid[5][2] = new NonKing(5, 2, false);
        this.grid[5][4] = new NonKing(5, 4, false);
        this.grid[5][6] = new NonKing(5, 6, false);
    }

    public boolean isAPieceHere(int row, int col) {
        if (this.grid[row][col] != null)
            return true;
        else
            return false;
    }

    public void drawBoard() {
        String str;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (!this.isAPieceHere(i, j)) {
                    if ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0 )) {
                        str = "##";
                        System.out.print(str + " ");
                    } else {
                        str = "  ";
                        System.out.print(str + " ");
                    }
                } else {
                    System.out.print(this.grid[i][j] + " ");
                }

                if (j == 7) {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }

}
