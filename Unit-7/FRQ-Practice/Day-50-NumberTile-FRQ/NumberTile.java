class NumberTile {
    // 0 - top; 1 - right; 2 - bottom; 3 - left
    private int[] sides = new int[4];

    // create a random tile
    public NumberTile() {
        for (int i = 0; i < sides.length; i++) {
            sides[i] = (int)(Math.random()*9) + 1;
        }
    }

    /** Create a custom NumberTile object
     *  @param t the number on the top of the tile
     *  @param r the number on the right of the tile
     *  @param b the number on the bottom of the tile
     *  @param l the number on the left of the tile
     *
     */
    public NumberTile(int t, int r, int b, int l) {
        sides[0] = t;
        sides[1] = r;
        sides[2] = b;
        sides[3] = l;
    }

    /** 
     *    Rotates the tile 90 degrees clockwise
     */
    public void rotate() {
        int oldTop = sides[0];
        sides[0] = sides[3];
        sides[3] = sides[2];
        sides[2] = sides[1];
        sides[1] = oldTop;
    }

    public int getLeft() {
        return sides[3];
    }

    public int getRight() {
        return sides[1];
    }
}T