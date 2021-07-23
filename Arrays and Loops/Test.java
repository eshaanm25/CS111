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


public class test {
    public static void main (String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {-1,-2,-3,-4};
        System.out.println(absEqual(a,b)); 
    }

    
public static boolean absEqual(int[] a,int[] b)
{
if (a.length!=b.length){
    return false;
}
for (int i=0; i<a.length;i++)
{
    if (a[i]!=b[i]*-1)
    {
        return false;
    }
}
return true;
}
}
