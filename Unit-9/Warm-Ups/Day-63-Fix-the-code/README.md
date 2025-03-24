# Fix the code

In this exercise, a `Student` object is a subclass of `Person` and should thus inherit it's methods and instance variables. When everything is running correctly, it *should* print:

```
---Printing Person Object:---
Name: Ryan
Birthday: 2/2/1990

---Printing Student Object:---
Name: Emma
Grade: 11
```

Unfortunately, there are some errors in the code. Find them and fix them!

## Overriding

The focus here is on *overriding* superclass methods. In order to override a superclass method, you need to have a matching method signatrue in the subclass.

The `Student` method `toString` should override the `Person` `toString` method, but it's not working.

Start there.
