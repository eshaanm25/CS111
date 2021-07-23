/*************************************************************************
 *  Compilation:  javac HadamardMatrix.java
 *  Execution:    java HadamardMatrix 2
 *
 *  @author: Eshaan Mathur em919 em919@rutgers.edu
 *
 * The program HadamardMatrix prints H(n)
 *
 *  % java HadamardMatrix 2
 *  T T
 *  T F
 *
 *************************************************************************/

public class HadamardMatrix {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int count = 1;
        String[][] matrix = new String[count][count];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = "T";
        
                }
            }
        while (count<n)
        {
            String[][] reverse = new String[count][count];
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                        if (matrix[i][j] == "T")
                        {
                            reverse[i][j] = "F";
                        }
                        else if (matrix[i][j] == "F")
                        {
                            reverse[i][j] = "T";
                        }
                    }
                }
            String[][] combo = new String[count*2][count*2];
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                        combo[i][j] = matrix[i][j];
                }
            }
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                        combo[count+i][j] = matrix[i][j];
                }
            }            
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                        combo[i][count+j] = matrix[i][j];
                }
            }  
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                        combo[count+i][count+j] = reverse[i][j];
                }
            }  
            if (count>=n-n/2){
            for(int i = 0; i < combo.length; i++) {
               for(int j = 0; j < combo[i].length; j++) {
                        System.out.print(combo[i][j] + " ");
                
                    }
                    System.out.println();
            }
        }
                    matrix=combo;
                    count*=2;
            }
        if (n==1)
        {
            System.out.println("T");
        }
        }
    }

