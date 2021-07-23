/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author: Eshaan Mathur, eshaan.mathur@rutgers.edu, em919
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String[] args) {
        int[] a = new int[5];
        int max = Integer.MIN_VALUE;
        a[0] = Integer.parseInt(args[0]);
        a[1] = Integer.parseInt(args[1]);
        a[2] = Integer.parseInt(args[2]);
        a[3] = Integer.parseInt(args[3]);
        a[4] = Integer.parseInt(args[4]);
        for (int i=0; i<5; i++)
            {
                if (a[i]>max)
                    {
                        max=a[i];
                    }
            }
        System.out.println(max);
    }
}