# Magic Square Checker  
  
## Objective  
Create a static class to check if a given square is a magic square by implementing specific methods. 

> Note, a 3x3 magic square should have sums equal to 15, and a 4x4 magic square should have sums equal to 34
  
## Task Description  
Implement the following methods to complete the "magic square checker":  
  
1. **`getMagicNumber(int[][] square)`**:  
   - **Purpose**: Determine the number each row/col/diagnoal should sum to. (Hint: if n is the number of rows, find the sum of all numbers 1 + 2 + ... + n^2 and divide by n)
   - **Returns**: the `int` for the desired sum of each row/col/diagonal
     
2. **`checkRow(int[][] square, int rowIndex)`**:  
   - **Purpose**: Check if a specified row sums to the correct magic number.  
   - **Returns**: `true` if the row sums correctly.  
  
3. **`checkColumn(int[][] square, int colIndex)`**:  
   - **Purpose**: Check if a specified column sums to the correct magic number.  
   - **Returns**: `true` if the column sums correctly.  
  
4. **`checkDiagonals(int[][] square)`**:  
   - **Purpose**: Check if both diagonals sum to the correct magic number.  
   - **Returns**: `true` if both diagonals sum correctly.  
  
5. **`isMagicSquare(int[][] square)`**:
   - **Purpose**: Check if the square is a magic square. It checks the sum of every row, column, and diagonals (use the methods you just made!)
   - **Returns**: `true` if it's a magic square

6. ***Challenge*** **`allNumbersUsed(int[][] square)`**:
   - **Purpose**: Determines if numbers 1 - n are used in the square, where n is the `square.length * square.length`
   - **Returns**: `true` if all numbers are present in `square`
   - Be sure to implement this in your `isMagicSquare` method.
  
## Testing your code

Use the various 2d arrays in the `main` method of the `Main` class to test your code
