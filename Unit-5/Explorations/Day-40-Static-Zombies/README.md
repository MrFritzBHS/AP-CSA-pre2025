# Instructions  

Here you'll get some practice with static variables and methods.

## Zombie Class

Open up the `Zombie` class and scan through the code. With a neighbor, identify the following:

1. what `static` variables are used?
2. what `static` methods are used?
3. Why do these need to be `static`?
4. What do you think `this` is being used for? (lines 12 and 13)
5. How does the `oldestAge` varible get updated?
6. How does the `isOldestZombie` method work? Can it be `static`?

## Main class

Run the code in the `main` method and see how it works. Then, complete the tasks as described in lines 23 and on.

## Challenge

When you've finished those tasks add a new feature - *tracking the youngest zombie*. You'll need to:

- add a `static` variable `youngestAge`
- accurately update the `youngestAge` variable in a similar way to how the `oldestAge` variable was updated
- create a method `isYoungestZombie` that returns `true` if the zombie's age is less than or equal to the `youngestAge` static variable
- create a method `getYoungestAge` that returns the value of `youngestAge`
