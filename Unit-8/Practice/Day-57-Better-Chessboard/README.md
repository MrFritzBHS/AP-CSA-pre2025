# Better Chessboard

Rather than writing strings of piece names, we can populate a chessboard with the proper unicode characters.

Your task is to complete the chessboard so that it looks like a game of chess ready to be played. 

## The Process

Look for each `TODO` task in the code, and complete each as described.

## Final configuration

The board should look like this:

![](https://github.com/MrFritzBHS/AP-CSA/blob/main/Unit-8/Practice/Day-57-Better-Chessboard/assets/chessBoard.png?raw=true)

If you need to learn how to set up the board, see [here](https://www.regencychess.co.uk/how_to_set_up_a_chessboard.html)

## Challenge 1

Make a static function called `movePiece` which takes the following parameters:

- board 2D array
- startRow
- startColumn
- endRow
- endColumn

When calling the function, the end result should be that the piece in the starting row and column should be moved to the ending row and column. It should also replace the starting row and starting column element the appropriate square (white or black).

> Hint: you'll need to determine which combinations of even/odd rows/columns result in white/black squares


## Challenge 2

Once you've set up the chessboard, add some user input! Allow a user to move pieces. This will take some thought.

## Even bigger challenge

Add a second user to play chess! You can assume the players only make legal moves, so no need to prevent improper play. Allow for users to take pieces, and don't worry about determining check or checkmate. Let the users worry about that.
