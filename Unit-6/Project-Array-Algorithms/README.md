# Mini-Project Instructions

In this project, you will use various array skills to construct several "helper" functions. You will need to plan out the algorithms necessary; it's best to start with pencil and paper before jumping straight to code!

## Static methods

Each of the `ArrayAlgorithm` methods will be `static`. You should test your algorithms as you create them inside of the `main` method in the `Main` class.

## Use your methods

Some methods you create may be helpful when creating other algorithms. It is *encouraged* that you use `ArrayAlgorithm` methods you've already created. *Don't recreate the same algorithm twice!*

## The methods

The methods you can choose from are:

- `printArray`
- `copyArray`
- `countOccurences`
- `removeItems`
- `removeDuplicates`
- `splitString`
- `doubleArray`
- `cumulativeSum`
- `shiftArray`

## Requirements

- You must complete the `printArray` methods
- You must complete at least **5** out of the remaining **8** possible algorithms. (So you will complete a total of 6 methods)
- all of the methods in the `ArrayAlgorithms` class must have the appropriate *method signature* so that they can be called from the `Main` class *without* instantiating an object.
- You must identify the five selected algorithms you wish to be graded by including the comment `/* TO BE GRADED */` before the method signature

# The Algorithms 

Below is a description of each of the algorithms to choose from.

## `printArray`

Print each item in the array which is passed as a parameter. Use a `for-each` loop to print the items.

**Overload this method** by creating one that prints each item of an `int[]` array and one that prints a `String[]` array. This will be helpful to you checking the other algorithms.

## `copyArray`

This method takes an array as a parameter and returns a **copy** of that array. Note that a copy is NOT an alias.

**Overload this method** to work with both `String[]` arrays and `int[]` arrays.

## `countOccurences`

Given an array and a target item, identify and **return** the number of times the target occurs within the array.

**Overload this method** by creating one that counts each item of an `int[]` array and one that counts a `String[]` array.

## `removeItems` 

This method takes two parameters: a `String[]` array and a target `String` to remove from the array. 

It **returns** a `String[]` array with the target removed.

## `removeDuplicates`

This method takes a `String[]` array parameter, and it will then identify and remove all duplicate `String`s. 

**return** the reduced `String[]` array.

## `splitString`

This method takes two parameters: a **raw** `String` and a **delimeter** `String`. The method will split the **raw** `String` at each occurence of the **delimeter** `String`

**return** a `String[]` array of the split `String` *without* the delimeter `String`

For example:

 |||
|:-:|:-:|
|**raw String**|`"Hi,how,are,you?"`|
|**delimeter**|`","`|
|**returned array**|`{ "Hi", "how", "are", "you?" }`|

## `doubleArray`

This method takes a `PinballMachine[]` array and **returns** a `PinballMachine[]` array which is twice as long. Each odd-indexed `PinballMachine` object is a **copy** of the previous even-indexed `PinballMachine` object.

For example:

 |||
|:-:|:-:|
|Array passed as parameter|`{ PMObj1, PMObj2, PMObj3 }`|
|Array returned|`{ PMObj1, PMObj1COPY PMObj2, PMObj2COPY PMObj3, PMObj3COPY }`|

> You will need to take a look at the `PinballMachine` class to understand how to do this.

## `cumulativeSum`

This method takes an `int[]` array and **returns** an equal-length array which reflects the cumulative sum of the inital array for each corresponding index.

For example:

- **parameter array** --> `{1, 2, 3, 4}`
- **returned array** --> `{1, 3, 6, 10}`

|index|`int[]` param|returned `int[]`|explanation|
|:-:|:-:|:-:|:-:|
|0|1|1|1 = 1|
|1|2|3|1 + 2 = 3|
|2|3|6|1 + 2 + 3 = 6|
|3|4|10|1 + 2 + 3 + 4 = 10|

## `shiftArray`

This method takes two parameters: an `int[]` array and an `int n`. It **returns** an `int[]` array in which all of the items have shifted to the right by `n` spaces. Items will "wrap around" to the beginning if they exceed the end of the array.

For example:

- **param array** --> `{ 1, 2, 3, 4, 5 }`
- **n** --> `2`
- **returned array** --> `{ 4, 5, 1, 2, 3 }`
