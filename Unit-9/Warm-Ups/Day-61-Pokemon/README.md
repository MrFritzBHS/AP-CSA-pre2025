# Warm Up - Gotta Extend 'em all

There are many reasons to leverage inheritance in Java. There are also some important concepts to keep in mind.

## Lay of the land

Spend a few moments looking over the `Pokemon` class and the `Pikachu` class. Which is a superclass? Which is a subclass? How do you know?

## Tasks

Complete the following tasks, and perform any necessary troubleshooting:

### Task 1

In the `main` method, create a `Pikachu` object with a `level` of 4. Then call the `attack` method as well as the `levelUp` method.

### Task 2

In the `main` method, create a `Pokemon` object. Use any `name`, `level`, and `type` you wish. Then call the `attack` method as well as the `levelUp` method.

> An example pokemon is "Charmander", 1, "Fire"

### Task 3

Modify the `levelUp` method in the `Pokemon` class so that after increasing the level it outputs something like:
```
"Pikachu has now leveled up to level 6!"
```

### Task 4

In the **both classes**, modify the `attack` method so that it outputs something like:

```
"Level 3 Pikachu attacks with lightning"
"Level 5 Charmander attacks"
```

> Hint: `Pikachu` doesn't have access to `level`, so what method could you create in the `Pokemon` class to access the value?

### Task 5

Create an appropriate `toString` method in the `Pokemon` class. Test the method by printing out both the `Pikachu` and `Pokemon` objects you created earlier.

Example:
```
Level 5 Pikachu - Lightning type
```

## Challenges

1. Add a `toString` method in the `Pikachu` class that *uses* the `toString` method of the superclass and adds `Pika Pika!` at the end of the returned String. (try `super.toString()`)
2. Write an additional subclass of another type of Pokemon and add appropriate methods.
