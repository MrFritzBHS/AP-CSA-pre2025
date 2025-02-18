# Linear Search through an ArrayList

In this activity, you'll practice traversing an ArrayList and looking for specific items in a traversal. Complete the tasks as specified.

## Duplicate Even Integers

Complete the `duplicateEvenIntegers` method as specified:

Given an ArrayList `arr`, duplicate all of the EVEN `Integer` values next to the original.

For example `{1, 2, 4, 7, 5}` would be modified to `{1, 2, 2, 4, 4, 7, 5}`

> The method does **not** return a value, but rather it modifies the existing parameter `arr`

### Test your method

In the `main` method, create an ArrayList of `Integer` objects with a mixture of even and odd numbers. Then print the ArrayList before and after passing it to the `duplicateEvenIntegers` method.

## Searching for Items

An ArrayList of `Item` objects has been created and some items have already been added. Complete the method by doing the following:

1. Create a `Scanner` object
2. Using the `Scanner` obj, ask user to input a name of an item
3. Search the ArrayList for an `Item` with an `itemName` that matches the user's input. (Look at the `Item` class to see how to use it)
    - if in stock --> print `"UPC <upc>: <itemName> - <num> in stock"` (Ex: `"UPC 33419406: Apples - 5 in stock"`
    - if not in stock --> print `"<itemName> not in stock"` (Ex: `"Chips not in stock"`)
  
### Test your method

In the `main` method, call the `searchItems` method and ensure it works correctly.
