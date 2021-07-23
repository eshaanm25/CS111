import javax.lang.model.util.ElementScanner6;

/*************************************************************************
 *  Compilation:  javac ISBNChecksum.java
 *  Execution:    java ISBNChecksum 020131452
 *
 *  @author: Eshaan Mathur, eshaan.mathur@rutgers.edu, em919
 *
 *  Takes a 9-digit integer as a command line argument, then computes
 *  and prints the checksum character
 *
 *  % java ISBNChecksum 020131452
 *  5
 *
 *  Print only the checksum character, nothing else.
 *
 *************************************************************************/

public class ISBNChecksum {

    public static void main (String[] args) {
        int checksum = Integer.parseInt(args[0]);
        int[] a = new int[9];
        int[] b = new int[9];
        int sum = 0;
        for (int i = 0; i<9; i++)
            {
                a[i]=checksum%10;
                checksum = checksum/10;
            }
        for (int i = 0; i<9; i++)
            {
                int temp = a[i];
                b[i]=a[8-i];
                b[8-i]=temp;
            }
        for (int i = 0; i<9; i++)
            {
                b[i]=b[i]*(10-i);
            }
        for (int i = 0; i<9; i++)
            {
                sum+=b[i];
            }
        int ans = sum%11;
        ans=11-ans;
        if (ans==10)
            {System.out.println("X");}
        else if (ans==11)
            {ans = 0;
            System.out.println(ans);}
        else
            {System.out.println(ans);}
    }
}