class Main {  
    public static void main(String[] args) {  
        // Define Unicode variables for white pieces  
        String whiteKing = "\u2654";  
        String whiteQueen = "\u2655";  
        String whiteRook = "\u2656";  
        String whiteBishop = "\u2657";  
        String whiteKnight = "\u2658";  
        String whitePawn = "\u2659";  
          
        // Define Unicode variables for black pieces  
        String blackKing = "\u265A";  
        String blackQueen = "\u265B";  
        String blackRook = "\u265C";  
        String blackBishop = "\u265D";  
        String blackKnight = "\u265E";  
        String blackPawn = "\u265F";  
        
         // Define Unicode variables for squares  
        String whiteSquare = "\u25A1"; // White square  
        String blackSquare = "\u25A0"; // Black square  
  
        // Initialize a new 2D array that is an 8x8 grid.  
        String[][] chessBoard = new String[8][8];  
          
        // Use Unicode variables for white pieces in the first row
        String[] whitePieces = {whiteRook, whiteKnight, whiteBishop, whiteQueen, whiteKing, whiteBishop, whiteKnight, whiteRook};  
        chessBoard[0] = whitePieces;  
        
        // TODO 1 - use a loop to place each white pawn on the board
        
        
        // TODO 2 - Create a String[] array called blackPieces, and assign it the 
        //          proper black pieces similar to the whitePieces array
        
        
        // TODO 3 - use a loop to place each black pawn on the board 
        //          (bonus if you can sneak it into the white pawn loop)
        
        
        // TODO 4 - use loops to fill out the black and white squares to fill
        //          the remainder of the board
       
          
        // TODO 5 - make a loop to print each row of the chess board using the
        //          printRow method
        
        
    }  
      
    // This method prints out a given row in an array.  
    public static void printRow(String[][] array, int row) {  
        // System.out.println("Values for row " + row + ":");  
        for (int index = 0; index < array[row].length; index++) {  
            System.out.print(array[row][index] + " ");  
        }  
        System.out.println("");  
    }  
}
