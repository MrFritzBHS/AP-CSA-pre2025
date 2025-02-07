class Main {
    public static void main(String[] args) {

        /* Test with FRQ sample */
        int[][] testTiles = {
            {4, 3, 7, 4},
            {6, 4, 3, 3},
            {1, 2, 3, 4},
            {3, 2, 5, 2},
            {5, 9, 2, 2}
        };
        
        TileGame testGame = new TileGame();
        for (int[] nums : testTiles) {
            testGame.addTile(
                new NumberTile(nums[0], nums[1], nums[2], nums[3])
            );
        }

        NumberTile newTile = new NumberTile(4, 2, 9, 2);
        System.out.println(testGame.insertTile(newTile));
        for (NumberTile tile : testGame.getBoard()) {
            System.out.println(tile);
        }

        /* Test can't add tile */
        newTile = new NumberTile(0, 0, 0, 0);
        System.out.println(testGame.insertTile(newTile));

        /* Test empty board */
        testGame = new TileGame();
        testGame.insertTile(
            new NumberTile(1, 2, 3, 4)
        );
        System.out.println(testGame.getBoard());
    }
}
