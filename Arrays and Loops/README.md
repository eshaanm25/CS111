# Arrays and Loops

The purpose of this assignment is to give you extra practice on loops (Random Walker),
one and two-dimensional arrays.

# Programming

1. Two-dimensional random walk (20 points). A two-dimensional random walk
    simulates the behavior of a particle moving in a grid of points. At each step, the
    random walker moves north, south, east, or west with probability equal to 1/4,
    independent of previous moves. Write a program RandomWalker.java that takes
    an int command-line argument n and simulates the motion of a random walk
    for n steps. Print the location at each step (including the starting point), treating
    the starting point as the origin (0,0). Also, print the square of the final squared
    Euclidean distance from the origin as double.

```
Note: you do not need arrays for this problem, just keep track of the x and y
coordinates during the random walk.
```
```
% java RandomWalker 20
(0,0)
(0,1)
(-1,1)
(-1,2)
(0,2)
(1,2)
(1,3)
(0,3)
(1,3)
(2,3)
(3,3)
(3,2)
(4,2)
(4,1)
(3,1)
(3,0)
(4,0)
(4,1)
(3,-1)
(3,-2)
(3,-3)
Squared distance = 18.
```
2. Find a duplicate (10 points). Write a program FindDuplicate.java that
    reads n integer arguments from the command line into an integer array of
    length n, where each value is between is 1 and n, and displays true if there are
    any duplicate values, false otherwise.

```
% java FindDuplicate 2 10 8 5 4 1 3 6 7 9
false
```
```
% java FindDuplicate 4 5 2 1 2
true
```
3. Hadamard matrix (20 points). The n-by-n Hadamard matrix H(n) is a boolean
    matrix with the remarkable property that any two rows differ in
    exactly n/2 values. H(1) is a 1-by-1 matrix with the single element true, and
    for n>1, H(2n) is obtained by aligning four copies of H(n) in a large square, and
    then inverting all of the values in the lower right n-by-n copy, as shown in the
    following examples (with T representing true and F representing false).

H(1)

- T

H(2)

- T T

- T F

H(4)

- T T T T

- T F T F

- T T F F

- T F F T


Write a program HadamardMatrix.java that takes an int command-line
argument n and prints H(n). Assume that n is a power of 2.


```
% java HadamardMatrix 2
T T
T F
% java HadamardMatrix 4
T T T T
T F T F
T T F F
T F F T
```


