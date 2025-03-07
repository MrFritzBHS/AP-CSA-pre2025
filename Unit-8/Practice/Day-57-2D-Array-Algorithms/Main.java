public class Main {
    public static void main(String[] args) {
        // Test your methods below by uncommenting the code

        String[][] words = {{"Apple", "Banana", "Cherry"},
                    {"Danish", "Eclair", "Froyo"},
                    {"Green", "Hearts", "Banana"}};
        int[][] nums = {{23, 52, 99, 12},
                        {58, 29, 22, 10},
                        {98, 98, 17, 18},
                        {51, 57, 88, 92}};

        // System.out.println("\nTesting print2DArray\n");
        // print2DArray(words);
        // print2DArray(nums);

        
        // System.out.println("\nTesting fillArray\n");
        // String[][] blanks = new String[5][3];
        // fillArray(blanks, "buffalo");
        // print2DArray(blanks);

        
        // System.out.println("\nTesting countOccurences\n");
        // int occur = countOccurences(nums, 98);
        // System.out.println("98 occurs " + occur + " times in nums array");
        // occur = countOccurences(words, "Banana");
        // System.out.println("Banana occurs " + occur + " times in words array");

        
        // System.out.println("\nTesting oddsAndEvens\n");
        // oddsAndEvens(nums);
        // print2DArray(nums);

        
        // System.out.println("\nTesting formatter\n");
        // String[][] upperCase = formatter(words, true);
        // String[][] lowerCase = formatter(words, false);
        // print2DArray(upperCase);
        // print2DArray(lowerCase);

        
        // System.out.println("\nTesting driveAllCars\n");
        // Car[][] cars = {{new Car(), new Car(), new Car()},
        //                 {new Car(), new Car(), new Car()},
        //                 {new Car(), new Car(), new Car()},
        //                 {new Car(), new Car(), new Car()}};
        // System.out.println("Before driving: ");
        // for (Car[] row : cars) {
        //     for (Car c : row) {
        //         System.out.print(c.getOdometer() + " ");
        //     }
        //     System.out.println();
        // }

        // driveAllCars(cars, 1000);

        // System.out.println("After driving: ");
        // for (Car[] row : cars) {
        //     for (Car c : row) {
        //         System.out.print(c.getOdometer() + " ");
        //     }
        //     System.out.println();
        // }
        
    }

    /**
     *    Traverse the arr using an index-based for loop
     *    and print each element one row at a time
     */
    public static void print2DArray(String[][] arr) {
        // use index-based for loops here
        
    }

    /**
     *    Traverse the arr using an enhanced for loop
     *    and print each element one row at a time
     */
    public static void print2DArray(int[][] arr) {
        // use enhanced for loops here

    }

    /**
     *    Given the 2D array, fill each element with the value
     */
    public static void fillArray(String[][] arr, String value) {

        
    }

    /**
     *    Traverse the arr using a for loop
     *    and return the number of times num appears
     */
    public static int countOccurences(int[][] arr, int num) {
        
        return 0;
    }

    /**
     *    Traverse the arr using a for loop
     *    and return the number of times str appears
     */
    public static int countOccurences(String[][] arr, String str) {

        return 0;
    }

    /**
     *    Traverse the arr using a for loop
     *    and change all odd numbers to 1 and all even 
     *    numbers to 0
     */
    public static void oddsAndEvens(int[][] arr) {

        
    }

    /**
     *    Traverse the words 2D array using a for loop
     *    and return the a new 2D array where all words have the same casing
     *    if makeUpperCase is true, all words are uppercase, otherwise
     *    all words are lowercase
     */
    public static String[][] formatter(String[][] words, boolean makeUpperCase) {
        
        return new String[0][0];
    }

    /**
     *    Drive all Car objects in cars 2D array the 
     *    same number of miles.
     *    check out the Car.java class to see what method to use
     */
    public static void driveAllCars(Car[][] cars, int miles) {
        // use an enhanced for loop
        
    }
}
