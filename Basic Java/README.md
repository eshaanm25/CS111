# Hello, world

The purpose of this assignment is to introduce you to programming in Java and to
familiarize you with the process of preparing and submitting programming assignments.
You will learn how to use the VScode editor to edit Java files, use the command line to
compile and execute your programs.

# Programming

1. Hello, World [5 points]. This is everyone’s first program. Write a
    program HelloWorld.java that, when run, displays the phrase: Hello, World.

```
% java HelloWorld
Hello, World
```
2. Wind chill [8 points]. Given the temperature T (in degrees Fahrenheit) and the
    wind speed v (in miles per hour), the National Weather Service defines the
    effective temperature (the wind chill) as follows:
       1. w = 35.74 + 0.6215 T + (0.4275 T _–_ 35.75) v^0.


Write a program WindChill.java that takes two double command-line arguments
temperature and velocity and prints the wind chill. Use Math.pow(a,b) to compute
a^b.

- NOTE 1: a^b means a to the power of b.


- NOTE 2: The formula is not valid if T is larger than 50 in absolute value or if v is
larger than 120 or less than 3 (assume that the input values testing your program
are in range).

- NOTE 3: It is not necessary to round the wind chill value, display the value that is
computed.

```
% java WindChill 35.0 10.
27.
```
3. Order check [7 points]. Write a program OrderCheck.java that takes
    four int command-line arguments w, x, y, and z. Define a boolean variable whose
    value is true if the four values are either in strictly ascending order (w < x < y < z)
    or strictly descending order (w > x > y > z), and false otherwise. Then, display
    the boolean variable value.

- NOTE 1: Do not use if statements on this program.


- NOTE 2: Assume that the inputs will always be integers.

```
% java OrderCheck 5 10 15 2
false
% java OrderCheck 15 11 9 4
true
```

