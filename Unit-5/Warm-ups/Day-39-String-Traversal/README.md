# String Traversal Warm Up

Time to refresh your memory on string traversals. You'll also be working on what you've learned so far on writing classes. Complete each TODO item as directed.

## TODO 1 - make the instance variable

This class has one instance variable - a `String` called `word`.

## TODO 2 - make the constructors

This class has two constructors:
- a default constructor that assigns the instance variable to an empty string
    - `public WordAnalyzer()`
- a paramterized constructor that sets the word instance variable to the paramter passed to the constructor
    - `public WordAnalyzer(String theWord)`

## TODO 3 - make the accessor method

Create the accessor method `getWord` which returns the value of the `word` instance variable.

## TODO 4 - mutator

Write the mutator method `setWord` which takes a parameter and changes the instance variable to that parameter.

# Run the tests!

You should pass:
- testConstructor
- testDefaultConstructor
- testGetter
- testSetter

## TODO 5 - complete the countAs method

The `countAs` method should return the number of `a`s that occur in the instance variable `word`.

You'll complete this by traversing the String and checking each letter one at a time. Complete the two `/* missing code here */` segments in this method.

- The first `/* missing code here */` represents the number of letters in the word.
- The second `/* missing code here */` represents checking if the letter at index `i` is an `a`.

# Run the tests!

You should now pass 
- testCountAs

Can you figure out how to pass **testCountAsMixedCase**?

## TODO 6 - make the countLetter method

Make the method `countLetter` which takes a String as a parameter and checks the number of occurences in the `word` instance variable.

For example, if the `word` is `"happy"`, then `countLetter("p")` should return `2`

## TODO 7 - the toString method

Write a `toString` method that returns a string of the form: `"The word is: <<word>>"`. For example, if the `word` instance variable is `"noodles"` the `toString` method would return `"The word is: noodles"`

