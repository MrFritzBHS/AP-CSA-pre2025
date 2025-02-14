import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        /*
        TASK 1:
            - Complete the duplicateEvenIntegers method
            - create an ArrayList of mixed Integer object
            - call the method below
        */

        /* 
        TASK 2:
            - complete the searchItems method
            - call the method to test it below
        */

    }

    public static void duplicateEvenIntegers(ArrayList<Integer> arr) {
        /*
            TASK:
            Given an ArrayList arr, duplicate all of the EVEN Integers next to the original.

            Ex:
            arr = {1, 2, 4, 7, 5}
                * becomes *
                  {1, 2, 2, 4, 4, 7, 5}
        */

        // begin below

    }

    public static void searchItems() {
        /*
            1. Create a Scanner object
            2. Using the Scanner obj, ask user to input an itemName
            3. Search ArrayList for an Item with input itemName 
                (look at the Item class to see how to use it)
                if in stock -->
                    - print "UPC <upc>: <itemName> - <num> in stock"
                if not in stock -->
                    - print "<itemName>, not in stock"
        */
        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("Apples", 5));    
        items.add(new Item("Bananas", 6));    
        items.add(new Item("Cherries", 50));    
        items.add(new Item("Donuts", 12));    
        items.add(new Item("Eggs", 24));

        // begin below

    }
}
