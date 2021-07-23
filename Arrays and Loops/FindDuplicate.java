/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author: Eshaan Mathur em919 em919@rutgers.edu
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9 2
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 2
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {
        int n = args.length;
        int [] numbers = new int[n];
        int ruleOne = 1;

    for (int i = 0; i<n; i++)
    {
        numbers[i] = Integer.parseInt(args[i]);
    }

        for(int num =0; num<n; num++)
        {
            for (int compare=1+num; compare<n;compare++)
            {
                if (numbers[num]==numbers[compare])
                {
                    ruleOne=0;
                }
            }
        }

    if (ruleOne == 0)
    {
        System.out.println("true");

    }
    else 
    {
        System.out.println("false");
    }
    }

	}
