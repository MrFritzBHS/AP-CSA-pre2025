# Challenge Instructions

After completing **each** challenge make sure you run the Unit Tests found by clicking the checkmark to your left <--

## Challenge 1

Given a `String[]` array `arr` and a String `letter`, traverse the array and return a result `String`. The string should be a concatenated string of every element that begins with the identified `letter`. **Each word should be separated by a space**

For example, if:

- `arr` is `{ "blue", "black", "yellow", "red" }` and 
- `letter` is `"b"` then return the String:

>`"blue black"`

<details>
  <summary>Click for a Hint</summary>

  Create an empty "result" string *before* your traversal. Then, traverse the array. When you encounter the letter, concatenate it to the result string.


</details>

## Challenge 2

Given an `int[]` array of numerical grades, return an `int[]` array with 4 elements containing the number of A's B's C's and F's. (90-100, 80-89, 70-79, 0-69)

For example, if:

- `arr` is `{ 90, 80, 70, 60, 92 }` return the `int[]` array:

> `{2, 1, 1, 1}`

## Challenge 3

Given a `String[]` array, return a `String[]` array which is a subset of the original array. The returned array only contains elements with an `"!"` in them.

For example, if:

- `arr` is `{ "I", "like!", "ice! cream!" }`, return the `String[]` array: 

> `{ "like!", "ice! cream!" }`

<details>
  <summary>Click for a Hint</summary>

  You will need two loops for this one:
  - one to count the number of `!` in the original array
  - one to assign the values of the new array of Strings

 
</details>

<details>
  <summary>I need another hint...</summary>

  1. Your first loop will traverse the original array, and count the number of `!` that appear in the array.
  2. You'll need to create a new array of a size equal to the count of `!`
  3. Traverse the original array again, but this time, when encountering an `!`, put it in the new array. You'll need to keep track of the index of the new array while you do this.


</details>

## Challenge 4

Given two `String[]` arrays, combine the elements into a `"key: value"` pairing and return a new `String[]` array.

For example, if:

- `arr1` is `{"a", "b", "c"}` and
- `arr2` is `{"1, "2", "3"}`, then return the `String[]` array:

> `{"a: 1", "b: 2", "c: 3"}`

If the two incoming arrays are different in length, return an empuhtee String array.

<details>
  <summary>Click for a Hint</summary>

  The indexes of each array correspond with each other. So `arr1[0]` should be joined with `arr2[0]`


</details>
