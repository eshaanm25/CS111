/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author: Eshaan Mathur em919 em919@rutgers.edu
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class FindCopy {

    public static void main(String[] args) {
        int[] values = {1,1,2,3,1,5,1,1,7,7,7,7,1,1,1,1,1,1};
        for (int i=0; i<values.length-1; i++)
        {
            if (values[i]!=values[i+1])
            {
                System.out.println(values[i]+"");
            }
        }
        System.out.println(values[values.length-1]);

    }
}
