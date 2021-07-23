# Conditionals and Loops

The purpose of this assignment is to practice conditionals and loops. You will write Java
programs for two algorithms using if-else, while and or for loops.

# Programming


1. Largest of five ( 15 points). Write an algorithm that reads 5 distinct integers and
    displays the largest value. Assume the input values are distinct integers.

```
% java LargestOfFive 17 23 5 1 6
23
% java LargestOfFive 8 3 -8 4 1
8
```
2. ISBN checksum ( 20 points). Write a program ISBNChecksum.java that takes a 9-
    digit int as a command-line argument and displays the checksum digit according
    to the following rules:
- Multiply the first digit by 10, the second by 9, the third by 8, and so on, down to
    the ninth digit by 2.
- Add the values together.
- Divide the sum by 11. What is the remainder?
- If the remainder is 0, the checksum is 0; otherwise, subtract the remainder from
    11 to get the checksum digit.
- If the checksum that you come up with is 10, then X is used as the checksum
    digit!


- As an example, the checksum digit corresponding to 020131452 is 5 since 5 is
    the only value of x between 0 and 10 for which10*0 + 9*2 + 8*0 + 7*1 + 6*3 + 5*
    + 4*4 + 3*5 + 2*2 + 1*x is a multiple of 11.
- Hint 1: to extract the rightmost digit of a number use the modulus operator.
- Hint 2: to remove the rightmost digit of a number use the integer division by 10
- Hint 3: for full credit use a loop to compute the sum
- Assume the input value used to test your program is a 9-digit positive integer.
    Also assume that the input is a valid ISBN number without the checksum digit.

```
% java ISBNChecksum 313481157
X
% java ISBNChecksum 153296217
7
```

