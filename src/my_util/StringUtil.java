package my_util;

public class StringUtil {

    /* reverse
     create a method that will accept a String and return the Reverse String
     */
    /** this method created by loop camp folks bach#1*/

    public static String reverseStr(String str) {
        String reversed  ="";
        for (int i =  str.length()-1; i>=0; i--) {
            reversed +=str.charAt(i);
        }
         return reversed;
    }
}
