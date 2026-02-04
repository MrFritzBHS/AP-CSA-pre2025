import java.util.ArrayList;

class TileGame {
    private ArrayList<NumberTile> board;

    public TileGame() {
        board = new ArrayList<NumberTile>();
    }

    public void addTile(NumberTile tile) {
        board.add(tile);
    }

    private int getIndexForFit(NumberTile tile) {
        /* part a */
        return 0;
    }

    public boolean insertTile(NumberTile tile) {
        /* part b */
        return false;
    }

    public ArrayList<NumberTile> getBoard() {
        return board;
    }
}
