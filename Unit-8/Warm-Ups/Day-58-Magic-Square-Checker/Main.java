public class Main
{
    public static void main(String[] args)
    {
        // this one should pass
        int[][] magicSquare3x3 = {  
            {8, 1, 6},  
            {3, 5, 7},  
            {4, 9, 2}  
        };  
  
        // this one should fail
        int[][] notMagicSquare4x4 = {  
            {4, 15, 14, 1},
            {16, 3, 2, 13},  
            {5, 10, 11, 8},  
            {9, 6, 7, 12}  
        }; 
  
        // this one should fail
        int[][] allFives3x3 = {  
            {5, 5, 5},  
            {5, 5, 5},  
            {5, 5, 5}  
        };  
  
        // this one should fail
        int[][] otherNotMagicSquare4x4 = {  
            {1, 2, 3, 4},  
            {5, 6, 7, 8},  
            {9, 10, 11, 12},  
            {13, 14, 15, 16}  
        };
        
        // this one should pass
        int[][] magicSquare4x4 = {  
            {16, 2, 3, 13},  
            {5, 11, 10, 8},  
            {9, 7, 6, 12},  
            {4, 14, 15, 1}  
        }; 
    
        // Test your MagicSquareChecker methods here:
        
    }
    
}
