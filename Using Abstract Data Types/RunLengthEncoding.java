/*************************************************************************
 *  Compilation:  javac RunLengthEncoding.java
 *  Execution:    java RunLengthEncoding
 *
 *  @author:
 *
 *************************************************************************/

public class RunLengthEncoding {

    /* 
     * Encode the original string by finding sequences in the string
     * where the same character repeats. Replace each such sequence
     * by a token consisting of: the number of characters in the sequence
     * followed by the repeating character.
     * Return the encoded string.
     */
    public static String encode (String original)  {
        int counter = 1;
        int counter2 = 0;
        String hello = "";
        for (int i=1; i<original.length()-1; i++){
            if (original.charAt(i) == original.charAt(i-1)){
                counter++;
                counter2++;
            }
            else {
                if (counter==1){
                    hello = hello + original.charAt(counter2);
                }
                else{
                hello = hello + counter + original.charAt(counter2);
            }
                counter=1;
                counter2++;
            }
        }
        if (original.charAt(original.length()-1) == original.charAt(original.length()-2)){
        counter++;
        if (counter==1){
            hello = hello + original.charAt(counter2);
        }
        else{
        hello = hello + counter + original.charAt(counter2);
        }
    }
        else{
            hello = hello + counter+ original.charAt(counter2) + original.charAt(original.length()-1);
        }
        return hello;
    }

    /*
     * Decodes the original string encoded with the encode method.
     * Returns the decoded string.
     *
     * YOUR decode METHOD MUST BE RECURSIVE, do not use while, do/while, 
     * or for loops
     */
    public static String decode (String original)  {
        if (original.length()<2){
            return original;
        }
        char firstDigit = original.charAt(0);
        char character = original.charAt(1);
        if(Character.isDigit(firstDigit)){
            if (firstDigit=='0'){
                return decode(original.substring(2));
            }
            else{
                return character + decode((firstDigit - '0' - 1) + original.substring(1));
            }
        }
        else{
            return firstDigit + decode (original.substring(1));

        }
    }

    public static void main (String[] args) {
        System.out.println(decode("q9w5e2rt5y4qw2Er3T"));
        System.out.println(encode("qwwwwwwwwweeeeerrtyyyyyqqqqwEErTTT"));
    }
}
