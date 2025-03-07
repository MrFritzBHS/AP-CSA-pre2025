# 2D Array Exercises

This project provides starter code for practicing working with 2D arrays in Java. It includes several methods that you need to implement, covering various operations such as printing, filling, counting occurrences, manipulating elements, and working with objects in a 2D array.

## Methods to Implement

### `print2DArray(String[][] arr)`

-   **Description:** Prints a 2D array of strings to the console, one row per line.
-   **Implementation:** Use nested index-based `for` loops to iterate through each row and column of the array. Print each element followed by a space, and print a newline character at the end of each row.
-   **Example:**
    ```java
    String[][] words = {{"Apple", "Banana"}, {"Cherry", "Date"}};
    print2DArray(words);
    // Output:
    // Apple Banana 
    // Cherry Date 
    ```

### `print2DArray(int[][] arr)`

-   **Description:** Prints a 2D array of integers to the console, one row per line.
-   **Implementation:** Use enhanced `for` loops (for-each loops) to iterate through each row and element of the array. Print each element followed by a space, and print a newline character at the end of each row.
-   **Example:**
    ```java
    int[][] nums = {{1, 2}, {3, 4}};
    print2DArray(nums);
    // Output:
    // 1 2 
    // 3 4 
    ```

### `fillArray(String[][] arr, String value)`

-   **Description:** Fills every element of a 2D array of strings with a given `value`.
-   **Implementation:** Use nested `for` loops to iterate through each element and assign the `value` to it.
-   **Example:**
    ```java
    String[][] blanks = new String[2][2];
    fillArray(blanks, "buffalo");
    print2DArray(blanks);
    // Output:
    // buffalo buffalo 
    // buffalo buffalo 
    ```

### `countOccurences(int[][] arr, int num)`

-   **Description:** Counts the number of times a given `num` appears in a 2D array of integers.
-   **Implementation:** Use nested `for` loops to iterate through each element. If an element is equal to `num`, increment a counter. Return the counter.
-   **Example:**
    ```java
    int[][] nums = {{1, 2, 2}, {2, 3, 4}};
    int count = countOccurences(nums, 2);
    System.out.println(count); // Output: 3
    ```

### `countOccurences(String[][] arr, String str)`

-   **Description:** Counts the number of times a given `str` appears in a 2D array of strings.
-   **Implementation:** Use nested `for` loops to iterate through each element. If an element is equal to `str` (using `equals()` for string comparison), increment a counter. Return the counter.
-   **Example:**
    ```java
    String[][] words = {{"Apple", "Banana"}, {"Banana", "Cherry"}};
    int count = countOccurences(words, "Banana");
    System.out.println(count); // Output: 2
    ```

### `oddsAndEvens(int[][] arr)`

-   **Description:** Modifies a 2D array of integers, changing all odd numbers to 1 and all even numbers to 0.
-   **Implementation:** Use nested `for` loops to iterate through each element. Use the modulo operator (`%`) to check if an element is odd or even. Modify the element accordingly.
-   **Example:**
    ```java
    int[][] nums = {{1, 2}, {3, 4}};
    oddsAndEvens(nums);
    print2DArray(nums);
    // Output:
    // 1 0 
    // 1 0 
    ```

### `formatter(String[][] words, boolean makeUpperCase)`

-   **Description:** Returns a new 2D array of strings where all words have the same casing. If `makeUpperCase` is `true`, all words are uppercase; otherwise, all words are lowercase.
-   **Implementation:** Create a new 2D array with the same dimensions as the input array. Use nested `for` loops to iterate through the input array. If `makeUpperCase` is `true`, convert each word to uppercase using `toUpperCase()`; otherwise, convert it to lowercase using `toLowerCase()`. Store the converted words in the new array. Return the new array.
-   **Example:**
    ```java
    String[][] words = {{"Apple", "Banana"}, {"Cherry", "Date"}};
    String[][] upperCase = formatter(words, true);
    print2DArray(upperCase);
    // Output:
    // APPLE BANANA 
    // CHERRY DATE 
    ```

### `driveAllCars(Car[][] cars, int miles)`

-   **Description:** Drives all `Car` objects in a 2D array of `Car` objects a given number of `miles`.
-   **Implementation:** Use enhanced `for` loops to iterate through each `Car` object in the 2D array. Call the `drive(miles)` method on each `Car` object.
-   **Example:**
    ```java
    Car[][] cars = {{new Car(), new Car()}, {new Car(), new Car()}};
    driveAllCars(cars, 1000);
    // Each car's odometer will be increased by 1000.
    ```
#### Car Class

The `Car.java` file provides a simple `Car` class with the following:

-   A private `odometer` instance variable representing the car's mileage.
-   A constructor `Car()` that initializes the `odometer` to a random integer between 0 and 999.
-   A `drive(int miles)` method to increase the `odometer` by the specified `miles`.
-   A `getOdometer()` method to retrieve the current `odometer` value

## Testing

The `main` method in `Main.java` contains commented-out code that you can uncomment to test your implementations. Each section tests a specific method.

## Example Usage

Uncomment the test code in the `main` method to see examples of how to use each method.
