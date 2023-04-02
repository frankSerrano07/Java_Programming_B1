package my_util;

public class StringUtil {

    /* reverse
     create a method that will accept a String and return the Reverse String
     */

    /**
     * this method created by loop camp folks bach#1
     */

    public static String reverseStr(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    /***
     * this method by loop camp Batch#1
     * this method accepts a String parameter and puts it in a format
     * Ex:
     *    The format will be like this
     *
     *    first letter is in upper case and rest is in lower case
     *
     *    the return a string in a formatted way
     */

    public static String fixFormat(String str) {
          String fixed = str.trim();
         fixed = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
               return  fixed;
    }


}