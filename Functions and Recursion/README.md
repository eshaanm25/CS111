# Functions and Recursion 

**Asignment best viewed on PDF attached**

This assignment consists of two parts. First, write a library of static methods that
performs geometric transforms on polygons. Next, write a program that plots
a Sierpinski triangle.

# Programming

1. Polygon transform (25 points). Write a library of static methods that performs
    various geometric transforms on polygons. Mathematically, a polygon is defined
    by its sequence of vertices (x0, y 0), (x 1, y 1), (x 2, y 2), .... In Java, we will
    represent a polygon by storing the x– and y-coordinates of the vertices in two
    parallel arrays x[] and y[].

Three useful geometric transforms are scale, translate and rotate.

Scale the coordinates of each vertex (x i, y i) by a factor α.
- x‘i = α xi
- y‘i = α yi

Translate each vertex (x i, y i) by a given offset (dx, dy).
- x‘i = xi + dx
- y‘i = yi + d

Rotate each vertex (x i, y i) by θ degrees counterclockwise, around the origin.
- x‘i = xi cos θ – yi sin θ
- y‘i = yi cos θ + xi sin θ
Write a two-dimensional transformation library by implementing the following API:


3. Sierpinski (30 points). The Sierpinski triangle is an example of a fractal pattern
    like the H-tree pattern from Section 2.3 of the textbook.


The Polish mathematician Wacław Sierpiński described the pattern in 1915, but it
has appeared in Italian art since the 13th century. Though the Sierpinski triangle
looks complex, it can be generated with a short recursive function. Your main
task is to write a recursive function sierpinski() that plots a Sierpinski triangle of
order n to standard drawing. Think recursively: sierpinski() should draw one filled
equilateral triangle (pointed downwards) and then call itself recursively three
times (with an appropriate stopping condition). It should draw 1 filled triangle for n
= 1; 4 filled triangles for n = 2; and 13 filled triangles for n = 3; and so forth.

API specification. When writing your program, exercise modular design by organizing it
into four functions, as specified in the following API:

Restrictions: You may not change either the scale or size of the drawing window.


